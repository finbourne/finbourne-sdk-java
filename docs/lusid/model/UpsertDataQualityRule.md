# com.finbourne.sdk.services.lusid.model.UpsertDataQualityRule
classname UpsertDataQualityRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleSetKey** | **String** |  | [optional] [default to String]
**rule** | [**CheckDefinitionRule**](CheckDefinitionRule.md) |  | [optional] [default to CheckDefinitionRule]

```java
import com.finbourne.sdk.services.lusid.model.UpsertDataQualityRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String ruleSetKey = "example ruleSetKey";
CheckDefinitionRule rule = new CheckDefinitionRule();


UpsertDataQualityRule upsertDataQualityRuleInstance = new UpsertDataQualityRule()
    .ruleSetKey(ruleSetKey)
    .rule(rule);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)