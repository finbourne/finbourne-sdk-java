# com.finbourne.sdk.services.lusid.model.CreateTransferRequest
classname CreateTransferRequest
A request to create a transfer: the paired transaction legs that move a position, and the Transfer entity  recording them.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transferId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**portfolioIdOut** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**portfolioIdIn** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**instrumentIdentifierOut** | **String** |  | [default to String]
**instrumentIdentifierIn** | **String** |  | [default to String]
**pricingMethod** | **String** | Available values: AtCost, AtPrice. | [default to String]
**taxLotStructure** | **String** | Available values: Consolidate, Preserve. | [optional] [default to String]
**unitsOut** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**unitsIn** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**amountOut** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**weightOut** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**tradeDateOut** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**tradeDateIn** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**settlementDateOut** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**settlementDateIn** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**exchangeRateOut** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**exchangeRateIn** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**transactionPriceOut** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**transactionPriceIn** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**counterpartyIdOut** | **String** |  | [optional] [default to String]
**counterpartyIdIn** | **String** |  | [optional] [default to String]
**custodianAccountIdOut** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**custodianAccountIdIn** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**source** | **String** |  | [default to String]
**accountingMethod** | **String** | Available values: AverageCost, FirstInFirstOut, LastInFirstOut, HighestCostFirst, LowestCostFirst, ProRateByUnits, ProRateByCost, ProRateByCostPortfolioCurrency, IntraDayThenFirstInFirstOut, LongTermHighestCostFirst, LongTermHighestCostFirstPortfolioCurrency, HighestCostFirstPortfolioCurrency, LowestCostFirstPortfolioCurrency, MaximumLossMinimumGain, MaximumLossMinimumGainPortfolioCurrency. | [optional] [default to String]
**propertiesOut** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) |  | [optional] [default to Map<String, PerpetualProperty>]
**propertiesIn** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) |  | [optional] [default to Map<String, PerpetualProperty>]

```java
import com.finbourne.sdk.services.lusid.model.CreateTransferRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId transferId = new ResourceId();
ResourceId portfolioIdOut = new ResourceId();
ResourceId portfolioIdIn = new ResourceId();
String instrumentIdentifierOut = "example instrumentIdentifierOut";
String instrumentIdentifierIn = "example instrumentIdentifierIn";
String pricingMethod = "example pricingMethod";
@javax.annotation.Nullable String taxLotStructure = "example taxLotStructure";
java.math.BigDecimal unitsOut = new java.math.BigDecimal("100.00");
java.math.BigDecimal unitsIn = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal amountOut = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal weightOut = new java.math.BigDecimal("100.00");
OffsetDateTime tradeDateOut = OffsetDateTime.now();
OffsetDateTime tradeDateIn = OffsetDateTime.now();
OffsetDateTime settlementDateOut = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime settlementDateIn = OffsetDateTime.now();
@javax.annotation.Nullable java.math.BigDecimal exchangeRateOut = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal exchangeRateIn = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal transactionPriceOut = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal transactionPriceIn = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String counterpartyIdOut = "example counterpartyIdOut";
@javax.annotation.Nullable String counterpartyIdIn = "example counterpartyIdIn";
ResourceId custodianAccountIdOut = new ResourceId();
ResourceId custodianAccountIdIn = new ResourceId();
String source = "example source";
@javax.annotation.Nullable String accountingMethod = "example accountingMethod";
@javax.annotation.Nullable Map<String, PerpetualProperty> propertiesOut = new Map<String, PerpetualProperty>();
@javax.annotation.Nullable Map<String, PerpetualProperty> propertiesIn = new Map<String, PerpetualProperty>();


CreateTransferRequest createTransferRequestInstance = new CreateTransferRequest()
    .transferId(transferId)
    .portfolioIdOut(portfolioIdOut)
    .portfolioIdIn(portfolioIdIn)
    .instrumentIdentifierOut(instrumentIdentifierOut)
    .instrumentIdentifierIn(instrumentIdentifierIn)
    .pricingMethod(pricingMethod)
    .taxLotStructure(taxLotStructure)
    .unitsOut(unitsOut)
    .unitsIn(unitsIn)
    .amountOut(amountOut)
    .weightOut(weightOut)
    .tradeDateOut(tradeDateOut)
    .tradeDateIn(tradeDateIn)
    .settlementDateOut(settlementDateOut)
    .settlementDateIn(settlementDateIn)
    .exchangeRateOut(exchangeRateOut)
    .exchangeRateIn(exchangeRateIn)
    .transactionPriceOut(transactionPriceOut)
    .transactionPriceIn(transactionPriceIn)
    .counterpartyIdOut(counterpartyIdOut)
    .counterpartyIdIn(counterpartyIdIn)
    .custodianAccountIdOut(custodianAccountIdOut)
    .custodianAccountIdIn(custodianAccountIdIn)
    .source(source)
    .accountingMethod(accountingMethod)
    .propertiesOut(propertiesOut)
    .propertiesIn(propertiesIn);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)