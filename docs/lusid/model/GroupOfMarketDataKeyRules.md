# com.finbourne.sdk.services.lusid.model.GroupOfMarketDataKeyRules
classname GroupOfMarketDataKeyRules
Represents a collection of MarketDataKeyRules that should be resolved together when resolving market data.  That is, market data resolution will always attempt to resolve with all rules in the group  before deciding what market data to return.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketDataKeyRuleGroupOperation** | **String** | The operation that will be used to process the collection of market data items and failures found on resolution  into a single market data item or failure to be used. Available values: FirstLatest, AverageOfQuotesFound, AverageOfAllQuotes, FirstMinimum, FirstMaximum. | [default to String]
**marketRules** | [**List&lt;MarketDataKeyRule&gt;**](MarketDataKeyRule.md) | The rules that should be grouped together in market data resolution. | [default to List<MarketDataKeyRule>]

```java
import com.finbourne.sdk.services.lusid.model.GroupOfMarketDataKeyRules;
import java.util.*;
import java.lang.System;
import java.net.URI;

String marketDataKeyRuleGroupOperation = "example marketDataKeyRuleGroupOperation";
List<MarketDataKeyRule> marketRules = new List<MarketDataKeyRule>();


GroupOfMarketDataKeyRules groupOfMarketDataKeyRulesInstance = new GroupOfMarketDataKeyRules()
    .marketDataKeyRuleGroupOperation(marketDataKeyRuleGroupOperation)
    .marketRules(marketRules);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)