# com.finbourne.sdk.services.lusid.model.WithholdingTaxMatchedRule
classname WithholdingTaxMatchedRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**matchedRuleId** | **String** | The identifier booking stamps for the matched row: its series identifiers and effective date. | [default to String]
**matchedDataset** | **String** | The dataset the matched row came from: Main or Anomaly. | [default to String]
**ruleSource** | **String** | The rule source of the matched row. Null when the row has none. | [optional] [default to String]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date of the matched row version. | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.WithholdingTaxMatchedRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String matchedRuleId = "example matchedRuleId";
String matchedDataset = "example matchedDataset";
@javax.annotation.Nullable String ruleSource = "example ruleSource";
OffsetDateTime effectiveAt = OffsetDateTime.now();


WithholdingTaxMatchedRule withholdingTaxMatchedRuleInstance = new WithholdingTaxMatchedRule()
    .matchedRuleId(matchedRuleId)
    .matchedDataset(matchedDataset)
    .ruleSource(ruleSource)
    .effectiveAt(effectiveAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)