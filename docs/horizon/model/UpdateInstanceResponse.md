# com.finbourne.sdk.services.horizon.model.UpdateInstanceResponse
classname UpdateInstanceResponse
The outcome of updating an instance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**warnings** | [**List&lt;ValidationNoticeResponse&gt;**](ValidationNoticeResponse.md) | Non-blocking findings about the saved configuration. Empty when there are none. | [optional] [default to List<ValidationNoticeResponse>]

```java
import com.finbourne.sdk.services.horizon.model.UpdateInstanceResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<ValidationNoticeResponse> warnings = new List<ValidationNoticeResponse>();


UpdateInstanceResponse updateInstanceResponseInstance = new UpdateInstanceResponse()
    .warnings(warnings);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)