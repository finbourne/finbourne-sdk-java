# com.finbourne.sdk.services.lusid.model.BatchUpdateUserReviewForComparisonResultRequest
classname BatchUpdateUserReviewForComparisonResultRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comparisonResultId** | **String** | Comparison result identifier, encoded value for core attribute results, aggregate attribute results, reconciliation type and run instanceId. | [default to String]
**userReviewAdd** | [**GroupReconciliationUserReviewAdd**](GroupReconciliationUserReviewAdd.md) |  | [optional] [default to GroupReconciliationUserReviewAdd]
**userReviewRemove** | [**GroupReconciliationUserReviewRemove**](GroupReconciliationUserReviewRemove.md) |  | [optional] [default to GroupReconciliationUserReviewRemove]

```java
import com.finbourne.sdk.services.lusid.model.BatchUpdateUserReviewForComparisonResultRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String comparisonResultId = "example comparisonResultId";
GroupReconciliationUserReviewAdd userReviewAdd = new GroupReconciliationUserReviewAdd();
GroupReconciliationUserReviewRemove userReviewRemove = new GroupReconciliationUserReviewRemove();


BatchUpdateUserReviewForComparisonResultRequest batchUpdateUserReviewForComparisonResultRequestInstance = new BatchUpdateUserReviewForComparisonResultRequest()
    .comparisonResultId(comparisonResultId)
    .userReviewAdd(userReviewAdd)
    .userReviewRemove(userReviewRemove);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)