# com.finbourne.sdk.services.lusid.model.PartnershipConfigPack
classname PartnershipConfigPack
The partnership configuration pack a fund resolves to: the transaction types, chart of accounts and posting rules  the partners' ledger is booked under.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope of the configuration pack. | [default to String]
**code** | **String** | The code of the configuration pack. | [default to String]
**version** | **String** | The version of the configuration pack. | [default to String]
**transactionTypes** | [**List&lt;PackTransactionType&gt;**](PackTransactionType.md) | The partnership transaction types the pack provides. | [default to List<PackTransactionType>]
**chartOfAccounts** | [**List&lt;PackAccount&gt;**](PackAccount.md) | The accounts the pack posts partner capital to. | [default to List<PackAccount>]
**postingRules** | [**List&lt;PackPostingRule&gt;**](PackPostingRule.md) | The rules that move each transaction type between its accounts. | [default to List<PackPostingRule>]
**generalLedgerProfileCode** | **String** | The code of the general ledger profile the pack&#39;s posting rules belong to. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PartnershipConfigPack;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scope = "example scope";
String code = "example code";
String version = "example version";
List<PackTransactionType> transactionTypes = new List<PackTransactionType>();
List<PackAccount> chartOfAccounts = new List<PackAccount>();
List<PackPostingRule> postingRules = new List<PackPostingRule>();
@javax.annotation.Nullable String generalLedgerProfileCode = "example generalLedgerProfileCode";


PartnershipConfigPack partnershipConfigPackInstance = new PartnershipConfigPack()
    .scope(scope)
    .code(code)
    .version(version)
    .transactionTypes(transactionTypes)
    .chartOfAccounts(chartOfAccounts)
    .postingRules(postingRules)
    .generalLedgerProfileCode(generalLedgerProfileCode);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)