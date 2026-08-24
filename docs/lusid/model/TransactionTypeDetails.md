# com.finbourne.sdk.services.lusid.model.TransactionTypeDetails
classname TransactionTypeDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope in which the TransactionType was resolved. If the portfolio has a TransactionTypeScope, this will have been used. Otherwise the default scope will have been used. | [default to String]
**source** | **String** | The source in which the TransactionType was resolved. | [default to String]
**type** | **String** | The resolved TransactionType. More information on TransactionType resolution can be found at https://support.lusid.com/docs/how-does-lusid-resolve-transactions-to-transaction-types | [default to String]
**movementConditionMatches** | [**List&lt;MovementConditionMatch&gt;**](MovementConditionMatch.md) | One entry for each movement on the resolved TransactionType, in the order the movements are configured, recording whether that movement&#39;s condition was satisfied by this transaction. Empty for transaction versions that generate no movements, such as cancelled and amended versions. | [optional] [default to List<MovementConditionMatch>]

```java
import com.finbourne.sdk.services.lusid.model.TransactionTypeDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scope = "example scope";
String source = "example source";
String type = "example type";
@javax.annotation.Nullable List<MovementConditionMatch> movementConditionMatches = new List<MovementConditionMatch>();


TransactionTypeDetails transactionTypeDetailsInstance = new TransactionTypeDetails()
    .scope(scope)
    .source(source)
    .type(type)
    .movementConditionMatches(movementConditionMatches);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)