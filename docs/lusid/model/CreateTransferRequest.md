# com.finbourne.sdk.services.lusid.model.CreateTransferRequest
classname CreateTransferRequest
A request to create a transfer: the paired transaction legs that move a position, and the Transfer entity  recording them.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transferId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**portfolioIdOut** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**portfolioIdIn** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**instrumentIdentifierOut** | **String** | The LUSID instrument id of the instrument moving out. A position in this instrument must exist in the outgoing portfolio on the outgoing trade date. | [default to String]
**instrumentIdentifierIn** | **String** | The LUSID instrument id of the instrument moving in. Equal to InstrumentIdentifierOut for a transfer between portfolios. | [default to String]
**pricingMethod** | **String** | How the legs are priced. &#39;AtCost&#39; uses the cost per unit of the outgoing holding; &#39;AtPrice&#39; uses the supplied TransactionPriceOut, which is then required. Available values: AtCost, AtPrice. | [default to String]
**taxLotStructure** | **String** | What happens to the tax lots of the outgoing position. Only &#39;Consolidate&#39; is currently supported; &#39;Preserve&#39; is rejected. Defaults to &#39;Consolidate&#39;. Available values: Consolidate, Preserve. | [optional] [default to String]
**unitsOut** | **java.math.BigDecimal** | The number of units to move out. Must be greater than zero. | [default to java.math.BigDecimal]
**unitsIn** | **java.math.BigDecimal** | The number of units to move in. Must be greater than zero. | [default to java.math.BigDecimal]
**amountOut** | **java.math.BigDecimal** | The total consideration of the outgoing leg. Recorded, not applied. | [optional] [default to java.math.BigDecimal]
**weightOut** | **java.math.BigDecimal** | The weighting factor of the outgoing leg. Recorded, not applied. | [optional] [default to java.math.BigDecimal]
**tradeDateOut** | [**OffsetDateTime**](OffsetDateTime.md) | The trade date of the outgoing leg. Must not be later than TradeDateIn. | [default to OffsetDateTime]
**tradeDateIn** | [**OffsetDateTime**](OffsetDateTime.md) | The trade date of the incoming leg. | [default to OffsetDateTime]
**settlementDateOut** | [**OffsetDateTime**](OffsetDateTime.md) | The settlement date of the outgoing leg. Must not be later than SettlementDateIn. | [default to OffsetDateTime]
**settlementDateIn** | [**OffsetDateTime**](OffsetDateTime.md) | The settlement date of the incoming leg. Defaults to SettlementDateOut when not supplied. | [optional] [default to OffsetDateTime]
**exchangeRateOut** | **java.math.BigDecimal** | The FX rate to apply to the outgoing leg. | [optional] [default to java.math.BigDecimal]
**exchangeRateIn** | **java.math.BigDecimal** | The FX rate to apply to the incoming leg. | [optional] [default to java.math.BigDecimal]
**transactionPriceOut** | **java.math.BigDecimal** | The unit price of the outgoing leg. Required when PricingMethod is &#39;AtPrice&#39;, and ignored when it is &#39;AtCost&#39;. | [optional] [default to java.math.BigDecimal]
**transactionPriceIn** | **java.math.BigDecimal** | The unit price of the incoming leg. Ignored for a transfer, which carries the outgoing price across; defaults to the outgoing price for a switch. | [optional] [default to java.math.BigDecimal]
**counterpartyIdOut** | **String** | The counterparty identifier of the outgoing leg. | [optional] [default to String]
**counterpartyIdIn** | **String** | The counterparty identifier of the incoming leg. Defaults to CounterpartyIdOut. | [optional] [default to String]
**custodianAccountIdOut** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**custodianAccountIdIn** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**source** | **String** | The transaction source the generated legs are booked against. | [default to String]
**accountingMethod** | **String** | An accounting method to record against the transfer. Available values: AverageCost, FirstInFirstOut, LastInFirstOut, HighestCostFirst, LowestCostFirst, ProRateByUnits, ProRateByCost, ProRateByCostPortfolioCurrency, IntraDayThenFirstInFirstOut, LongTermHighestCostFirst, LongTermHighestCostFirstPortfolioCurrency, HighestCostFirstPortfolioCurrency, LowestCostFirstPortfolioCurrency, MaximumLossMinimumGain, MaximumLossMinimumGainPortfolioCurrency. | [optional] [default to String]
**propertiesOut** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Transaction Properties to set on the outgoing transaction leg, and on the incoming transaction leg when PropertiesIn is absent. Supplying an empty collection for PropertiesIn leaves the incoming leg with no properties. | [optional] [default to Map<String, PerpetualProperty>]
**propertiesIn** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Transaction Properties to set on the incoming transaction leg, replacing rather than adding to PropertiesOut. | [optional] [default to Map<String, PerpetualProperty>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Properties to set on the transfer itself, in the Transfer domain. These are separate from PropertiesOut and PropertiesIn, which are Transaction domain and land on the legs. | [optional] [default to Map<String, PerpetualProperty>]

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
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();


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
    .propertiesIn(propertiesIn)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)