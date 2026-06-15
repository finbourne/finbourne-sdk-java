# com.finbourne.sdk.services.lusid.model.TransactionConfigurationTypeAlias
classname TransactionConfigurationTypeAlias

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The transaction type | [default to String]
**description** | **String** | Brief description of the transaction | [default to String]
**transactionClass** | **String** | Relates types of a similar class. E.g. Buy/Sell, StockIn/StockOut | [default to String]
**transactionGroup** | **String** | Group is a set of codes related to a source, or sync. DEPRECATED: This field will be removed, use &#x60;Source&#x60; instead | [optional] [default to String]
**source** | **String** | Used to group a set of transaction types | [optional] [default to String]
**transactionRoles** | **String** | Transactions role within a class. E.g. Increase a long position. Available values: None, LongLonger, LongShorter, ShortShorter, Shorter, ShortLonger, Longer, AllRoles. | [default to String]
**isDefault** | **Boolean** | IsDefault is a flag that denotes the default alias for a source. There can only be, at most, one per source. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.TransactionConfigurationTypeAlias;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
String description = "example description";
String transactionClass = "example transactionClass";
@javax.annotation.Nullable String transactionGroup = "example transactionGroup";
@javax.annotation.Nullable String source = "example source";
String transactionRoles = "example transactionRoles";
Boolean isDefault = true;


TransactionConfigurationTypeAlias transactionConfigurationTypeAliasInstance = new TransactionConfigurationTypeAlias()
    .type(type)
    .description(description)
    .transactionClass(transactionClass)
    .transactionGroup(transactionGroup)
    .source(source)
    .transactionRoles(transactionRoles)
    .isDefault(isDefault);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)