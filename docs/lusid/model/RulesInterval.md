# com.finbourne.sdk.services.lusid.model.RulesInterval
classname RulesInterval

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveRange** | [**DateRange**](DateRange.md) |  | [default to DateRange]
**rules** | [**List&lt;AmortisationRule&gt;**](AmortisationRule.md) | The rules of this rule set. | [default to List<AmortisationRule>]

```java
import com.finbourne.sdk.services.lusid.model.RulesInterval;
import java.util.*;
import java.lang.System;
import java.net.URI;

DateRange effectiveRange = new DateRange();
List<AmortisationRule> rules = new List<AmortisationRule>();


RulesInterval rulesIntervalInstance = new RulesInterval()
    .effectiveRange(effectiveRange)
    .rules(rules);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)