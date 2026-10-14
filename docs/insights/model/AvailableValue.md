# com.finbourne.sdk.services.insights.model.AvailableValue
classname AvailableValue
A value known to be valid for a queryable log field, which a UI can offer when filtering on that field.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** | The value. | [default to String]
**context** | **String** | Optional context qualifying the value. For the Operation field this is the comma-separated names of the applications that publish the operation. | [optional] [default to String]

```java
import com.finbourne.sdk.services.insights.model.AvailableValue;
import java.util.*;
import java.lang.System;
import java.net.URI;

String value = "example value";
@javax.annotation.Nullable String context = "example context";


AvailableValue availableValueInstance = new AvailableValue()
    .value(value)
    .context(context);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)