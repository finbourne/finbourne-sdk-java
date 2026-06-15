# com.finbourne.sdk.services.access.model.HowSpec
classname HowSpec

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** |  | [optional] [default to String]
**parameters** | [**List&lt;KeyValuePairOfStringToString&gt;**](KeyValuePairOfStringToString.md) |  | [optional] [default to List<KeyValuePairOfStringToString>]

```java
import com.finbourne.sdk.services.access.model.HowSpec;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable List<KeyValuePairOfStringToString> parameters = new List<KeyValuePairOfStringToString>();


HowSpec howSpecInstance = new HowSpec()
    .type(type)
    .parameters(parameters);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)