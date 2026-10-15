# com.finbourne.sdk.services.lusid.model.PackPostingRule
classname PackPostingRule
A posting rule on a partnership configuration pack.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleId** | **String** | The posting rule identifier. | [default to String]
**transactionType** | **String** | The transaction type. | [default to String]
**debitAccount** | **String** | The account debited. | [default to String]
**creditAccount** | **String** | The account credited. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PackPostingRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ruleId = "example ruleId";
String transactionType = "example transactionType";
String debitAccount = "example debitAccount";
String creditAccount = "example creditAccount";


PackPostingRule packPostingRuleInstance = new PackPostingRule()
    .ruleId(ruleId)
    .transactionType(transactionType)
    .debitAccount(debitAccount)
    .creditAccount(creditAccount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)