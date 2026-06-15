# com.finbourne.sdk.services.lusid.model.GroupReconciliationUserReview
classname GroupReconciliationUserReview

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**breakCodes** | [**List&lt;GroupReconciliationUserReviewBreakCode&gt;**](GroupReconciliationUserReviewBreakCode.md) | A list of break codes shared between the reconciliation runs of the same run instance and result hash. | [optional] [default to List<GroupReconciliationUserReviewBreakCode>]
**matchKeys** | [**List&lt;GroupReconciliationUserReviewMatchKey&gt;**](GroupReconciliationUserReviewMatchKey.md) | A list of match keys shared between the reconciliation runs of the same run instance and result hash. | [optional] [default to List<GroupReconciliationUserReviewMatchKey>]
**comments** | [**List&lt;GroupReconciliationUserReviewComment&gt;**](GroupReconciliationUserReviewComment.md) | A list of comments shared between the reconciliation runs of the same run instance and result hash. | [optional] [default to List<GroupReconciliationUserReviewComment>]

```java
import com.finbourne.sdk.services.lusid.model.GroupReconciliationUserReview;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<GroupReconciliationUserReviewBreakCode> breakCodes = new List<GroupReconciliationUserReviewBreakCode>();
@javax.annotation.Nullable List<GroupReconciliationUserReviewMatchKey> matchKeys = new List<GroupReconciliationUserReviewMatchKey>();
@javax.annotation.Nullable List<GroupReconciliationUserReviewComment> comments = new List<GroupReconciliationUserReviewComment>();


GroupReconciliationUserReview groupReconciliationUserReviewInstance = new GroupReconciliationUserReview()
    .breakCodes(breakCodes)
    .matchKeys(matchKeys)
    .comments(comments);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)