# com.finbourne.sdk.services.lusid.model.BatchReviewRecResultItemResult
classname BatchReviewRecResultItemResult
The successful outcome of a single batch review item: every rec result affected by the item (which  may exceed the results named in the request, e.g. group members re-opened by a nullify).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recResults** | [**List&lt;RecResult&gt;**](RecResult.md) | The full set of rec results affected by the batch item (may exceed the results named in the request). | [default to List<RecResult>]

```java
import com.finbourne.sdk.services.lusid.model.BatchReviewRecResultItemResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<RecResult> recResults = new List<RecResult>();


BatchReviewRecResultItemResult batchReviewRecResultItemResultInstance = new BatchReviewRecResultItemResult()
    .recResults(recResults);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)