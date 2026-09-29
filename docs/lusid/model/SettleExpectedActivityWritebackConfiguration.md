# com.finbourne.sdk.services.lusid.model.SettleExpectedActivityWritebackConfiguration
classname SettleExpectedActivityWritebackConfiguration
Suggests settlement instructions where settlement on the origin side confirms expected settlement activity  on the target side. Only valid on a ruleset whose recType is SettlementActivity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mandatoryRuleNames** | [**SettleExpectedActivityRuleNames**](SettleExpectedActivityRuleNames.md) |  | [default to SettleExpectedActivityRuleNames]
**resultPatterns** | [**List&lt;WritebackResultPattern&gt;**](WritebackResultPattern.md) | The combinations of units difference and result cardinality for which writeback is suggested. A combination that is not present never produces a suggestion. Each combination may appear once, and the collection is returned in a canonical order regardless of the order supplied. | [default to List<WritebackResultPattern>]
**writebackType** | **String** | Polymorphic discriminator, naming the change the writeback makes to LUSID. Supported types: SettleExpectedActivity, which is only valid when recType is SettlementActivity. Available values: SettleExpectedActivity. | [default to String]
**targetSide** | **String** | The side the writeback changes, the other being the source of truth. As the writeback changes LUSID, this side must draw on a native LUSID dataset rather than relational data. Available values: Left, Right. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.SettleExpectedActivityWritebackConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

SettleExpectedActivityRuleNames mandatoryRuleNames = new SettleExpectedActivityRuleNames();
List<WritebackResultPattern> resultPatterns = new List<WritebackResultPattern>();
String writebackType = "example writebackType";
String targetSide = "example targetSide";


SettleExpectedActivityWritebackConfiguration settleExpectedActivityWritebackConfigurationInstance = new SettleExpectedActivityWritebackConfiguration()
    .mandatoryRuleNames(mandatoryRuleNames)
    .resultPatterns(resultPatterns)
    .writebackType(writebackType)
    .targetSide(targetSide);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)