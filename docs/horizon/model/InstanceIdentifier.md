# com.finbourne.sdk.services.horizon.model.InstanceIdentifier
classname InstanceIdentifier
Identifies a single instance of an integration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Instance identifier. | [default to String]
**warnings** | [**List&lt;ValidationNoticeResponse&gt;**](ValidationNoticeResponse.md) | Non-blocking findings about the saved configuration. Empty when there are none. | [optional] [default to List<ValidationNoticeResponse>]

```java
import com.finbourne.sdk.services.horizon.model.InstanceIdentifier;
import java.util.*;
import java.lang.System;
import java.net.URI;

String id = "example id";
@javax.annotation.Nullable List<ValidationNoticeResponse> warnings = new List<ValidationNoticeResponse>();


InstanceIdentifier instanceIdentifierInstance = new InstanceIdentifier()
    .id(id)
    .warnings(warnings);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)