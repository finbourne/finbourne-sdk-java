# com.finbourne.sdk.services.lusid.model.SettlementFx
classname SettlementFx
The FX gain or loss on a settlement instruction, with its transaction's realised gain or loss.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**settlementCurrency** | **String** |  | [optional] [default to String]
**settlementAmount** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**portfolioCurrencyAmount** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**tradeDateFxRate** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**fxRateUsed** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**fxRateSource** | **String** |  | [optional] [default to String]
**fxGainLossOnSettlement** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**totalRealisedGainLossOnTransaction** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.SettlementFx;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String settlementCurrency = "example settlementCurrency";
java.math.BigDecimal settlementAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal portfolioCurrencyAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal tradeDateFxRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal fxRateUsed = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String fxRateSource = "example fxRateSource";
@javax.annotation.Nullable java.math.BigDecimal fxGainLossOnSettlement = new java.math.BigDecimal("100.00");
java.math.BigDecimal totalRealisedGainLossOnTransaction = new java.math.BigDecimal("100.00");


SettlementFx settlementFxInstance = new SettlementFx()
    .settlementCurrency(settlementCurrency)
    .settlementAmount(settlementAmount)
    .portfolioCurrencyAmount(portfolioCurrencyAmount)
    .tradeDateFxRate(tradeDateFxRate)
    .fxRateUsed(fxRateUsed)
    .fxRateSource(fxRateSource)
    .fxGainLossOnSettlement(fxGainLossOnSettlement)
    .totalRealisedGainLossOnTransaction(totalRealisedGainLossOnTransaction);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)