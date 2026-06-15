# com.finbourne.sdk.services.lusid.model.BatchUpdateUserReviewForComparisonResultResponse
classname BatchUpdateUserReviewForComparisonResultResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, GroupReconciliationComparisonResult&gt;**](GroupReconciliationComparisonResult.md) | The collection of comparison results that have been successfully updated. | [optional] [default to Map<String, GroupReconciliationComparisonResult>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The collection of comparison results that could not be updated with the provided user input along with a reason for their failure. | [optional] [default to Map<String, ErrorDetail>]
**metadata** | [**Map&lt;String, List&lt;ResponseMetaData&gt;&gt;**](List.md) | Contains warnings related to the updated comparison result user input | [optional] [default to Map<String, List<ResponseMetaData>>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.BatchUpdateUserReviewForComparisonResultResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, GroupReconciliationComparisonResult> values = new Map<String, GroupReconciliationComparisonResult>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable Map<String, List<ResponseMetaData>> metadata = new Map<String, List<ResponseMetaData>>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


BatchUpdateUserReviewForComparisonResultResponse batchUpdateUserReviewForComparisonResultResponseInstance = new BatchUpdateUserReviewForComparisonResultResponse()
    .values(values)
    .failed(failed)
    .metadata(metadata)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)