# com.finbourne.sdk.services.lusid.model.BatchReviewRecResultRequest
classname BatchReviewRecResultRequest
One item of a batch review request: applies review content to its targeted rec result(s). Exactly  one target, except FixAsGroup/ForceMatch which require two or more.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recResultIds** | **List&lt;String&gt;** | The rec results targeted by this batch item. Exactly one, except FixAsGroup/ForceMatch which require two or more. | [default to List<String>]
**decision** | [**RecResultDecisionUpdate**](RecResultDecisionUpdate.md) |  | [optional] [default to RecResultDecisionUpdate]
**assignedUser** | [**RecResultAssignmentUpdate**](RecResultAssignmentUpdate.md) |  | [optional] [default to RecResultAssignmentUpdate]
**assignedRole** | [**RecResultAssignmentUpdate**](RecResultAssignmentUpdate.md) |  | [optional] [default to RecResultAssignmentUpdate]
**addCommentText** | **String** | Optional comment text to add to each targeted result. | [optional] [default to String]
**properties** | [**List&lt;PerpetualProperty&gt;**](PerpetualProperty.md) | Properties in the RecResult domain. Filterable and sortable. | [optional] [default to List<PerpetualProperty>]

```java
import com.finbourne.sdk.services.lusid.model.BatchReviewRecResultRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> recResultIds = new List<String>();
RecResultDecisionUpdate decision = new RecResultDecisionUpdate();
RecResultAssignmentUpdate assignedUser = new RecResultAssignmentUpdate();
RecResultAssignmentUpdate assignedRole = new RecResultAssignmentUpdate();
@javax.annotation.Nullable String addCommentText = "example addCommentText";
@javax.annotation.Nullable List<PerpetualProperty> properties = new List<PerpetualProperty>();


BatchReviewRecResultRequest batchReviewRecResultRequestInstance = new BatchReviewRecResultRequest()
    .recResultIds(recResultIds)
    .decision(decision)
    .assignedUser(assignedUser)
    .assignedRole(assignedRole)
    .addCommentText(addCommentText)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)