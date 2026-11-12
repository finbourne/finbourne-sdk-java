# com.finbourne.sdk.services.lusid.model.RunComplianceV3Request
classname RunComplianceV3Request
A request to run one or more V3 compliance rules against a portfolio group, valuing holdings with the  supplied recipe. The pre-trade variant additionally includes the group's live order flow.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [default to List<ResourceId>]
**portfolioGroupId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**evaluationMode** | **String** | Available values: PerPortfolio, GroupTotal. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RunComplianceV3Request;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<ResourceId> ruleIds = new List<ResourceId>();
ResourceId portfolioGroupId = new ResourceId();
ResourceId recipeId = new ResourceId();
@javax.annotation.Nullable OffsetDateTime effectiveAt = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime asAt = OffsetDateTime.now();
@javax.annotation.Nullable String evaluationMode = "example evaluationMode";


RunComplianceV3Request runComplianceV3RequestInstance = new RunComplianceV3Request()
    .ruleIds(ruleIds)
    .portfolioGroupId(portfolioGroupId)
    .recipeId(recipeId)
    .effectiveAt(effectiveAt)
    .asAt(asAt)
    .evaluationMode(evaluationMode);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)