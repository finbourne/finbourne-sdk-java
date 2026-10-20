# com.finbourne.sdk.services.lusid.model.PostingModuleRule
classname PostingModuleRule
A Posting rule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleId** | **String** | The identifier for the Posting Rule. | [default to String]
**generalLedgerAccountCode** | **String** | The general ledger account to post the Activity credit or debit to. | [default to String]
**ruleFilter** | **String** | The filter syntax for the Posting Rule. See https://support.lusid.com/docs/assigning-economic-activity-to-general-ledger-accounts-using-posting-rules for more information on filter syntax. | [default to String]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The inclusive accounting date from which the Posting Rule applies. If not set, the rule applies from the beginning of time. | [optional] [default to OffsetDateTime]
**effectiveUntil** | [**OffsetDateTime**](OffsetDateTime.md) | The exclusive accounting date until which the Posting Rule applies. If not set, the rule applies until the end of time. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.PostingModuleRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ruleId = "example ruleId";
String generalLedgerAccountCode = "example generalLedgerAccountCode";
String ruleFilter = "example ruleFilter";
@javax.annotation.Nullable OffsetDateTime effectiveFrom = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime effectiveUntil = OffsetDateTime.now();


PostingModuleRule postingModuleRuleInstance = new PostingModuleRule()
    .ruleId(ruleId)
    .generalLedgerAccountCode(generalLedgerAccountCode)
    .ruleFilter(ruleFilter)
    .effectiveFrom(effectiveFrom)
    .effectiveUntil(effectiveUntil);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)