# com.finbourne.sdk.services.lusid.model.CheckDefinitionRuleSet
classname CheckDefinitionRuleSet

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleSetKey** | **String** | The Key of the Rule Set. | [optional] [default to String]
**displayName** | **String** | The name of the Rule Set. | [optional] [default to String]
**description** | **String** | A description for the Rule Set. | [optional] [default to String]
**ruleSetFilter** | **String** | A filter for the Rule Set to filter entity instances the rule set applies to. | [optional] [default to String]
**rules** | [**List&lt;CheckDefinitionRule&gt;**](CheckDefinitionRule.md) | A collection of rules for the Rule Set. | [optional] [default to List<CheckDefinitionRule>]

```java
import com.finbourne.sdk.services.lusid.model.CheckDefinitionRuleSet;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String ruleSetKey = "example ruleSetKey";
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable String ruleSetFilter = "example ruleSetFilter";
@javax.annotation.Nullable List<CheckDefinitionRule> rules = new List<CheckDefinitionRule>();


CheckDefinitionRuleSet checkDefinitionRuleSetInstance = new CheckDefinitionRuleSet()
    .ruleSetKey(ruleSetKey)
    .displayName(displayName)
    .description(description)
    .ruleSetFilter(ruleSetFilter)
    .rules(rules);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)