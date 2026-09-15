# com.finbourne.sdk.services.lusid.model.MdkrGroupShiftDefinition
classname MdkrGroupShiftDefinition
A group of keyed market data key rules (e.g. bid/mid/ask). When the scenario is used in a  valuation, each key's rule re-resolves the matching market data dependencies independently and  produces its own result column named scenario:key, alongside the base column - which continues to  resolve through the recipe's own rules in the standard waterfall, whether or not the same rules  appear here.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scenarioShiftType** | **String** | Available values: RateCurveShiftDefinition, FxShiftDefinition, PriceShiftDefinition, VolSurfaceShiftDefinition, MdkrGroupShiftDefinition, InflationCurveShiftDefinition, CreditSpreadShiftDefinition, ModelOptionShiftDefinition. | [default to String]
**rules** | [**List&lt;KeyedMarketDataKeyRule&gt;**](KeyedMarketDataKeyRule.md) | The keyed rules of the group. Keys must be unique within the group; each key produces one  result column. | [default to List<KeyedMarketDataKeyRule>]

```java
import com.finbourne.sdk.services.lusid.model.MdkrGroupShiftDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<KeyedMarketDataKeyRule> rules = new List<KeyedMarketDataKeyRule>();


MdkrGroupShiftDefinition mdkrGroupShiftDefinitionInstance = new MdkrGroupShiftDefinition()
    .rules(rules);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)