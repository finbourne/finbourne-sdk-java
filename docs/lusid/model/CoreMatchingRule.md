# com.finbourne.sdk.services.lusid.model.CoreMatchingRule
classname CoreMatchingRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleName** | **String** | The reference name of the rule. | [default to String]
**leftFormula** | **String** | Derivation formula evaluated against the left side of the reconciliation. | [default to String]
**rightFormula** | **String** | Derivation formula evaluated against the right side of the reconciliation. | [default to String]
**isCaseSensitive** | **Boolean** | Whether the core rule comparison is case sensitive. Defaults to false. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.CoreMatchingRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ruleName = "example ruleName";
String leftFormula = "example leftFormula";
String rightFormula = "example rightFormula";
Boolean isCaseSensitive = true;


CoreMatchingRule coreMatchingRuleInstance = new CoreMatchingRule()
    .ruleName(ruleName)
    .leftFormula(leftFormula)
    .rightFormula(rightFormula)
    .isCaseSensitive(isCaseSensitive);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)