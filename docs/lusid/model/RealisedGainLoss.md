# com.finbourne.sdk.services.lusid.model.RealisedGainLoss
classname RealisedGainLoss

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentScope** | **String** | The scope in which the instrument lies. | [optional] [default to String]
**instrumentUid** | **String** | The unique Lusid Instrument Id (LUID) of the instrument that this gain or loss is associated with. | [default to String]
**units** | **java.math.BigDecimal** | The number of units of the associated instrument against which the gain or loss has been realised. | [default to java.math.BigDecimal]
**purchaseTradeDate** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which the units associated with this gain or loss were originally purchased. | [optional] [readonly] [default to OffsetDateTime]
**purchaseSettlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which the units associated with this gain or loss were originally settled. | [optional] [readonly] [default to OffsetDateTime]
**purchasePrice** | **java.math.BigDecimal** | The purchase price of each unit associated with this gain or loss. | [optional] [default to java.math.BigDecimal]
**costTradeCcy** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**costPortfolioCcy** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**realisedTradeCcy** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**realisedTotal** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**realisedMarket** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**realisedCurrency** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**taxLotId** | **String** | The identifier of the tax lot with which this gain or loss is associated. | [optional] [default to String]
**realisedAmortisation** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**tradeDateToSettlementDateRealisedCurrency** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]

```java
import com.finbourne.sdk.services.lusid.model.RealisedGainLoss;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String instrumentScope = "example instrumentScope";
String instrumentUid = "example instrumentUid";
java.math.BigDecimal units = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable OffsetDateTime purchaseTradeDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime purchaseSettlementDate = OffsetDateTime.now();
@javax.annotation.Nullable java.math.BigDecimal purchasePrice = new java.math.BigDecimal("100.00");
CurrencyAndAmount costTradeCcy = new CurrencyAndAmount();
CurrencyAndAmount costPortfolioCcy = new CurrencyAndAmount();
CurrencyAndAmount realisedTradeCcy = new CurrencyAndAmount();
CurrencyAndAmount realisedTotal = new CurrencyAndAmount();
CurrencyAndAmount realisedMarket = new CurrencyAndAmount();
CurrencyAndAmount realisedCurrency = new CurrencyAndAmount();
@javax.annotation.Nullable String taxLotId = "example taxLotId";
CurrencyAndAmount realisedAmortisation = new CurrencyAndAmount();
CurrencyAndAmount tradeDateToSettlementDateRealisedCurrency = new CurrencyAndAmount();


RealisedGainLoss realisedGainLossInstance = new RealisedGainLoss()
    .instrumentScope(instrumentScope)
    .instrumentUid(instrumentUid)
    .units(units)
    .purchaseTradeDate(purchaseTradeDate)
    .purchaseSettlementDate(purchaseSettlementDate)
    .purchasePrice(purchasePrice)
    .costTradeCcy(costTradeCcy)
    .costPortfolioCcy(costPortfolioCcy)
    .realisedTradeCcy(realisedTradeCcy)
    .realisedTotal(realisedTotal)
    .realisedMarket(realisedMarket)
    .realisedCurrency(realisedCurrency)
    .taxLotId(taxLotId)
    .realisedAmortisation(realisedAmortisation)
    .tradeDateToSettlementDateRealisedCurrency(tradeDateToSettlementDateRealisedCurrency);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)