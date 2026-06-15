# com.finbourne.sdk.services.lusid.model.PortfolioHolding
classname PortfolioHolding
A list of holdings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentScope** | **String** | The scope in which the holding&#39;s instrument is in. | [optional] [default to String]
**instrumentUid** | **String** | The unique Lusid Instrument Id (LUID) of the instrument that the holding is in. | [default to String]
**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The sub-holding properties which identify the holding. Each property will be from the &#39;Transaction&#39; domain. These are configured on a transaction portfolio. | [optional] [default to Map<String, PerpetualProperty>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The properties which have been requested to be decorated onto the holding. These will be from the &#39;Instrument&#39; or &#39;Holding&#39; domain. | [optional] [default to Map<String, Property>]
**holdingType** | **String** | The code for the type of the holding e.g. P, B, C, R, F etc. | [default to String]
**units** | **java.math.BigDecimal** | The total number of units of the holding. | [default to java.math.BigDecimal]
**settledUnits** | **java.math.BigDecimal** | The total number of settled units of the holding. | [default to java.math.BigDecimal]
**cost** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**costPortfolioCcy** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**transaction** | [**Transaction**](Transaction.md) |  | [optional] [default to Transaction]
**currency** | **String** | The holding currency. | [optional] [default to String]
**holdingTypeName** | **String** | The decoded type of the holding e.g. Position, Balance, CashCommitment, Receivable, ForwardFX etc. | [optional] [default to String]
**holdingId** | **Long** | A single identifier for the holding within the portfolio. The holdingId is constructed from the LusidInstrumentId, sub-holding keys and currrency and is unique within the portfolio. | [optional] [default to Long]
**notionalCost** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**amortisedCost** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**amortisedCostPortfolioCcy** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**variationMargin** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**variationMarginPortfolioCcy** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**settlementSchedule** | [**List&lt;SettlementSchedule&gt;**](SettlementSchedule.md) | Where no. of days ahead has been specified, future dated settlements will be captured here. | [optional] [default to List<SettlementSchedule>]
**currentFace** | **java.math.BigDecimal** | Current face value of the holding. | [optional] [default to java.math.BigDecimal]
**custodianAccountId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**unsettledUnits** | **java.math.BigDecimal** | The number of unsettled units for the holding. | [optional] [default to java.math.BigDecimal]
**overdueUnits** | **java.math.BigDecimal** | The number of unsettled units for the holding that are beyond their contractual settlement date. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.PortfolioHolding;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String instrumentScope = "example instrumentScope";
String instrumentUid = "example instrumentUid";
@javax.annotation.Nullable Map<String, PerpetualProperty> subHoldingKeys = new Map<String, PerpetualProperty>();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
String holdingType = "example holdingType";
java.math.BigDecimal units = new java.math.BigDecimal("100.00");
java.math.BigDecimal settledUnits = new java.math.BigDecimal("100.00");
CurrencyAndAmount cost = new CurrencyAndAmount();
CurrencyAndAmount costPortfolioCcy = new CurrencyAndAmount();
Transaction transaction = new Transaction();
@javax.annotation.Nullable String currency = "example currency";
@javax.annotation.Nullable String holdingTypeName = "example holdingTypeName";
@javax.annotation.Nullable Long holdingId = new Long("100.00");
CurrencyAndAmount notionalCost = new CurrencyAndAmount();
CurrencyAndAmount amortisedCost = new CurrencyAndAmount();
CurrencyAndAmount amortisedCostPortfolioCcy = new CurrencyAndAmount();
CurrencyAndAmount variationMargin = new CurrencyAndAmount();
CurrencyAndAmount variationMarginPortfolioCcy = new CurrencyAndAmount();
@javax.annotation.Nullable List<SettlementSchedule> settlementSchedule = new List<SettlementSchedule>();
@javax.annotation.Nullable java.math.BigDecimal currentFace = new java.math.BigDecimal("100.00");
ResourceId custodianAccountId = new ResourceId();
java.math.BigDecimal unsettledUnits = new java.math.BigDecimal("100.00");
java.math.BigDecimal overdueUnits = new java.math.BigDecimal("100.00");


PortfolioHolding portfolioHoldingInstance = new PortfolioHolding()
    .instrumentScope(instrumentScope)
    .instrumentUid(instrumentUid)
    .subHoldingKeys(subHoldingKeys)
    .properties(properties)
    .holdingType(holdingType)
    .units(units)
    .settledUnits(settledUnits)
    .cost(cost)
    .costPortfolioCcy(costPortfolioCcy)
    .transaction(transaction)
    .currency(currency)
    .holdingTypeName(holdingTypeName)
    .holdingId(holdingId)
    .notionalCost(notionalCost)
    .amortisedCost(amortisedCost)
    .amortisedCostPortfolioCcy(amortisedCostPortfolioCcy)
    .variationMargin(variationMargin)
    .variationMarginPortfolioCcy(variationMarginPortfolioCcy)
    .settlementSchedule(settlementSchedule)
    .currentFace(currentFace)
    .custodianAccountId(custodianAccountId)
    .unsettledUnits(unsettledUnits)
    .overdueUnits(overdueUnits);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)