# com.finbourne.sdk.services.lusid.model.TransactionRequest
classname TransactionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** | The unique identifier of the transaction. | [default to String]
**type** | **String** | The type of the transaction, for example &#39;Buy&#39; or &#39;Sell&#39;. The transaction type must have been pre-configured using the System Configuration API. If not, this operation will succeed but you are not able to calculate holdings for the portfolio that include this transaction. | [default to String]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | A set of instrument identifiers that can resolve the transaction to a unique instrument. | [default to Map<String, String>]
**transactionDate** | **String** | The date of the transaction. | [default to String]
**settlementDate** | **String** | The settlement date of the transaction. | [default to String]
**units** | **java.math.BigDecimal** | The number of units of the transacted instrument. | [default to java.math.BigDecimal]
**transactionPrice** | [**TransactionPrice**](TransactionPrice.md) |  | [optional] [default to TransactionPrice]
**totalConsideration** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**exchangeRate** | **java.math.BigDecimal** | The exchange rate between the transaction and settlement currency (settlement currency being represented by TotalConsideration.Currency). For example, if the transaction currency is USD and the settlement currency is GBP, this would be the appropriate USD/GBP rate. | [optional] [default to java.math.BigDecimal]
**transactionCurrency** | **String** | The transaction currency. | [optional] [default to String]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | A list of unique transaction properties and associated values to store for the transaction. Each property must be from the &#39;Transaction&#39; domain. | [optional] [default to Map<String, PerpetualProperty>]
**counterpartyId** | **String** | The identifier for the counterparty of the transaction. | [optional] [default to String]
**source** | **String** | The source of the transaction. This is used to look up the appropriate transaction group set in the transaction type configuration. | [optional] [default to String]
**otcConfirmation** | [**OtcConfirmation**](OtcConfirmation.md) |  | [optional] [default to OtcConfirmation]
**orderId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**allocationId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**custodianAccountId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**transactionGroupId** | **String** | The identifier for grouping economic events across multiple transactions | [optional] [default to String]
**strategyTag** | [**List&lt;Strategy&gt;**](Strategy.md) | A list of strategies representing the allocation of units across multiple sub-holding keys | [optional] [default to List<Strategy>]
**custodianEntries** | [**List&lt;CustodianEntry&gt;**](CustodianEntry.md) | A list of Custodian Entries associated with the transaction. | [optional] [default to List<CustodianEntry>]

```java
import com.finbourne.sdk.services.lusid.model.TransactionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String transactionId = "example transactionId";
String type = "example type";
Map<String, String> instrumentIdentifiers = new Map<String, String>();
String transactionDate = "example transactionDate";
String settlementDate = "example settlementDate";
java.math.BigDecimal units = new java.math.BigDecimal("100.00");
TransactionPrice transactionPrice = new TransactionPrice();
CurrencyAndAmount totalConsideration = new CurrencyAndAmount();
@javax.annotation.Nullable java.math.BigDecimal exchangeRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String transactionCurrency = "example transactionCurrency";
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();
@javax.annotation.Nullable String counterpartyId = "example counterpartyId";
@javax.annotation.Nullable String source = "example source";
OtcConfirmation otcConfirmation = new OtcConfirmation();
ResourceId orderId = new ResourceId();
ResourceId allocationId = new ResourceId();
ResourceId custodianAccountId = new ResourceId();
@javax.annotation.Nullable String transactionGroupId = "example transactionGroupId";
@javax.annotation.Nullable List<Strategy> strategyTag = new List<Strategy>();
@javax.annotation.Nullable List<CustodianEntry> custodianEntries = new List<CustodianEntry>();


TransactionRequest transactionRequestInstance = new TransactionRequest()
    .transactionId(transactionId)
    .type(type)
    .instrumentIdentifiers(instrumentIdentifiers)
    .transactionDate(transactionDate)
    .settlementDate(settlementDate)
    .units(units)
    .transactionPrice(transactionPrice)
    .totalConsideration(totalConsideration)
    .exchangeRate(exchangeRate)
    .transactionCurrency(transactionCurrency)
    .properties(properties)
    .counterpartyId(counterpartyId)
    .source(source)
    .otcConfirmation(otcConfirmation)
    .orderId(orderId)
    .allocationId(allocationId)
    .custodianAccountId(custodianAccountId)
    .transactionGroupId(transactionGroupId)
    .strategyTag(strategyTag)
    .custodianEntries(custodianEntries);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)