# com.finbourne.sdk.services.lusid.model.PostingModuleRule
classname PostingModuleRule
A Posting rule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleId** | **String** | The identifier for the Posting Rule. | [default to String]
**generalLedgerAccountCode** | **String** | The general ledger account to post the Activity credit or debit to. | [default to String]
**ruleFilter** | **String** | The filter syntax for the Posting Rule. See https://support.lusid.com/knowledgebase/article/KA-02140 for more information on filter syntax. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PostingModuleRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ruleId = "example ruleId";
String generalLedgerAccountCode = "example generalLedgerAccountCode";
String ruleFilter = "example ruleFilter";


PostingModuleRule postingModuleRuleInstance = new PostingModuleRule()
    .ruleId(ruleId)
    .generalLedgerAccountCode(generalLedgerAccountCode)
    .ruleFilter(ruleFilter);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)