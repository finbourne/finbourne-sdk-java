# com.finbourne.sdk.services.lusid.model.PackTransactionType
classname PackTransactionType
A transaction type carried by a partnership configuration pack.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The transaction type. | [default to String]
**description** | **String** | A description of the transaction type. | [optional] [default to String]
**debitAccount** | **String** | The account debited. | [default to String]
**creditAccount** | **String** | The account credited. | [default to String]
**direction** | **String** | The direction of the capital movement from the partner&#39;s point of view. Available values: Inflow, Outflow, Neutral. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PackTransactionType;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
@javax.annotation.Nullable String description = "example description";
String debitAccount = "example debitAccount";
String creditAccount = "example creditAccount";
String direction = "example direction";


PackTransactionType packTransactionTypeInstance = new PackTransactionType()
    .type(type)
    .description(description)
    .debitAccount(debitAccount)
    .creditAccount(creditAccount)
    .direction(direction);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)