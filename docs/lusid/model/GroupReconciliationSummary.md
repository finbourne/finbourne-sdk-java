# com.finbourne.sdk.services.lusid.model.GroupReconciliationSummary
classname GroupReconciliationSummary

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runDetails** | [**GroupReconciliationRunDetails**](GroupReconciliationRunDetails.md) |  | [optional] [default to GroupReconciliationRunDetails]
**groupReconciliationDefinitionId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**reconciliationType** | **String** | The type of reconciliation to perform. Available values: Holding, Transaction, Valuation, CashHolding. | [default to String]
**instanceId** | [**GroupReconciliationInstanceId**](GroupReconciliationInstanceId.md) |  | [default to GroupReconciliationInstanceId]
**datesReconciled** | [**GroupReconciliationDates**](GroupReconciliationDates.md) |  | [default to GroupReconciliationDates]
**reconciliationRunAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time the reconciliation was run | [default to OffsetDateTime]
**countComparisonResults** | **Integer** | The total number of comparison results with this InstanceId and ReconciliationType | [default to Integer]
**linkComparisonResults** | [**Link**](Link.md) |  | [optional] [default to Link]
**resultTypes** | [**GroupReconciliationResultTypes**](GroupReconciliationResultTypes.md) |  | [optional] [default to GroupReconciliationResultTypes]
**resultStatuses** | [**GroupReconciliationResultStatuses**](GroupReconciliationResultStatuses.md) |  | [optional] [default to GroupReconciliationResultStatuses]
**reviewStatuses** | [**GroupReconciliationReviewStatuses**](GroupReconciliationReviewStatuses.md) |  | [optional] [default to GroupReconciliationReviewStatuses]

```java
import com.finbourne.sdk.services.lusid.model.GroupReconciliationSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

GroupReconciliationRunDetails runDetails = new GroupReconciliationRunDetails();
ResourceId groupReconciliationDefinitionId = new ResourceId();
String reconciliationType = "example reconciliationType";
GroupReconciliationInstanceId instanceId = new GroupReconciliationInstanceId();
GroupReconciliationDates datesReconciled = new GroupReconciliationDates();
OffsetDateTime reconciliationRunAsAt = OffsetDateTime.now();
Integer countComparisonResults = new Integer("100.00");
Link linkComparisonResults = new Link();
GroupReconciliationResultTypes resultTypes = new GroupReconciliationResultTypes();
GroupReconciliationResultStatuses resultStatuses = new GroupReconciliationResultStatuses();
GroupReconciliationReviewStatuses reviewStatuses = new GroupReconciliationReviewStatuses();


GroupReconciliationSummary groupReconciliationSummaryInstance = new GroupReconciliationSummary()
    .runDetails(runDetails)
    .groupReconciliationDefinitionId(groupReconciliationDefinitionId)
    .reconciliationType(reconciliationType)
    .instanceId(instanceId)
    .datesReconciled(datesReconciled)
    .reconciliationRunAsAt(reconciliationRunAsAt)
    .countComparisonResults(countComparisonResults)
    .linkComparisonResults(linkComparisonResults)
    .resultTypes(resultTypes)
    .resultStatuses(resultStatuses)
    .reviewStatuses(reviewStatuses);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)