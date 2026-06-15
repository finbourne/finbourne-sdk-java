# com.finbourne.sdk.services.lusid.model.ParticipationRequest
classname ParticipationRequest
A request to create or update a Participation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**placementId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**orderId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]

```java
import com.finbourne.sdk.services.lusid.model.ParticipationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
ResourceId placementId = new ResourceId();
ResourceId orderId = new ResourceId();


ParticipationRequest participationRequestInstance = new ParticipationRequest()
    .id(id)
    .placementId(placementId)
    .orderId(orderId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)