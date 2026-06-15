# com.finbourne.sdk.services.lusid.model.TransactionCurrencyAndAmount
classname TransactionCurrencyAndAmount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** |  | [optional] [default to String]
**amount** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TransactionCurrencyAndAmount;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String currency = "example currency";
@javax.annotation.Nullable String amount = "example amount";


TransactionCurrencyAndAmount transactionCurrencyAndAmountInstance = new TransactionCurrencyAndAmount()
    .currency(currency)
    .amount(amount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)