# com.finbourne.sdk.services.lusid.model.CheckDefinitionRule
classname CheckDefinitionRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleKey** | **String** | The key of the Rule. | [optional] [default to String]
**displayName** | **String** | The name of the Rule. | [optional] [default to String]
**description** | **String** | A description for the Rule. | [optional] [default to String]
**ruleFormula** | **String** | The formula for the rule. | [optional] [default to String]
**severity** | **Integer** | Severity of the rule if formaula is not satisfied. | [optional] [default to Integer]

```java
import com.finbourne.sdk.services.lusid.model.CheckDefinitionRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String ruleKey = "example ruleKey";
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable String ruleFormula = "example ruleFormula";
Integer severity = new Integer("100.00");


CheckDefinitionRule checkDefinitionRuleInstance = new CheckDefinitionRule()
    .ruleKey(ruleKey)
    .displayName(displayName)
    .description(description)
    .ruleFormula(ruleFormula)
    .severity(severity);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)