# com.finbourne.sdk.services.lusid.model.RecRequestedResultRevision
classname RecRequestedResultRevision
A result flagged for re-review as part of a Request Revisions decision.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recResultId** | **String** | The identifier of the result to flag for re-review. | [default to String]
**commentText** | **String** | An optional per-result comment added to the result&#39;s user comments. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RecRequestedResultRevision;
import java.util.*;
import java.lang.System;
import java.net.URI;

String recResultId = "example recResultId";
@javax.annotation.Nullable String commentText = "example commentText";


RecRequestedResultRevision recRequestedResultRevisionInstance = new RecRequestedResultRevision()
    .recResultId(recResultId)
    .commentText(commentText);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)