# com.finbourne.sdk.services.lusid.model.CleardownModuleRule
classname CleardownModuleRule
A Cleardown rule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleId** | **String** | The identifier for the Cleardown Rule. | [default to String]
**generalLedgerAccountCode** | **String** | The account to post the residual P&amp;L to. | [default to String]
**ruleFilter** | **String** | The filter syntax for the Cleardown Rule. See https://support.lusid.com/knowledgebase/article/KA-02140 for more information on filter syntax. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CleardownModuleRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ruleId = "example ruleId";
String generalLedgerAccountCode = "example generalLedgerAccountCode";
String ruleFilter = "example ruleFilter";


CleardownModuleRule cleardownModuleRuleInstance = new CleardownModuleRule()
    .ruleId(ruleId)
    .generalLedgerAccountCode(generalLedgerAccountCode)
    .ruleFilter(ruleFilter);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)