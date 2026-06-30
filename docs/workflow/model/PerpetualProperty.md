# com.finbourne.sdk.services.workflow.model.PerpetualProperty
classname PerpetualProperty
A perpetual property (i.e. without effective dates) on a Workflow. A property is deleted by supplying a null Finbourne.Workflow.WebApi.Common.Dto.Json.Properties.PerpetualProperty.Value.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The property key in the form {domain}/{scope}/{code}. The domain must be &#39;Workflow&#39;. | [default to String]
**value** | [**PropertyValue**](PropertyValue.md) |  | [optional] [default to PropertyValue]

```java
import com.finbourne.sdk.services.workflow.model.PerpetualProperty;
import java.util.*;
import java.lang.System;
import java.net.URI;

String key = "example key";
PropertyValue value = new PropertyValue();


PerpetualProperty perpetualPropertyInstance = new PerpetualProperty()
    .key(key)
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)