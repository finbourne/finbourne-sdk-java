# com.finbourne.sdk.services.lusid.model.GroupReconciliationUserReviewComment
classname GroupReconciliationUserReviewComment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commentText** | **String** | User&#39;s comment regarding the reconciliation result. | [default to String]
**userId** | **String** | Id of the user who made a User Review input. | [optional] [default to String]
**asAtAdded** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp of the added User Review input. | [optional] [default to OffsetDateTime]
**asAtInvalid** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp when User Review input became invalid e.g. because of the different attribute values within the new run. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.GroupReconciliationUserReviewComment;
import java.util.*;
import java.lang.System;
import java.net.URI;

String commentText = "example commentText";
@javax.annotation.Nullable String userId = "example userId";
OffsetDateTime asAtAdded = OffsetDateTime.now();
OffsetDateTime asAtInvalid = OffsetDateTime.now();


GroupReconciliationUserReviewComment groupReconciliationUserReviewCommentInstance = new GroupReconciliationUserReviewComment()
    .commentText(commentText)
    .userId(userId)
    .asAtAdded(asAtAdded)
    .asAtInvalid(asAtInvalid);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)