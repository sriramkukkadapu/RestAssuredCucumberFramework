# Runner class for cucumber

```java
@RunWith(Cucumber.class)
@CucumberOptions( 
			features = "src/test/java/features",
			glue = {"stepDefinitions"}
		)
public class TestRunner {

}
```
