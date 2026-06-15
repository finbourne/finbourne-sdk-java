# com.finbourne.sdk.services.workflow.model.Parameter
classname Parameter
Defines a Worker Parameter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of this Parameter | [default to String]
**name** | **String** | Name | [default to String]
**displayName** | **String** | DisplayName | [optional] [default to String]
**description** | **String** | Description | [optional] [default to String]
**required** | **Boolean** | Required or not | [default to Boolean]
**defaultValue** | **String** | DefaultValue | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.Parameter;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
String name = "example name";
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
Boolean required = true;
@javax.annotation.Nullable String defaultValue = "example defaultValue";


Parameter parameterInstance = new Parameter()
    .type(type)
    .name(name)
    .displayName(displayName)
    .description(description)
    .required(required)
    .defaultValue(defaultValue);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)