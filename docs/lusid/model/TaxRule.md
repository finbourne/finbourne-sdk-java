# com.finbourne.sdk.services.lusid.model.TaxRule
classname TaxRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | A user-friendly name | [default to String]
**description** | **String** | A description for this rule | [default to String]
**rate** | **java.math.BigDecimal** | The rate to be applied if all criteria are met | [default to java.math.BigDecimal]
**matchCriteria** | [**List&lt;MatchCriterion&gt;**](MatchCriterion.md) | A set of criteria to be met for this rule to be applied | [default to List<MatchCriterion>]

```java
import com.finbourne.sdk.services.lusid.model.TaxRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
String description = "example description";
java.math.BigDecimal rate = new java.math.BigDecimal("100.00");
List<MatchCriterion> matchCriteria = new List<MatchCriterion>();


TaxRule taxRuleInstance = new TaxRule()
    .name(name)
    .description(description)
    .rate(rate)
    .matchCriteria(matchCriteria);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)