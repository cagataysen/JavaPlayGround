

---

# [[Logger]] Usage and Best Practices

## 1. Basic Logging (`java.util.logging`)

[[Java]]’s standard library, `java.util.logging`, provides basic logging capabilities without requiring any additional frameworks.

### Code Example

```java
import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleLogging {
    private static final Logger logger = Logger.getLogger(SimpleLogging.class.getName());

    public static void main(String[] args) {
        logger.info("This is an info message");
        logger.warning("This is a warning message");
        logger.severe("This is a severe error message");

        try {
            throw new Exception("This is an exception");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Exception occurred", e);
        }
    }
}
```

## 2. SLF4J and Logback

SLF4J (Simple Logging Facade for Java) and Logback are used for more advanced and flexible logging needs. SLF4J provides a logging API and works with various logging implementations like Logback.

### Maven Dependencies

Add the following dependencies to your `pom.xml`:

```xml
<dependency>
    <groupId>org.slf4j</groupId>
    <artifactId>slf4j-api</artifactId>
    <version>2.0.0</version>
</dependency>
<dependency>
    <groupId>ch.qos.logback</groupId>
    <artifactId>logback-classic</artifactId>
    <version>1.4.0</version>
</dependency>
```

### Code Example

```java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdvancedLogging {
    private static final Logger logger = LoggerFactory.getLogger(AdvancedLogging.class);

    public static void main(String[] args) {
        logger.info("This is an info message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");

        try {
            throw new Exception("This is an exception");
        } catch (Exception e) {
            logger.error("Exception occurred", e);
        }
    }
}
```

## 3. Log4j

Log4j is another popular logging library and is often used with SLF4J.

### Maven Dependencies

Add the following dependencies to your `pom.xml`:

```xml
<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-api</artifactId>
    <version>2.20.0</version>
</dependency>
<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-core</artifactId>
    <version>2.20.0</version>
</dependency>
```

### Code Example

```java
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jExample {
    private static final Logger logger = LogManager.getLogger(Log4jExample.class);

    public static void main(String[] args) {
        logger.info("This is an info message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");

        try {
            throw new Exception("This is an exception");
        } catch (Exception e) {
            logger.error("Exception occurred", e);
        }
    }
}
```

## Logger and Error Management

Using a logger is crucial for managing errors and debugging. `logger.error` is generally used for error situations, while `logger.info` provides informational messages.

### Example Scenario: Error and Logging

```java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BookService {
    private static final Logger logger = LoggerFactory.getLogger(BookService.class);

    public Book getBookById(Long id) {
        logger.info("Fetching book with id: {}", id);
        try {
            return bookRepository.findById(id)
                    .orElseThrow(() -> {
                        throw new BookNotFoundException("Book not found with id: " + id);
                    });
        } catch (BookNotFoundException e) {
            logger.error("An error occurred while fetching book with id: {}. Error: {}", id, e.getMessage());
            throw e; // Re-throw the exception
        }
    }
}
```

### Console and Log File Outputs

**Console Output**:
```
INFO  [2024-08-19 10:00:00] com.example.bookmanagement.service.BookService - Fetching book with id: 123
ERROR [2024-08-19 10:00:05] com.example.bookmanagement.service.BookService - An error occurred while fetching book with id: 123. Error: Book not found with id: 123
```

**Log File**:
Logs similar information to a file, which can be useful for long-term storage and analysis.

## Best Practices

1. **Level Selection**:
    - **ERROR**: For critical errors.
    - **WARN**: For potential issues or warnings.
    - **INFO**: For general informational messages.
    - **DEBUG**: For detailed information, usually during development.
    - **TRACE**: For the most detailed information, used for low-level tracing.

2. **Avoid Logging Sensitive Information**: Avoid logging personal data or sensitive information like passwords.

3. **Log Rotation and Management**: Use log rotation and management tools to handle log file sizes and archival.

4. **Centralized Logging**: Collect logs in a centralized location for easier analysis and monitoring.

5. **Comprehensive Logging**: Log sufficient information about processes and critical paths but avoid logging excessive or redundant information.

---
