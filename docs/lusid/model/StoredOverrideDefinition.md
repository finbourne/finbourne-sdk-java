# com.finbourne.sdk.services.lusid.model.StoredOverrideDefinition
classname StoredOverrideDefinition
A single replacement transaction definition as it was persisted against a virtual transaction.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** | The unique identifier of the replacement transaction. | [optional] [default to String]
**type** | **String** | The type of the replacement transaction, for example &#39;Buy&#39; or &#39;Sell&#39;. | [optional] [default to String]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | A set of instrument identifiers that resolve the replacement transaction to a unique instrument. | [optional] [default to Map<String, String>]
**tradeDate** | **String** | The trade date of the replacement transaction. | [optional] [default to String]
**settlementDate** | **String** | The settlement date of the replacement transaction. | [optional] [default to String]
**units** | **java.math.BigDecimal** | The number of units of the transacted instrument. | [optional] [default to java.math.BigDecimal]
**tradePrice** | [**TransactionPrice**](TransactionPrice.md) |  | [optional] [default to TransactionPrice]
**totalConsideration** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**exchangeRate** | **java.math.BigDecimal** | The exchange rate between the trade and settlement currency. | [optional] [default to java.math.BigDecimal]
**tradeCurrency** | **String** | The trade currency of the replacement transaction. | [optional] [default to String]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The transaction properties stored for the replacement transaction. | [optional] [default to Map<String, PerpetualProperty>]
**counterpartyId** | **String** | The identifier for the counterparty of the replacement transaction. | [optional] [default to String]
**source** | **String** | The source of the replacement transaction. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.StoredOverrideDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String transactionId = "example transactionId";
@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable Map<String, String> instrumentIdentifiers = new Map<String, String>();
@javax.annotation.Nullable String tradeDate = "example tradeDate";
@javax.annotation.Nullable String settlementDate = "example settlementDate";
java.math.BigDecimal units = new java.math.BigDecimal("100.00");
TransactionPrice tradePrice = new TransactionPrice();
CurrencyAndAmount totalConsideration = new CurrencyAndAmount();
@javax.annotation.Nullable java.math.BigDecimal exchangeRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String tradeCurrency = "example tradeCurrency";
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();
@javax.annotation.Nullable String counterpartyId = "example counterpartyId";
@javax.annotation.Nullable String source = "example source";


StoredOverrideDefinition storedOverrideDefinitionInstance = new StoredOverrideDefinition()
    .transactionId(transactionId)
    .type(type)
    .instrumentIdentifiers(instrumentIdentifiers)
    .tradeDate(tradeDate)
    .settlementDate(settlementDate)
    .units(units)
    .tradePrice(tradePrice)
    .totalConsideration(totalConsideration)
    .exchangeRate(exchangeRate)
    .tradeCurrency(tradeCurrency)
    .properties(properties)
    .counterpartyId(counterpartyId)
    .source(source);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)