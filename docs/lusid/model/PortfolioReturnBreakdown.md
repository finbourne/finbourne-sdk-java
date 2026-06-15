# com.finbourne.sdk.services.lusid.model.PortfolioReturnBreakdown
classname PortfolioReturnBreakdown
A list of Composite Breakdowns.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**rateOfReturn** | **java.math.BigDecimal** | The return number. | [optional] [default to java.math.BigDecimal]
**openingMarketValue** | **java.math.BigDecimal** | The opening market value. | [optional] [default to java.math.BigDecimal]
**closingMarketValue** | **java.math.BigDecimal** | The closing market value. | [optional] [default to java.math.BigDecimal]
**weight** | **java.math.BigDecimal** | The weight of the constituent into the composite. | [optional] [default to java.math.BigDecimal]
**constituentsInTheComposite** | **Integer** | The number of members in the Composite on the given day. | [optional] [default to Integer]
**constituentsMissing** | **Integer** | The number of the constituents which have a missing return on that day. | [optional] [default to Integer]
**currency** | **String** | The currency of the portfolio. | [optional] [default to String]
**openFxRate** | **java.math.BigDecimal** | The opening fxRate which is used in calculation. | [optional] [default to java.math.BigDecimal]
**closeFxRate** | **java.math.BigDecimal** | The closing fxRate which is used in calculation. | [optional] [default to java.math.BigDecimal]
**localRateOfReturn** | **java.math.BigDecimal** | The rate of return in the local currency. | [optional] [default to java.math.BigDecimal]
**localOpeningMarketValue** | **java.math.BigDecimal** | The opening market value in the local currency. | [optional] [default to java.math.BigDecimal]
**localClosingMarketValue** | **java.math.BigDecimal** | The closing market value in the local currency. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.PortfolioReturnBreakdown;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId portfolioId = new ResourceId();
java.math.BigDecimal rateOfReturn = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal openingMarketValue = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal closingMarketValue = new java.math.BigDecimal("100.00");
java.math.BigDecimal weight = new java.math.BigDecimal("100.00");
Integer constituentsInTheComposite = new Integer("100.00");
Integer constituentsMissing = new Integer("100.00");
@javax.annotation.Nullable String currency = "example currency";
java.math.BigDecimal openFxRate = new java.math.BigDecimal("100.00");
java.math.BigDecimal closeFxRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal localRateOfReturn = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal localOpeningMarketValue = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal localClosingMarketValue = new java.math.BigDecimal("100.00");


PortfolioReturnBreakdown portfolioReturnBreakdownInstance = new PortfolioReturnBreakdown()
    .portfolioId(portfolioId)
    .rateOfReturn(rateOfReturn)
    .openingMarketValue(openingMarketValue)
    .closingMarketValue(closingMarketValue)
    .weight(weight)
    .constituentsInTheComposite(constituentsInTheComposite)
    .constituentsMissing(constituentsMissing)
    .currency(currency)
    .openFxRate(openFxRate)
    .closeFxRate(closeFxRate)
    .localRateOfReturn(localRateOfReturn)
    .localOpeningMarketValue(localOpeningMarketValue)
    .localClosingMarketValue(localClosingMarketValue);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)