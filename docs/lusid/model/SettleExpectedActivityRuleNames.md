# com.finbourne.sdk.services.lusid.model.SettleExpectedActivityRuleNames
classname SettleExpectedActivityRuleNames
Names the matching rules that carry the settlement semantics a SettleExpectedActivity writeback depends  upon. Each named rule's target-side formula must be the unmodified settlement activity field; the origin  side is unconstrained.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activityType** | **String** | The core rule whose target-side formula is the unmodified &#39;activityType&#39;. Settlement instructions are suggested where the origin-side value is Settled and the target-side value is Expected. | [default to String]
**activityDate** | **String** | The core rule whose target-side formula is the unmodified &#39;activityDate&#39;. The origin side supplies the actual settlement date. | [default to String]
**units** | **String** | The aggregate rule whose target-side formula is the unmodified &#39;units&#39;. The origin side supplies the units, and the tolerance on this rule classifies the units difference. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.SettleExpectedActivityRuleNames;
import java.util.*;
import java.lang.System;
import java.net.URI;

String activityType = "example activityType";
String activityDate = "example activityDate";
String units = "example units";


SettleExpectedActivityRuleNames settleExpectedActivityRuleNamesInstance = new SettleExpectedActivityRuleNames()
    .activityType(activityType)
    .activityDate(activityDate)
    .units(units);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)