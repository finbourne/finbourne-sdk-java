# com.finbourne.sdk.services.lusid.model.BatchManageCommentRequest
classname BatchManageCommentRequest
One item of a batch comment request. The operation (add/edit/delete) is inferred from the  combination of commentId and commentText.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recResultId** | **String** | The rec result the comment operation targets. | [default to String]
**commentId** | **String** | The comment id. Null with text &#x3D; add; provided with text &#x3D; edit; provided with null text &#x3D; delete. | [optional] [default to String]
**commentText** | **String** | The comment body. See operation inference. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.BatchManageCommentRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String recResultId = "example recResultId";
@javax.annotation.Nullable String commentId = "example commentId";
@javax.annotation.Nullable String commentText = "example commentText";


BatchManageCommentRequest batchManageCommentRequestInstance = new BatchManageCommentRequest()
    .recResultId(recResultId)
    .commentId(commentId)
    .commentText(commentText);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)