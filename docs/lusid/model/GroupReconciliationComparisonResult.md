# com.finbourne.sdk.services.lusid.model.GroupReconciliationComparisonResult
classname GroupReconciliationComparisonResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**reconciliationType** | **String** | The type of reconciliation to perform. Available values: Holding, Transaction, Valuation, CashHolding. | [default to String]
**groupReconciliationDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**instanceId** | [**GroupReconciliationInstanceId**](GroupReconciliationInstanceId.md) |  | [default to GroupReconciliationInstanceId]
**comparisonResultId** | **String** | Comparison result identifier, encoded value for core attribute results, aggregate attribute results, reconciliation type and run instanceId. | [default to String]
**reconciliationRunAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp when the run occurred. | [default to OffsetDateTime]
**resultType** | **String** | Reconciliation run general result. Available values: Match, PartialMatch, Break, NotFound, Resolved. | [default to String]
**resultStatus** | **String** | Indicates how a particular result evolves from one run to the next. Available values: New, Confirmed, Changed. | [default to String]
**reviewStatus** | **String** | Status of whether user has provided any input (comments, manual matches, break codes). Available values: Pending, Reviewed, Matched, Invalid. | [default to String]
**datesReconciled** | [**GroupReconciliationDates**](GroupReconciliationDates.md) |  | [default to GroupReconciliationDates]
**coreAttributes** | [**GroupReconciliationCoreAttributeValues**](GroupReconciliationCoreAttributeValues.md) |  | [default to GroupReconciliationCoreAttributeValues]
**aggregateAttributes** | [**GroupReconciliationAggregateAttributeValues**](GroupReconciliationAggregateAttributeValues.md) |  | [default to GroupReconciliationAggregateAttributeValues]
**userReview** | [**GroupReconciliationUserReview**](GroupReconciliationUserReview.md) |  | [optional] [default to GroupReconciliationUserReview]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.GroupReconciliationComparisonResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
String reconciliationType = "example reconciliationType";
ResourceId groupReconciliationDefinitionId = new ResourceId();
GroupReconciliationInstanceId instanceId = new GroupReconciliationInstanceId();
String comparisonResultId = "example comparisonResultId";
OffsetDateTime reconciliationRunAsAt = OffsetDateTime.now();
String resultType = "example resultType";
String resultStatus = "example resultStatus";
String reviewStatus = "example reviewStatus";
GroupReconciliationDates datesReconciled = new GroupReconciliationDates();
GroupReconciliationCoreAttributeValues coreAttributes = new GroupReconciliationCoreAttributeValues();
GroupReconciliationAggregateAttributeValues aggregateAttributes = new GroupReconciliationAggregateAttributeValues();
GroupReconciliationUserReview userReview = new GroupReconciliationUserReview();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


GroupReconciliationComparisonResult groupReconciliationComparisonResultInstance = new GroupReconciliationComparisonResult()
    .id(id)
    .reconciliationType(reconciliationType)
    .groupReconciliationDefinitionId(groupReconciliationDefinitionId)
    .instanceId(instanceId)
    .comparisonResultId(comparisonResultId)
    .reconciliationRunAsAt(reconciliationRunAsAt)
    .resultType(resultType)
    .resultStatus(resultStatus)
    .reviewStatus(reviewStatus)
    .datesReconciled(datesReconciled)
    .coreAttributes(coreAttributes)
    .aggregateAttributes(aggregateAttributes)
    .userReview(userReview)
    .href(href)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)