# com.finbourne.sdk.services.lusid.model.ParticipationSetRequest
classname ParticipationSetRequest
A request to create or update multiple Participations.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requests** | [**List&lt;ParticipationRequest&gt;**](ParticipationRequest.md) | A collection of ParticipationRequests. | [optional] [default to List<ParticipationRequest>]

```java
import com.finbourne.sdk.services.lusid.model.ParticipationSetRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<ParticipationRequest> requests = new List<ParticipationRequest>();


ParticipationSetRequest participationSetRequestInstance = new ParticipationSetRequest()
    .requests(requests);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)