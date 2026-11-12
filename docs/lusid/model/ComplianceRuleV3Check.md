# com.finbourne.sdk.services.lusid.model.ComplianceRuleV3Check
classname ComplianceRuleV3Check
The limits a measure's result is checked against: an optional upper bound, an optional lower bound, and  the unit both are expressed in.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**unit** | **String** | Available values: Absolute, Percentage. | [default to String]
**upper** | [**ComplianceRuleV3CheckBound**](ComplianceRuleV3CheckBound.md) |  | [optional] [default to ComplianceRuleV3CheckBound]
**lower** | [**ComplianceRuleV3CheckBound**](ComplianceRuleV3CheckBound.md) |  | [optional] [default to ComplianceRuleV3CheckBound]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceRuleV3Check;
import java.util.*;
import java.lang.System;
import java.net.URI;

String unit = "example unit";
ComplianceRuleV3CheckBound upper = new ComplianceRuleV3CheckBound();
ComplianceRuleV3CheckBound lower = new ComplianceRuleV3CheckBound();


ComplianceRuleV3Check complianceRuleV3CheckInstance = new ComplianceRuleV3Check()
    .unit(unit)
    .upper(upper)
    .lower(lower);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)