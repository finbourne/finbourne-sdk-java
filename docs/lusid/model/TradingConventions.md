# com.finbourne.sdk.services.lusid.model.TradingConventions
classname TradingConventions
Common Trading details for exchange traded instruments like Futures and Bonds

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**priceScaleFactor** | **java.math.BigDecimal** | The factor used to scale prices for the instrument. Currently used by LUSID when calculating cost  and notional amounts on transactions, and in Valuation, PV and exposure when the recipe&#39;s  UseInstrumentScaleFactorAsDefault pricing option is set: a lookup-priced instrument whose price  quote declares no scale factor of its own is then scaled by this factor. When that option is not  set, only the scale factor attached to the price quotes in the QuoteStore is used.  Must be positive and defaults to 1 if not set. | [optional] [default to java.math.BigDecimal]
**minimumOrderSize** | **java.math.BigDecimal** | The Minimum Order Size  Must be non-negative and defaults to 0 if not set. | [optional] [default to java.math.BigDecimal]
**minimumOrderIncrement** | **java.math.BigDecimal** | The Minimum Order Increment  Must be non-negative and defaults to 0 if not set. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.TradingConventions;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal priceScaleFactor = new java.math.BigDecimal("100.00");
java.math.BigDecimal minimumOrderSize = new java.math.BigDecimal("100.00");
java.math.BigDecimal minimumOrderIncrement = new java.math.BigDecimal("100.00");


TradingConventions tradingConventionsInstance = new TradingConventions()
    .priceScaleFactor(priceScaleFactor)
    .minimumOrderSize(minimumOrderSize)
    .minimumOrderIncrement(minimumOrderIncrement);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)