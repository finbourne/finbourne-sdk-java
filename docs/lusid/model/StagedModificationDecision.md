# com.finbourne.sdk.services.lusid.model.StagedModificationDecision
classname StagedModificationDecision

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | Time the decision request is made. | [optional] [default to OffsetDateTime]
**userId** | **String** | ID of user that approved the request. | [optional] [default to String]
**requestId** | **String** | ID of user that made the request. | [optional] [default to String]
**decision** | **String** | The decision on the requested staged modification, can be &#39;Approve&#39; or &#39;Reject&#39;. | [optional] [default to String]
**comment** | **String** | Comment on decision. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.StagedModificationDecision;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime asAt = OffsetDateTime.now();
@javax.annotation.Nullable String userId = "example userId";
@javax.annotation.Nullable String requestId = "example requestId";
@javax.annotation.Nullable String decision = "example decision";
@javax.annotation.Nullable String comment = "example comment";


StagedModificationDecision stagedModificationDecisionInstance = new StagedModificationDecision()
    .asAt(asAt)
    .userId(userId)
    .requestId(requestId)
    .decision(decision)
    .comment(comment);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)