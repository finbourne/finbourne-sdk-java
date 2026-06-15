# com.finbourne.sdk.services.lusid.model.UpdateStagingRuleSetRequest
classname UpdateStagingRuleSetRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the staging rule set. | [default to String]
**description** | **String** | A description for the staging rule set. | [optional] [default to String]
**rules** | [**List&lt;StagingRule&gt;**](StagingRule.md) | The list of staging rules that apply to a specific entity type. | [default to List<StagingRule>]

```java
import com.finbourne.sdk.services.lusid.model.UpdateStagingRuleSetRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
List<StagingRule> rules = new List<StagingRule>();


UpdateStagingRuleSetRequest updateStagingRuleSetRequestInstance = new UpdateStagingRuleSetRequest()
    .displayName(displayName)
    .description(description)
    .rules(rules);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)