# com.finbourne.sdk.services.lusid.model.FundCashStatementRow
classname FundCashStatementRow
A single row in a Fund Cash Statement report.  Each row represents a settled cash movement with running balance, cost basis,  average rate, and realised FX PnL.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupById** | **Integer** | The groupBy subHoldings and currency. | [optional] [default to Integer]
**sequenceNumber** | **Integer** | Sequence number determining the order of the cash flow records. | [optional] [default to Integer]
**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The sub-holding properties which identify the holding. Each property will be from the &#39;Transaction&#39; domain. These are configured on a transaction portfolio. | [optional] [default to Map<String, PerpetualProperty>]
**sourceId** | **String** | The transaction ID that sourced this cash movement. | [optional] [default to String]
**cashStatementActionType** | **String** | The action type: Default, Reversal, TrueUp, AvgRateCorrection, Opening, or Closing. | [optional] [default to String]
**accountingDate** | [**OffsetDateTime**](OffsetDateTime.md) | The accounting date of the cash movement. | [optional] [default to OffsetDateTime]
**activityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The activity date (trade/settlement date) of the cash movement. | [optional] [default to OffsetDateTime]
**movementName** | **String** | The movement type (e.g. Receivable_Cash_Trade, Payable_Cash_Trade). | [optional] [default to String]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**instructionType** | **String** | The settlement instruction type: Automatic, Instructed_Complete, Instructed - Cancel Automatic. | [optional] [default to String]
**diaryEntryCode** | **String** | The diary entry code of the valuation point this row belongs to. | [optional] [default to String]
**originDiaryEntryCode** | **String** | For Reversal/TrueUp rows: the diary entry code of the period the original row belonged to. | [optional] [default to String]
**cashflowLocal** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**balanceLocal** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**cashflowBase** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**realisedFxPnl** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**costBasisBase** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**avgRate** | **java.math.BigDecimal** | Weighted average FX rate (costBasisBase / balanceLocal). Null when balance is zero. | [optional] [default to java.math.BigDecimal]
**fxRateMovement** | **java.math.BigDecimal** | FX rate for this specific movement (CashflowBase / CashFlowLocal). Null when localAmount is zero. | [optional] [default to java.math.BigDecimal]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The requested properties decorated onto the cash statement row. | [optional] [default to Map<String, Property>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.FundCashStatementRow;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer groupById = new Integer("100.00");
Integer sequenceNumber = new Integer("100.00");
@javax.annotation.Nullable Map<String, PerpetualProperty> subHoldingKeys = new Map<String, PerpetualProperty>();
@javax.annotation.Nullable String sourceId = "example sourceId";
@javax.annotation.Nullable String cashStatementActionType = "example cashStatementActionType";
OffsetDateTime accountingDate = OffsetDateTime.now();
OffsetDateTime activityDate = OffsetDateTime.now();
@javax.annotation.Nullable String movementName = "example movementName";
ResourceId portfolioId = new ResourceId();
@javax.annotation.Nullable String instructionType = "example instructionType";
@javax.annotation.Nullable String diaryEntryCode = "example diaryEntryCode";
@javax.annotation.Nullable String originDiaryEntryCode = "example originDiaryEntryCode";
CurrencyAndAmount cashflowLocal = new CurrencyAndAmount();
CurrencyAndAmount balanceLocal = new CurrencyAndAmount();
CurrencyAndAmount cashflowBase = new CurrencyAndAmount();
CurrencyAndAmount realisedFxPnl = new CurrencyAndAmount();
CurrencyAndAmount costBasisBase = new CurrencyAndAmount();
@javax.annotation.Nullable java.math.BigDecimal avgRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal fxRateMovement = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


FundCashStatementRow fundCashStatementRowInstance = new FundCashStatementRow()
    .groupById(groupById)
    .sequenceNumber(sequenceNumber)
    .subHoldingKeys(subHoldingKeys)
    .sourceId(sourceId)
    .cashStatementActionType(cashStatementActionType)
    .accountingDate(accountingDate)
    .activityDate(activityDate)
    .movementName(movementName)
    .portfolioId(portfolioId)
    .instructionType(instructionType)
    .diaryEntryCode(diaryEntryCode)
    .originDiaryEntryCode(originDiaryEntryCode)
    .cashflowLocal(cashflowLocal)
    .balanceLocal(balanceLocal)
    .cashflowBase(cashflowBase)
    .realisedFxPnl(realisedFxPnl)
    .costBasisBase(costBasisBase)
    .avgRate(avgRate)
    .fxRateMovement(fxRateMovement)
    .properties(properties)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)