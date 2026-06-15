# com.finbourne.sdk.services.scheduler.model.ArgumentDefinition
classname ArgumentDefinition
Job argument definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataType** | **String** | Data type of the argument | [default to String]
**required** | **Boolean** | Optionality of the argument | [optional] [default to Boolean]
**description** | **String** | Argument description | [default to String]
**order** | **Integer** | The order of the argument | [default to Integer]
**constraints** | **String** | Constrains of the argument value | [optional] [default to String]
**passedAs** | **String** | Specifies how this argument should be passed in Allowed values are: CommandLine or EnvironmentVariable  Defaults to: CommandLine | [default to String]
**defaultValue** | **String** | Specify a default value for this argument if no value is provided The value needs to be convertible to the associated data type | [optional] [default to String]

```java
import com.finbourne.sdk.services.scheduler.model.ArgumentDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String dataType = "example dataType";
Boolean required = true;
String description = "example description";
Integer order = new Integer("100.00");
@javax.annotation.Nullable String constraints = "example constraints";
String passedAs = "example passedAs";
@javax.annotation.Nullable String defaultValue = "example defaultValue";


ArgumentDefinition argumentDefinitionInstance = new ArgumentDefinition()
    .dataType(dataType)
    .required(required)
    .description(description)
    .order(order)
    .constraints(constraints)
    .passedAs(passedAs)
    .defaultValue(defaultValue);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)