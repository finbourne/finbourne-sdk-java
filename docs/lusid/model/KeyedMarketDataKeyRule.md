# com.finbourne.sdk.services.lusid.model.KeyedMarketDataKeyRule
classname KeyedMarketDataKeyRule
One keyed rule of an MdkrGroup shift: the key names the result column (scenario:key) and the rule  is a standard market data key rule resolved for that column.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The key naming this rule&#39;s result column, e.g. \&quot;bid\&quot;. | [default to String]
**rule** | [**MarketDataKeyRule**](MarketDataKeyRule.md) |  | [default to MarketDataKeyRule]

```java
import com.finbourne.sdk.services.lusid.model.KeyedMarketDataKeyRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String key = "example key";
MarketDataKeyRule rule = new MarketDataKeyRule();


KeyedMarketDataKeyRule keyedMarketDataKeyRuleInstance = new KeyedMarketDataKeyRule()
    .key(key)
    .rule(rule);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)