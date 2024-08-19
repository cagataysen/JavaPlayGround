# 📚 Logging in Java Spring Boot

## 1. Where to Log in Java Spring Boot

### Strategic Placement
- **Application Startup and Shutdown**
    - Log when your application starts and stops.
  ```java
  logger.info("Application started successfully.");
  logger.info("Application is shutting down.");
  ```

- **Error Handling**
    - Always log exceptions and errors to pinpoint failure points.
  ```java
  try {
      // some code
  } catch (Exception e) {
      logger.error("An error occurred: ", e);
  }
  ```

- **Important Business Logic**
    - Log significant events in your business logic to track the application’s behavior.
  ```java
  logger.info("User {} has logged in.", userId);
  ```

- **External System Interactions**
    - Log interactions with external systems (e.g., APIs, databases) for transparency.
  ```java
  logger.debug("Sending request to external API: {}", requestPayload);
  logger.debug("Received response from external API: {}", responsePayload);
  ```

## 2. What to Log and What Not to Log in Java Spring Boot

### What to Log
- **Errors and Exceptions**
    - Always log these with stack traces.
  ```java
  logger.error("Exception occurred while processing request: ", exception);
  ```

- **Significant State Changes**
    - Capture major state transitions in your application.
  ```java
  logger.info("Order status changed from {} to {}", oldStatus, newStatus);
  ```

- **Performance Metrics**
    - Track the time taken for performance-critical sections.
  ```java
  long startTime = System.currentTimeMillis();
  // code execution
  long endTime = System.currentTimeMillis();
  logger.info("Execution time for methodX: {} ms", (endTime - startTime));
  ```

- **User Actions**
    - Log important user actions for auditing purposes.
  ```java
  logger.info("User {} performed action {}", userId, action);
  ```

### What Not to Log
- **Sensitive Information**
    - Avoid logging sensitive data like passwords, credit card numbers, or personal information.
  ```java
  // Bad practice
  logger.info("User password: {}", password);
  ```

- **Excessive Detail**
    - Avoid logging overly detailed information that can clutter your logs. Avoid logging every variable and every method call unless necessary for debugging.

## 3. Understanding Log Levels in Java Spring Boot

Log levels define the severity or importance of the messages. The log levels, from most to least severe, are:

- **ERROR**: Indicates serious problems that need immediate attention.
  ```java
  logger.error("Failed to process transaction {}", transactionId, exception);
  ```

- **WARN**: Indicates potentially harmful situations.
  ```java
  logger.warn("Memory usage is high: {}%", memoryUsage);
  ```

- **INFO**: Provides informational messages that highlight the progress of the application.
  ```java
  logger.info("Service started on port {}", port);
  ```

- **DEBUG**: Provides fine-grained informational events that are most useful to debug an application.
  ```java
  logger.debug("Fetching user details for userId: {}", userId);
  ```

- **TRACE**: Provides very detailed logging information, finer than DEBUG.
  ```java
  logger.trace("Starting methodX with parameters: {}", params);
  ```

## 4. Configuring Log Levels in Spring Boot

You can configure log levels in Spring Boot using the `application.properties` or `application.yml` file.

### Using `application.properties`
```properties
# Set the root logging level
logging.level.root=INFO

# Set logging levels for specific packages
logging.level.com.example=DEBUG
```

### Using `application.yml`
```yaml
logging:
  level:
    root: INFO
    com.example: DEBUG
```

### Enabling and Disabling Specific Log Levels

- **Enable DEBUG Logging for a Specific Package**
  ```properties
  logging.level.com.example=DEBUG
  ```

- **Exclude TRACE Logs**
  ```properties
  logging.level.com.example=INFO
  ```

### Example Scenarios
- **Enabling DEBUG Logging**
  ```properties
  logging.level.com.example=DEBUG
  ```
  *What gets printed?* DEBUG, INFO, WARN, and ERROR messages for the `com.example` package.

- **Enabling TRACE Logging**
  ```properties
  logging.level.com.example=TRACE
  ```
  *What gets printed?* TRACE, DEBUG, INFO, WARN, and ERROR messages for the `com.example` package.

- **Setting Root Logging Level to WARN**
  ```properties
  logging.level.root=WARN
  ```
  *What gets printed?* Only WARN and ERROR messages for the entire application unless overridden for specific packages.

- **Different Logging Levels for Different Packages**
  ```properties
  logging.level.root=WARN
  logging.level.com.example.service=DEBUG
  logging.level.com.example.controller=INFO
  ```
  *What gets printed?*
    - WARN and ERROR messages for the entire application.
    - DEBUG, INFO, WARN, and ERROR messages for `com.example.service`.
    - INFO, WARN, and ERROR messages for `com.example.controller`.

## 5. Dynamically Changing Log Levels in Spring Boot

Spring Boot’s actuator provides a way to dynamically change log levels without restarting the application.

### Add Actuator Dependency
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```

### Enable Loggers Endpoint
```properties
management.endpoints.web.exposure.include=loggers
```

### Change Log Levels via HTTP POST Request
```sh
curl -X POST "http://localhost:8080/actuator/loggers/com.example" -H "Content-Type: application/json" -d '{"configuredLevel":"DEBUG"}'
```
This will set the logging level for `com.example` to DEBUG.

## Best Practices for Logging in Java Spring Boot

- **Use a Consistent Format**: Ensure your log messages follow a consistent format for easier parsing.
  ```java
  logger.info("Order ID: {}, Status: {}", orderId, status);
  ```

- **Use Structured Logging**: Where possible, use structured logging to enable easy parsing and searching.
  ```json
  {
    "timestamp": "2024-08-06T12:34:56.789Z",
    "level": "INFO",
    "message": "Order processed successfully",
    "orderId": 12345,
    "status": "COMPLETED"
  }
  ```

- **Avoid Logging in Tight Loops**: Logging inside tight loops can significantly impact performance.
  ```java
  // Instead of logging inside a loop, aggregate and log once outside the loop
  ```

- **Log at the Appropriate Level**: Use the appropriate log level for the message you’re logging to avoid clutter and maintain log clarity.
  ```java
  logger.debug("Debugging information for methodX: {}", details);
  logger.warn("Potential issue detected with methodY");
  ```

- **Regularly Review Logs**: Periodically review your log statements to ensure they are still relevant and useful.

## Example of Logging in Spring Boot

Here’s a practical example of setting up and using logging in a Spring Boot application:

### Add the Logging Dependency
Spring Boot uses Logback by default, so no additional dependencies are required.

### Configure Logging Levels in `application.properties`
```properties
logging.level.root=INFO
logging.level.com.example.myapp=DEBUG
```

### Write Log Statements in Your Code
```java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private static final Logger logger = LoggerFactory.getLogger(MyController.class);

    @GetMapping("/hello")
    public String hello() {
        logger.info("Hello endpoint was called");
        try {
            // Some business logic
            logger.debug("Business logic executed successfully");
            return "Hello, World!";
        } catch (Exception e) {
            logger.error("Error occurred while processing hello endpoint", e);
            throw e;
        }
    }
}
```
