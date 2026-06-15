# com.finbourne.sdk.services.lusid.model.ComplianceSummaryRuleResultRequest
classname ComplianceSummaryRuleResultRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**templateId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**variation** | **String** |  | [default to String]
**ruleStatus** | **String** | Available values: Passed, Failed, MissingData, Warning. | [default to String]
**affectedPortfolios** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [default to List<ResourceId>]
**affectedOrders** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [default to List<ResourceId>]
**parametersUsed** | **Map&lt;String, String&gt;** |  | [default to Map<String, String>]
**ruleBreakdown** | [**List&lt;ComplianceRuleBreakdownRequest&gt;**](ComplianceRuleBreakdownRequest.md) |  | [default to List<ComplianceRuleBreakdownRequest>]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceSummaryRuleResultRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId ruleId = new ResourceId();
ResourceId templateId = new ResourceId();
String variation = "example variation";
String ruleStatus = "example ruleStatus";
List<ResourceId> affectedPortfolios = new List<ResourceId>();
List<ResourceId> affectedOrders = new List<ResourceId>();
Map<String, String> parametersUsed = new Map<String, String>();
List<ComplianceRuleBreakdownRequest> ruleBreakdown = new List<ComplianceRuleBreakdownRequest>();


ComplianceSummaryRuleResultRequest complianceSummaryRuleResultRequestInstance = new ComplianceSummaryRuleResultRequest()
    .ruleId(ruleId)
    .templateId(templateId)
    .variation(variation)
    .ruleStatus(ruleStatus)
    .affectedPortfolios(affectedPortfolios)
    .affectedOrders(affectedOrders)
    .parametersUsed(parametersUsed)
    .ruleBreakdown(ruleBreakdown);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)