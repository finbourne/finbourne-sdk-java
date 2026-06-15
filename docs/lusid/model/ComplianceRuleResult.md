# com.finbourne.sdk.services.lusid.model.ComplianceRuleResult
classname ComplianceRuleResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleId** | **String** | The unique identifierof a compliance rule | [default to String]
**ruleName** | **String** | The User-given name of the rule | [default to String]
**ruleDescription** | **String** | The User-given description of the rule | [default to String]
**portfolio** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**passed** | **Boolean** | The result of an individual compliance run, true if passed | [default to Boolean]
**resultValue** | **java.math.BigDecimal** | The calculation result that was used to confirm a pass/fail | [default to java.math.BigDecimal]
**ruleInformationMatch** | **String** | The value matched by the rule | [default to String]
**ruleInformationKey** | **String** | The property key matched by the rule | [default to String]
**ruleLowerLimit** | **java.math.BigDecimal** | The lower limit of the rule | [default to java.math.BigDecimal]
**ruleUpperLimit** | **java.math.BigDecimal** | The upper limit of the rule | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceRuleResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ruleId = "example ruleId";
String ruleName = "example ruleName";
String ruleDescription = "example ruleDescription";
ResourceId portfolio = new ResourceId();
Boolean passed = true;
java.math.BigDecimal resultValue = new java.math.BigDecimal("100.00");
String ruleInformationMatch = "example ruleInformationMatch";
String ruleInformationKey = "example ruleInformationKey";
java.math.BigDecimal ruleLowerLimit = new java.math.BigDecimal("100.00");
java.math.BigDecimal ruleUpperLimit = new java.math.BigDecimal("100.00");


ComplianceRuleResult complianceRuleResultInstance = new ComplianceRuleResult()
    .ruleId(ruleId)
    .ruleName(ruleName)
    .ruleDescription(ruleDescription)
    .portfolio(portfolio)
    .passed(passed)
    .resultValue(resultValue)
    .ruleInformationMatch(ruleInformationMatch)
    .ruleInformationKey(ruleInformationKey)
    .ruleLowerLimit(ruleLowerLimit)
    .ruleUpperLimit(ruleUpperLimit);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)