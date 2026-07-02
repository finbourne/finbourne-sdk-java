# com.finbourne.sdk.services.lusid.model.FundCashStatementLocalCurrency
classname FundCashStatementLocalCurrency
A single row in the local-currency Fund Cash Statement report. Each row is a settled cash  movement with a running balance in local currency only; base-currency columns are out of  scope for this variant and are not returned.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupById** | **Integer** | The groupBy subHoldings and currency. | [optional] [default to Integer]
**sequenceNumber** | **Integer** | Sequence number determining the order of the cash flow records. | [optional] [default to Integer]
**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The sub-holding properties which identify the holding. Each property will be from the &#39;Transaction&#39; domain. These are configured on a transaction portfolio. | [optional] [default to Map<String, PerpetualProperty>]
**sourceId** | **String** | The transaction ID that sourced this cash movement. | [optional] [default to String]
**cashStatementActionType** | **String** | The action type: Default, Reversal, TrueUp, SystemCorrection, Opening, or Closing. | [optional] [default to String]
**entryType** | **String** | What drove the row: SystemGenerated (accounting-engine housekeeping such as a reversal/true-up around a backdated transaction) or UserEntered (a real cash movement booked by a user, e.g. a late trade or amendment). | [optional] [default to String]
**accountingDate** | [**OffsetDateTime**](OffsetDateTime.md) | The accounting date of the cash movement. | [optional] [default to OffsetDateTime]
**activityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The activity date (trade/settlement date) of the cash movement. | [optional] [default to OffsetDateTime]
**movementName** | **String** | The movement type (e.g. Receivable_Cash_Trade, Payable_Cash_Trade). | [optional] [default to String]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**instructionType** | **String** | The settlement instruction type: Automatic, Instructed_Complete, Instructed - Cancel Automatic. | [optional] [default to String]
**diaryEntryCode** | **String** | The diary entry code of the valuation point this row belongs to. | [optional] [default to String]
**originDiaryEntryCode** | **String** | For Reversal/TrueUp rows: the diary entry code of the period the original row belonged to. | [optional] [default to String]
**cashflowLocal** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**balanceLocal** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The requested properties decorated onto the cash statement row. | [optional] [default to Map<String, Property>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.FundCashStatementLocalCurrency;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer groupById = new Integer("100.00");
Integer sequenceNumber = new Integer("100.00");
@javax.annotation.Nullable Map<String, PerpetualProperty> subHoldingKeys = new Map<String, PerpetualProperty>();
@javax.annotation.Nullable String sourceId = "example sourceId";
@javax.annotation.Nullable String cashStatementActionType = "example cashStatementActionType";
@javax.annotation.Nullable String entryType = "example entryType";
OffsetDateTime accountingDate = OffsetDateTime.now();
OffsetDateTime activityDate = OffsetDateTime.now();
@javax.annotation.Nullable String movementName = "example movementName";
ResourceId portfolioId = new ResourceId();
@javax.annotation.Nullable String instructionType = "example instructionType";
@javax.annotation.Nullable String diaryEntryCode = "example diaryEntryCode";
@javax.annotation.Nullable String originDiaryEntryCode = "example originDiaryEntryCode";
CurrencyAndAmount cashflowLocal = new CurrencyAndAmount();
CurrencyAndAmount balanceLocal = new CurrencyAndAmount();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


FundCashStatementLocalCurrency fundCashStatementLocalCurrencyInstance = new FundCashStatementLocalCurrency()
    .groupById(groupById)
    .sequenceNumber(sequenceNumber)
    .subHoldingKeys(subHoldingKeys)
    .sourceId(sourceId)
    .cashStatementActionType(cashStatementActionType)
    .entryType(entryType)
    .accountingDate(accountingDate)
    .activityDate(activityDate)
    .movementName(movementName)
    .portfolioId(portfolioId)
    .instructionType(instructionType)
    .diaryEntryCode(diaryEntryCode)
    .originDiaryEntryCode(originDiaryEntryCode)
    .cashflowLocal(cashflowLocal)
    .balanceLocal(balanceLocal)
    .properties(properties)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)