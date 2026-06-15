# com.finbourne.sdk.services.lusid.model.DecoratedComplianceRunSummary
classname DecoratedComplianceRunSummary

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**details** | [**List&lt;ComplianceRuleResultDetail&gt;**](ComplianceRuleResultDetail.md) |  | [default to List<ComplianceRuleResultDetail>]

```java
import com.finbourne.sdk.services.lusid.model.DecoratedComplianceRunSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId runId = new ResourceId();
List<ComplianceRuleResultDetail> details = new List<ComplianceRuleResultDetail>();


DecoratedComplianceRunSummary decoratedComplianceRunSummaryInstance = new DecoratedComplianceRunSummary()
    .runId(runId)
    .details(details);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)