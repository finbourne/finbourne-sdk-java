# com.finbourne.sdk.services.luminesce.model.BackgroundMultiQueryProgressResponse
classname BackgroundMultiQueryProgressResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**progress** | **String** | The full progress log (up to this point at least) | [optional] [default to String]
**feedback** | [**List&lt;FeedbackEventArgs&gt;**](FeedbackEventArgs.md) | Individual Feedback Messages (to replace Progress).  A given message will be returned from only one call. | [optional] [default to List<FeedbackEventArgs>]
**status** | [**TaskStatus**](TaskStatus.md) |  | [optional] [default to TaskStatus]
**queries** | [**List&lt;BackgroundQueryProgressResponse&gt;**](BackgroundQueryProgressResponse.md) |  | [optional] [default to List<BackgroundQueryProgressResponse>]

```java
import com.finbourne.sdk.services.luminesce.model.BackgroundMultiQueryProgressResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String progress = "example progress";
@javax.annotation.Nullable List<FeedbackEventArgs> feedback = new List<FeedbackEventArgs>();
TaskStatus @javax.annotation.Nullable List<BackgroundQueryProgressResponse> queries = new List<BackgroundQueryProgressResponse>();


BackgroundMultiQueryProgressResponse backgroundMultiQueryProgressResponseInstance = new BackgroundMultiQueryProgressResponse()
    .progress(progress)
    .feedback(feedback)
    .status(status)
    .queries(queries);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)