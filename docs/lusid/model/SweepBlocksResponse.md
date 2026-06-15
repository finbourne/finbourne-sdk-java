# com.finbourne.sdk.services.lusid.model.SweepBlocksResponse
classname SweepBlocksResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, ResourceId&gt;**](ResourceId.md) | The identifiers of blocks which have been successfully swept, indexed by ephemeral request-lived id. | [optional] [default to Map<String, ResourceId>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The identifiers of blocks that could not be swept, along with a reason for their failure. | [optional] [default to Map<String, ErrorDetail>]

```java
import com.finbourne.sdk.services.lusid.model.SweepBlocksResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, ResourceId> values = new Map<String, ResourceId>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();


SweepBlocksResponse sweepBlocksResponseInstance = new SweepBlocksResponse()
    .values(values)
    .failed(failed);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)