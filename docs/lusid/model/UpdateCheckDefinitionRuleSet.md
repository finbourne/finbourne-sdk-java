# com.finbourne.sdk.services.lusid.model.UpdateCheckDefinitionRuleSet
classname UpdateCheckDefinitionRuleSet

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleSetKey** | **String** | The Key of the Rule Set. | [optional] [default to String]
**displayName** | **String** | The name of the Rule Set. | [optional] [default to String]
**description** | **String** | A description for the Rule Set. | [optional] [default to String]
**ruleSetFilter** | **String** | A filter for the Rule Set to filter entity instances the rule set applies to. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.UpdateCheckDefinitionRuleSet;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String ruleSetKey = "example ruleSetKey";
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable String ruleSetFilter = "example ruleSetFilter";


UpdateCheckDefinitionRuleSet updateCheckDefinitionRuleSetInstance = new UpdateCheckDefinitionRuleSet()
    .ruleSetKey(ruleSetKey)
    .displayName(displayName)
    .description(description)
    .ruleSetFilter(ruleSetFilter);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)