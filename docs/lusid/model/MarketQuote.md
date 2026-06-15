# com.finbourne.sdk.services.lusid.model.MarketQuote
classname MarketQuote
The market quote for an observable which will be used to calibrate the market data,  including the format of the quote.  e.g. a volatility quote for a specific strike and expiry  the par rate of a swap                This is a slimmed down version of a full Quote that can be stored in our QuoteStore to  remove lineage, price source etc. for ease of use when creating complex market data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quoteType** | **String** | Available values: Price, Spread, Rate, LogNormalVol, NormalVol, ParSpread, IsdaSpread, Upfront, Index, Ratio, Delta, PoolFactor, InflationAssumption, DirtyPrice, PrincipalWriteOff, InterestDeferred, InterestShortfall, ConstituentWeightFactor. | [default to String]
**value** | **java.math.BigDecimal** | Numeric value of the quote | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.MarketQuote;
import java.util.*;
import java.lang.System;
import java.net.URI;

String quoteType = "example quoteType";
java.math.BigDecimal value = new java.math.BigDecimal("100.00");


MarketQuote marketQuoteInstance = new MarketQuote()
    .quoteType(quoteType)
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)