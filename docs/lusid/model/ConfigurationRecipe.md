# com.finbourne.sdk.services.lusid.model.ConfigurationRecipe
classname ConfigurationRecipe
The Configuration or Calculation Recipe controls how LUSID processes a given request.  This can be used to change where market data used in pricing is loaded from and in what order, or which model is used to  price a given instrument as well as how aggregation will process the produced results.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope used when updating or inserting the Configuration Recipe. | [default to String]
**code** | **String** | User given string name (code) to identify the recipe. | [default to String]
**market** | [**MarketContext**](MarketContext.md) |  | [optional] [default to MarketContext]
**pricing** | [**PricingContext**](PricingContext.md) |  | [optional] [default to PricingContext]
**aggregation** | [**AggregationContext**](AggregationContext.md) |  | [optional] [default to AggregationContext]
**description** | **String** | User can assign a description to understand more humanly the recipe. | [optional] [default to String]
**holding** | [**HoldingContext**](HoldingContext.md) |  | [optional] [default to HoldingContext]
**translation** | [**TranslationContext**](TranslationContext.md) |  | [optional] [default to TranslationContext]

```java
import com.finbourne.sdk.services.lusid.model.ConfigurationRecipe;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scope = "example scope";
String code = "example code";
MarketContext market = new MarketContext();
PricingContext pricing = new PricingContext();
AggregationContext aggregation = new AggregationContext();
@javax.annotation.Nullable String description = "example description";
HoldingContext holding = new HoldingContext();
TranslationContext translation = new TranslationContext();


ConfigurationRecipe configurationRecipeInstance = new ConfigurationRecipe()
    .scope(scope)
    .code(code)
    .market(market)
    .pricing(pricing)
    .aggregation(aggregation)
    .description(description)
    .holding(holding)
    .translation(translation);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)