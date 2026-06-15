# com.finbourne.sdk.services.lusid.model.TransactionFieldMap
classname TransactionFieldMap

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** |  | [default to String]
**type** | **String** |  | [default to String]
**source** | **String** |  | [default to String]
**instrument** | **String** |  | [default to String]
**transactionDate** | **String** |  | [default to String]
**settlementDate** | **String** |  | [default to String]
**units** | **String** |  | [default to String]
**transactionPrice** | [**TransactionPriceAndType**](TransactionPriceAndType.md) |  | [optional] [default to TransactionPriceAndType]
**transactionCurrency** | **String** |  | [default to String]
**exchangeRate** | **String** |  | [optional] [default to String]
**totalConsideration** | [**TransactionCurrencyAndAmount**](TransactionCurrencyAndAmount.md) |  | [default to TransactionCurrencyAndAmount]

```java
import com.finbourne.sdk.services.lusid.model.TransactionFieldMap;
import java.util.*;
import java.lang.System;
import java.net.URI;

String transactionId = "example transactionId";
String type = "example type";
String source = "example source";
String instrument = "example instrument";
String transactionDate = "example transactionDate";
String settlementDate = "example settlementDate";
String units = "example units";
TransactionPriceAndType transactionPrice = new TransactionPriceAndType();
String transactionCurrency = "example transactionCurrency";
@javax.annotation.Nullable String exchangeRate = "example exchangeRate";
TransactionCurrencyAndAmount totalConsideration = new TransactionCurrencyAndAmount();


TransactionFieldMap transactionFieldMapInstance = new TransactionFieldMap()
    .transactionId(transactionId)
    .type(type)
    .source(source)
    .instrument(instrument)
    .transactionDate(transactionDate)
    .settlementDate(settlementDate)
    .units(units)
    .transactionPrice(transactionPrice)
    .transactionCurrency(transactionCurrency)
    .exchangeRate(exchangeRate)
    .totalConsideration(totalConsideration);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)