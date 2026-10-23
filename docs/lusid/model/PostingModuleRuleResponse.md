# com.finbourne.sdk.services.lusid.model.PostingModuleRuleResponse
classname PostingModuleRuleResponse
A version of a Posting rule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleId** | **String** | The identifier for the Posting Rule. | [default to String]
**generalLedgerAccountCode** | **String** | The general ledger account to post the Activity credit or debit to. | [default to String]
**ruleFilter** | **String** | The filter syntax for the Posting Rule. See https://support.lusid.com/docs/assigning-economic-activity-to-general-ledger-accounts-using-posting-rules for more information on filter syntax. | [default to String]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The inclusive accounting date from which the Posting Rule applies. If not set, the rule applies from the beginning of time. | [optional] [default to OffsetDateTime]
**effectiveUntil** | [**OffsetDateTime**](OffsetDateTime.md) | The exclusive accounting date until which the Posting Rule applies. If not set, the rule applies until the end of time. | [optional] [default to OffsetDateTime]
**version** | **Integer** | The version of the Posting Rule. Starts at 1 and increases each time the rule is superseded. | [optional] [default to Integer]
**originalRuleId** | **String** | The identifier of the Posting Rule that this rule was created to supersede, if any. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PostingModuleRuleResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ruleId = "example ruleId";
String generalLedgerAccountCode = "example generalLedgerAccountCode";
String ruleFilter = "example ruleFilter";
@javax.annotation.Nullable OffsetDateTime effectiveFrom = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime effectiveUntil = OffsetDateTime.now();
Integer version = new Integer("100.00");
@javax.annotation.Nullable String originalRuleId = "example originalRuleId";


PostingModuleRuleResponse postingModuleRuleResponseInstance = new PostingModuleRuleResponse()
    .ruleId(ruleId)
    .generalLedgerAccountCode(generalLedgerAccountCode)
    .ruleFilter(ruleFilter)
    .effectiveFrom(effectiveFrom)
    .effectiveUntil(effectiveUntil)
    .version(version)
    .originalRuleId(originalRuleId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)