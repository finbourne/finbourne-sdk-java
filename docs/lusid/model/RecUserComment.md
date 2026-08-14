# com.finbourne.sdk.services.lusid.model.RecUserComment
classname RecUserComment
A user-authored comment attached to a rec result. Carried forward with the result across runs.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commentId** | **String** | System-generated GUID identifying the comment. Set once on creation. | [default to String]
**commentText** | **String** | The body of the comment. | [default to String]
**userId** | **String** | The author of the comment. | [default to String]
**asAtCreated** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt time the comment was created. Set once. | [default to OffsetDateTime]
**asAtModified** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt time the comment was last modified. Equals asAtCreated until the first edit. | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.RecUserComment;
import java.util.*;
import java.lang.System;
import java.net.URI;

String commentId = "example commentId";
String commentText = "example commentText";
String userId = "example userId";
OffsetDateTime asAtCreated = OffsetDateTime.now();
OffsetDateTime asAtModified = OffsetDateTime.now();


RecUserComment recUserCommentInstance = new RecUserComment()
    .commentId(commentId)
    .commentText(commentText)
    .userId(userId)
    .asAtCreated(asAtCreated)
    .asAtModified(asAtModified);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)