# com.finbourne.sdk.services.lusid.model.SweepBlocksRequest
classname SweepBlocksRequest
A request to sweep specified blocks.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blockIds** | [**Map&lt;String, ResourceId&gt;**](ResourceId.md) | A dictionary mapping ephemeral identifiers, which live as long as the request, to specific blocks to sweep. | [default to Map<String, ResourceId>]
**latestAllowableModificationTime** | **String** | Timestamp or cut label which the  block or related entities must not have been updated after. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.SweepBlocksRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, ResourceId> blockIds = new Map<String, ResourceId>();
String latestAllowableModificationTime = "example latestAllowableModificationTime";


SweepBlocksRequest sweepBlocksRequestInstance = new SweepBlocksRequest()
    .blockIds(blockIds)
    .latestAllowableModificationTime(latestAllowableModificationTime);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)