# com.finbourne.sdk.services.workflow.model.ParameterValue
classname ParameterValue
Defines a Parameter Value

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name | [default to String]
**value** | **Object** | Value which can be a String, Boolean, Decimal or DateTime (ISO 8601) | [optional] [default to Object]

```java
import com.finbourne.sdk.services.workflow.model.ParameterValue;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
@javax.annotation.Nullable Object 

ParameterValue parameterValueInstance = new ParameterValue()
    .name(name)
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)