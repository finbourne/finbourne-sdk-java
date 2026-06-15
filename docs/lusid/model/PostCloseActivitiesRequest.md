# com.finbourne.sdk.services.lusid.model.PostCloseActivitiesRequest
classname PostCloseActivitiesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**postCloseActivities** | [**List&lt;PostCloseActivity&gt;**](PostCloseActivity.md) | A collection of post-close activities. | [default to List<PostCloseActivity>]

```java
import com.finbourne.sdk.services.lusid.model.PostCloseActivitiesRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<PostCloseActivity> postCloseActivities = new List<PostCloseActivity>();


PostCloseActivitiesRequest postCloseActivitiesRequestInstance = new PostCloseActivitiesRequest()
    .postCloseActivities(postCloseActivities);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)