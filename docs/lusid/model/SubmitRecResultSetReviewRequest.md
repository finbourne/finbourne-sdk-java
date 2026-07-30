# com.finbourne.sdk.services.lusid.model.SubmitRecResultSetReviewRequest
classname SubmitRecResultSetReviewRequest
The request to submit a result set review for approval (or resubmit after addressing revisions).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commentText** | **String** | An optional comment recorded on the submission. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.SubmitRecResultSetReviewRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String commentText = "example commentText";


SubmitRecResultSetReviewRequest submitRecResultSetReviewRequestInstance = new SubmitRecResultSetReviewRequest()
    .commentText(commentText);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)