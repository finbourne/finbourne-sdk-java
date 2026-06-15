# com.finbourne.sdk.services.lusid.model.GroupReconciliationReviewStatuses
classname GroupReconciliationReviewStatuses

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countPending** | **Integer** | The number of comparison results of reviewStatus \&quot;Pending\&quot; with this instanceId and reconciliationType | [default to Integer]
**linkPending** | [**Link**](Link.md) |  | [default to Link]
**countReviewed** | **Integer** | The number of comparison results of reviewStatus \&quot;Reviewed\&quot; with this instanceId and reconciliationType | [default to Integer]
**linkReviewed** | [**Link**](Link.md) |  | [default to Link]
**countMatched** | **Integer** | The number of comparison results of reviewStatus \&quot;Matched\&quot; with this instanceId and reconciliationType | [default to Integer]
**linkMatched** | [**Link**](Link.md) |  | [default to Link]
**countInvalid** | **Integer** | The number of comparison results of reviewStatus \&quot;Invalid\&quot; with this instanceId and reconciliationType | [default to Integer]
**linkInvalid** | [**Link**](Link.md) |  | [default to Link]

```java
import com.finbourne.sdk.services.lusid.model.GroupReconciliationReviewStatuses;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer countPending = new Integer("100.00");
Link linkPending = new Link();
Integer countReviewed = new Integer("100.00");
Link linkReviewed = new Link();
Integer countMatched = new Integer("100.00");
Link linkMatched = new Link();
Integer countInvalid = new Integer("100.00");
Link linkInvalid = new Link();


GroupReconciliationReviewStatuses groupReconciliationReviewStatusesInstance = new GroupReconciliationReviewStatuses()
    .countPending(countPending)
    .linkPending(linkPending)
    .countReviewed(countReviewed)
    .linkReviewed(linkReviewed)
    .countMatched(countMatched)
    .linkMatched(linkMatched)
    .countInvalid(countInvalid)
    .linkInvalid(linkInvalid);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)