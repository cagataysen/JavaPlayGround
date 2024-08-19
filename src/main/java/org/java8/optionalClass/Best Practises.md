### 1. **Finding a User by ID in a Repository (Spring Data JPA Example)**

When querying a database, it's common to check if a record exists. Instead of returning `null`, we can return an `Optional` to indicate that the result might not be present.

```java
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

// Repository Interface
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}

// Service Layer
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void printUserDetails(String username) {
        Optional<User> userOptional = userRepository.findByUsername(username);

        // Handle if the user is present or not
        userOptional.ifPresentOrElse(
            user -> System.out.println("User found: " + user.getName()),
            () -> System.out.println("User not found")
        );
    }
}
```

### 2. **Reading Configuration Properties**

When reading properties, some values might be optional, especially in a configuration file or environment variables.

```java
import java.util.Optional;

public class ConfigService {

    private Properties properties;

    public ConfigService() {
        properties = new Properties();
        // Load properties from a file or environment
    }

    public Optional<String> getProperty(String key) {
        return Optional.ofNullable(properties.getProperty(key));
    }

    public String getDatabaseUrl() {
        return getProperty("database.url").orElse("jdbc:mysql://localhost:3306/default");
    }
}
```

In this example, if the `database.url` property is not set, a default value is returned.

### 3. **Processing HTTP Requests in a Spring Controller**

In web applications, parameters might be optional. `Optional` can be used to handle these cases elegantly.

```java
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
public class ProductController {

    @GetMapping("/products")
    public String getProducts(@RequestParam Optional<String> category) {
        return category
            .map(cat -> "Showing products in category: " + cat)
            .orElse("Showing all products");
    }
}
```

In this case, if the `category` parameter is provided, it filters products by that category; otherwise, it shows all products.

### 4. **Processing User Input**

When dealing with user input (e.g., from a form), some fields might be optional:

```java
import java.util.Optional;

public class UserInputService {

    public void processUserInput(String name, String email, String phoneNumber) {
        Optional<String> optionalEmail = Optional.ofNullable(email);
        Optional<String> optionalPhone = Optional.ofNullable(phoneNumber);

        optionalEmail.ifPresentOrElse(
            e -> System.out.println("Processing email: " + e),
            () -> System.out.println("Email is missing")
        );

        optionalPhone.ifPresentOrElse(
            p -> System.out.println("Processing phone number: " + p),
            () -> System.out.println("Phone number is missing")
        );
    }
}
```

### 5. **Avoiding Nested `if-else` Blocks**

In scenarios where multiple conditions need to be checked, `Optional` helps avoid deep nesting.

```java
import java.util.Optional;

public class AuthenticationService {

    public Optional<User> authenticate(String username, String password) {
        return findUserByUsername(username)
            .filter(user -> user.getPassword().equals(password));
    }

    private Optional<User> findUserByUsername(String username) {
        // Simulate a database lookup
        if ("admin".equals(username)) {
            return Optional.of(new User("admin", "password123"));
        }
        return Optional.empty();
    }
}

// Usage
public static void main(String[] args) {
    AuthenticationService authService = new AuthenticationService();
    Optional<User> user = authService.authenticate("admin", "password123");

    user.ifPresentOrElse(
        u -> System.out.println("Welcome " + u.getUsername()),
        () -> System.out.println("Authentication failed")
    );
}
```

### 6. **Handling APIs that Might Return `null` (Legacy Code Interfacing)**

Sometimes you work with older libraries that return `null`, and `Optional` can help safely work with those results.

```java
public class LegacyService {

    public String getLegacyData() {
        // Simulates returning null from an older library
        return null;
    }
}

// Modern Wrapper
public class ModernService {

    private final LegacyService legacyService;

    public ModernService(LegacyService legacyService) {
        this.legacyService = legacyService;
    }

    public Optional<String> getData() {
        return Optional.ofNullable(legacyService.getLegacyData());
    }
}

// Usage
public static void main(String[] args) {
    LegacyService legacyService = new LegacyService();
    ModernService modernService = new ModernService(legacyService);

    String data = modernService.getData()
        .orElse("Default Data");

    System.out.println(data);  // Output: Default Data
}
```

### 7. **Using `Optional` with Streams**

When processing collections, combining `Optional` and `Stream` operations can be powerful:

```java
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        Optional<String> foundName = names.stream()
            .filter(name -> name.startsWith("C"))
            .findFirst();

        foundName.ifPresent(name -> System.out.println("Found: " + name));
    }
}
```
