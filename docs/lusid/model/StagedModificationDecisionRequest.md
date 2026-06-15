# com.finbourne.sdk.services.lusid.model.StagedModificationDecisionRequest
classname StagedModificationDecisionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**decision** | **String** | The decision on the requested staged modification, can be &#39;Approve&#39; or &#39;Reject&#39;. Available values: Approve, Reject. | [default to String]
**comment** | **String** | Comment on decision. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.StagedModificationDecisionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String decision = "example decision";
String comment = "example comment";


StagedModificationDecisionRequest stagedModificationDecisionRequestInstance = new StagedModificationDecisionRequest()
    .decision(decision)
    .comment(comment);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)