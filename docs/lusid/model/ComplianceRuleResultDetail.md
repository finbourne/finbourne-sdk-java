# com.finbourne.sdk.services.lusid.model.ComplianceRuleResultDetail
classname ComplianceRuleResultDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**affectedPortfoliosDetails** | [**List&lt;ComplianceRuleResultPortfolioDetail&gt;**](ComplianceRuleResultPortfolioDetail.md) |  | [default to List<ComplianceRuleResultPortfolioDetail>]
**affectedOrders** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [default to List<ResourceId>]
**templateId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**templateDescription** | **String** |  | [default to String]
**templateVariation** | **String** |  | [default to String]
**status** | **String** |  | [default to String]
**ruleName** | **String** |  | [default to String]
**ruleDescription** | **String** |  | [default to String]
**outcome** | **String** |  | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceRuleResultDetail;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId ruleId = new ResourceId();
List<ComplianceRuleResultPortfolioDetail> affectedPortfoliosDetails = new List<ComplianceRuleResultPortfolioDetail>();
List<ResourceId> affectedOrders = new List<ResourceId>();
ResourceId templateId = new ResourceId();
String templateDescription = "example templateDescription";
String templateVariation = "example templateVariation";
String status = "example status";
String ruleName = "example ruleName";
String ruleDescription = "example ruleDescription";
String outcome = "example outcome";


ComplianceRuleResultDetail complianceRuleResultDetailInstance = new ComplianceRuleResultDetail()
    .ruleId(ruleId)
    .affectedPortfoliosDetails(affectedPortfoliosDetails)
    .affectedOrders(affectedOrders)
    .templateId(templateId)
    .templateDescription(templateDescription)
    .templateVariation(templateVariation)
    .status(status)
    .ruleName(ruleName)
    .ruleDescription(ruleDescription)
    .outcome(outcome);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)