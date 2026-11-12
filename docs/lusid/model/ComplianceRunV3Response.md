# com.finbourne.sdk.services.lusid.model.ComplianceRunV3Response
classname ComplianceRunV3Response
The outcome of a V3 compliance run: the result of each rule that was run.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleResults** | [**List&lt;ComplianceRuleV3RuleResult&gt;**](ComplianceRuleV3RuleResult.md) |  | [optional] [default to List<ComplianceRuleV3RuleResult>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceRunV3Response;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<ComplianceRuleV3RuleResult> ruleResults = new List<ComplianceRuleV3RuleResult>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


ComplianceRunV3Response complianceRunV3ResponseInstance = new ComplianceRunV3Response()
    .ruleResults(ruleResults)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)