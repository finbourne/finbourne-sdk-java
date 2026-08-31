# com.finbourne.sdk.services.lusid.model.HullWhiteModelOptions
classname HullWhiteModelOptions
Model options for the Hull-White one-factor lattice pricer.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modelOptionsType** | **String** | Available values: Invalid, OpaqueModelOptions, EmptyModelOptions, IndexModelOptions, FxForwardModelOptions, FundingLegModelOptions, EquityModelOptions, CdsModelOptions, FlexibleLoanPricerOptions, HullWhiteModelOptions, BondLookupModelOptions. | [default to String]
**meanReversion** | **java.math.BigDecimal** | The mean reversion speed of the short rate. Must be strictly positive. Defaults to 0.03. | [optional] [default to java.math.BigDecimal]
**volatility** | **java.math.BigDecimal** | The normal (absolute) volatility of the short rate, e.g. 0.008 for 80bp per year. Defaults to 0.008. | [optional] [default to java.math.BigDecimal]
**latticeSteps** | **Integer** | The number of uniform time steps in the lattice. More steps give a finer discretisation  of the short-rate process at greater computational cost. Defaults to 200. | [optional] [default to Integer]
**meanReversionByCurrency** | **Map&lt;String, java.math.BigDecimal&gt;** | Per-currency mean-reversion overrides, keyed by ISO currency code.  A currency absent from this map uses MeanReversion. | [optional] [default to Map<String, java.math.BigDecimal>]
**volatilityByCurrency** | **Map&lt;String, java.math.BigDecimal&gt;** | Per-currency short-rate volatility overrides, keyed by ISO currency code.  A currency absent from this map uses Volatility. Short-rate volatility is a per-currency  quantity in practice, so a book spanning several currencies can calibrate each currency  separately instead of sharing a single global figure. | [optional] [default to Map<String, java.math.BigDecimal>]

```java
import com.finbourne.sdk.services.lusid.model.HullWhiteModelOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal meanReversion = new java.math.BigDecimal("100.00");
java.math.BigDecimal volatility = new java.math.BigDecimal("100.00");
Integer latticeSteps = new Integer("100.00");
@javax.annotation.Nullable Map<String, java.math.BigDecimal> meanReversionByCurrency = new Map<String, java.math.BigDecimal>();
@javax.annotation.Nullable Map<String, java.math.BigDecimal> volatilityByCurrency = new Map<String, java.math.BigDecimal>();


HullWhiteModelOptions hullWhiteModelOptionsInstance = new HullWhiteModelOptions()
    .meanReversion(meanReversion)
    .volatility(volatility)
    .latticeSteps(latticeSteps)
    .meanReversionByCurrency(meanReversionByCurrency)
    .volatilityByCurrency(volatilityByCurrency);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)