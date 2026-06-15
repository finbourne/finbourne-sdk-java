# com.finbourne.sdk.services.lusid.model.TransactionTypeDetails
classname TransactionTypeDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope in which the TransactionType was resolved. If the portfolio has a TransactionTypeScope, this will have been used. Otherwise the default scope will have been used. | [default to String]
**source** | **String** | The source in which the TransactionType was resolved. | [default to String]
**type** | **String** | The resolved TransactionType. More information on TransactionType resolution can be found at https://support.lusid.com/docs/how-does-lusid-resolve-transactions-to-transaction-types | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TransactionTypeDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scope = "example scope";
String source = "example source";
String type = "example type";


TransactionTypeDetails transactionTypeDetailsInstance = new TransactionTypeDetails()
    .scope(scope)
    .source(source)
    .type(type);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)