# com.finbourne.sdk.services.lusid.model.BatchReviewRecResultRequest
classname BatchReviewRecResultRequest
One item of a batch review request: applies review content to its targeted rec result(s). Exactly  one target, except FixAsGroup/ForceMatch which require two or more. A result id identifies a result only  within one run of one rec type of one instance, so every item names the run its targets belong to — which  also makes the same-result-set rule for group decisions structural.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instanceId** | [**RecInstanceId**](RecInstanceId.md) |  | [default to RecInstanceId]
**recType** | **String** | The rec type whose results this item targets (e.g. Holding). Available values: Holding, CashHolding, Valuation, InputTransaction, OutputTransaction, SettlementActivity. | [default to String]
**runNumber** | **Integer** | The run of the instance whose results this item targets. | [default to Integer]
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

RecInstanceId instanceId = new RecInstanceId();
String recType = "example recType";
Integer runNumber = new Integer("100.00");
List<String> recResultIds = new List<String>();
RecResultDecisionUpdate decision = new RecResultDecisionUpdate();
RecResultAssignmentUpdate assignedUser = new RecResultAssignmentUpdate();
RecResultAssignmentUpdate assignedRole = new RecResultAssignmentUpdate();
@javax.annotation.Nullable String addCommentText = "example addCommentText";
@javax.annotation.Nullable List<PerpetualProperty> properties = new List<PerpetualProperty>();


BatchReviewRecResultRequest batchReviewRecResultRequestInstance = new BatchReviewRecResultRequest()
    .instanceId(instanceId)
    .recType(recType)
    .runNumber(runNumber)
    .recResultIds(recResultIds)
    .decision(decision)
    .assignedUser(assignedUser)
    .assignedRole(assignedRole)
    .addCommentText(addCommentText)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)