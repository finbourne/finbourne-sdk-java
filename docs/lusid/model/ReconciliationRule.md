# com.finbourne.sdk.services.lusid.model.ReconciliationRule
classname ReconciliationRule
Base class for representing reconciliation rules in LUSID.  Reconciliation rules describe how a comparison between two items in the reconciliation should be performed and what constitutes equality.  This does not influence WHAT constitutes a match, but only whether once a line has been matched whether an item within it matches another item.  If a rule is not given for an item, it will default to equality comparison.  This base class should not be directly instantiated; each supported ReconciliationRuleType has a corresponding inherited class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleType** | **String** | Available values: ReconcileNumericRule, ReconcileDateTimeRule, ReconcileStringRule, ReconcileExact. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ReconciliationRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ruleType = "example ruleType";


ReconciliationRule reconciliationRuleInstance = new ReconciliationRule()
    .ruleType(ruleType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)