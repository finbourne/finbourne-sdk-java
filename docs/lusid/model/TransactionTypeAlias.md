# com.finbourne.sdk.services.lusid.model.TransactionTypeAlias
classname TransactionTypeAlias

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The transaction type | [default to String]
**description** | **String** | Brief description of the transaction | [default to String]
**transactionClass** | **String** | Relates types of a similar class. E.g. Buy/Sell, StockIn/StockOut | [default to String]
**transactionRoles** | **String** | Transactions role within a class. E.g. Increase a long position. Available values: None, LongLonger, LongShorter, ShortShorter, Shorter, ShortLonger, Longer, AllRoles. | [default to String]
**isDefault** | **Boolean** | IsDefault is a flag that denotes the default alias for a source. There can only be, at most, one per source. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.TransactionTypeAlias;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
String description = "example description";
String transactionClass = "example transactionClass";
String transactionRoles = "example transactionRoles";
Boolean isDefault = true;


TransactionTypeAlias transactionTypeAliasInstance = new TransactionTypeAlias()
    .type(type)
    .description(description)
    .transactionClass(transactionClass)
    .transactionRoles(transactionRoles)
    .isDefault(isDefault);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)