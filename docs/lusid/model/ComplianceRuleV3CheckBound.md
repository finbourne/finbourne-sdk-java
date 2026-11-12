# com.finbourne.sdk.services.lusid.model.ComplianceRuleV3CheckBound
classname ComplianceRuleV3CheckBound
A single bound of a check: a hard limit that must hold, plus an optional soft limit that raises a  warning without failing the rule.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hard** | [**ComplianceRuleV3DecimalBound**](ComplianceRuleV3DecimalBound.md) |  | [default to ComplianceRuleV3DecimalBound]
**soft** | [**ComplianceRuleV3DecimalBound**](ComplianceRuleV3DecimalBound.md) |  | [optional] [default to ComplianceRuleV3DecimalBound]
**hardProperty** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceRuleV3CheckBound;
import java.util.*;
import java.lang.System;
import java.net.URI;

ComplianceRuleV3DecimalBound hard = new ComplianceRuleV3DecimalBound();
ComplianceRuleV3DecimalBound soft = new ComplianceRuleV3DecimalBound();
@javax.annotation.Nullable String hardProperty = "example hardProperty";


ComplianceRuleV3CheckBound complianceRuleV3CheckBoundInstance = new ComplianceRuleV3CheckBound()
    .hard(hard)
    .soft(soft)
    .hardProperty(hardProperty);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)