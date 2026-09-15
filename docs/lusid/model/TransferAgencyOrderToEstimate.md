# com.finbourne.sdk.services.lusid.model.TransferAgencyOrderToEstimate
classname TransferAgencyOrderToEstimate
The values of an order to estimate, for an order that has not been saved yet or whose values are being  changed. Carries only what the estimate reads - it is not a whole order and cannot be used to create one.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**instrumentIdentifierType** | **String** |  | [default to String]
**instrumentIdentifier** | **String** |  | [default to String]
**instrumentScope** | **String** |  | [optional] [default to String]
**transactionCategory** | **String** | Available values: Subscription, Redemption, SwitchOut, SwitchIn, TransferOut, TransferIn. | [optional] [default to String]
**currency** | **String** |  | [default to String]
**quantity** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**amount** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**weight** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**exchangeRate** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.TransferAgencyOrderToEstimate;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId portfolioId = new ResourceId();
String instrumentIdentifierType = "example instrumentIdentifierType";
String instrumentIdentifier = "example instrumentIdentifier";
@javax.annotation.Nullable String instrumentScope = "example instrumentScope";
@javax.annotation.Nullable String transactionCategory = "example transactionCategory";
String currency = "example currency";
@javax.annotation.Nullable java.math.BigDecimal quantity = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal weight = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal exchangeRate = new java.math.BigDecimal("100.00");


TransferAgencyOrderToEstimate transferAgencyOrderToEstimateInstance = new TransferAgencyOrderToEstimate()
    .portfolioId(portfolioId)
    .instrumentIdentifierType(instrumentIdentifierType)
    .instrumentIdentifier(instrumentIdentifier)
    .instrumentScope(instrumentScope)
    .transactionCategory(transactionCategory)
    .currency(currency)
    .quantity(quantity)
    .amount(amount)
    .weight(weight)
    .exchangeRate(exchangeRate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)