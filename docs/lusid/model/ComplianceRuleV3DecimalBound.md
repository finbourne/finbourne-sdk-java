# com.finbourne.sdk.services.lusid.model.ComplianceRuleV3DecimalBound
classname ComplianceRuleV3DecimalBound
A check bound value paired with whether a value landing exactly on it satisfies the check.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**inclusive** | **Boolean** |  | [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceRuleV3DecimalBound;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal value = new java.math.BigDecimal("100.00");
Boolean inclusive = true;


ComplianceRuleV3DecimalBound complianceRuleV3DecimalBoundInstance = new ComplianceRuleV3DecimalBound()
    .value(value)
    .inclusive(inclusive);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)