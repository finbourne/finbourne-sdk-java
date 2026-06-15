# com.finbourne.sdk.services.lusid.model.PortfolioCashFlow
classname PortfolioCashFlow
The details for the cashflow for a given portfolio.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupById** | **Integer** | The groupBy subHoldings and currency. | [default to Integer]
**sequenceNumber** | **Integer** | Sequence number determining the order of the cash flow records. | [default to Integer]
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | Indicates the date when the cash-flow settles. | [optional] [default to OffsetDateTime]
**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The sub-holding properties which identify the holding. Each property will be from the &#39;Transaction&#39; domain. These are configured on a transaction portfolio. | [optional] [default to Map<String, PerpetualProperty>]
**type** | **String** | Indicates the record type (Closed, Open, Activity). | [default to String]
**movementName** | **String** | Indicates the specific movement of the transaction that generated this cash flow. | [default to String]
**cashflow** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**balance** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**fxRate** | **java.math.BigDecimal** | Exchange rate between the currency of this cash flow and the reporting currency. | [default to java.math.BigDecimal]
**cashflowReportingCurrency** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**balanceReportingCurrency** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**translationGainLoss** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**costBasisReportingCurrency** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**transaction** | [**Transaction**](Transaction.md) |  | [optional] [default to Transaction]
**unrealisedGainLossReportingCurrency** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.PortfolioCashFlow;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer groupById = new Integer("100.00");
Integer sequenceNumber = new Integer("100.00");
OffsetDateTime effectiveDate = OffsetDateTime.now();
@javax.annotation.Nullable Map<String, PerpetualProperty> subHoldingKeys = new Map<String, PerpetualProperty>();
String type = "example type";
String movementName = "example movementName";
CurrencyAndAmount cashflow = new CurrencyAndAmount();
CurrencyAndAmount balance = new CurrencyAndAmount();
java.math.BigDecimal fxRate = new java.math.BigDecimal("100.00");
CurrencyAndAmount cashflowReportingCurrency = new CurrencyAndAmount();
CurrencyAndAmount balanceReportingCurrency = new CurrencyAndAmount();
CurrencyAndAmount translationGainLoss = new CurrencyAndAmount();
CurrencyAndAmount costBasisReportingCurrency = new CurrencyAndAmount();
Transaction transaction = new Transaction();
CurrencyAndAmount unrealisedGainLossReportingCurrency = new CurrencyAndAmount();
@javax.annotation.Nullable List<Link> links = new List<Link>();


PortfolioCashFlow portfolioCashFlowInstance = new PortfolioCashFlow()
    .groupById(groupById)
    .sequenceNumber(sequenceNumber)
    .effectiveDate(effectiveDate)
    .subHoldingKeys(subHoldingKeys)
    .type(type)
    .movementName(movementName)
    .cashflow(cashflow)
    .balance(balance)
    .fxRate(fxRate)
    .cashflowReportingCurrency(cashflowReportingCurrency)
    .balanceReportingCurrency(balanceReportingCurrency)
    .translationGainLoss(translationGainLoss)
    .costBasisReportingCurrency(costBasisReportingCurrency)
    .transaction(transaction)
    .unrealisedGainLossReportingCurrency(unrealisedGainLossReportingCurrency)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)