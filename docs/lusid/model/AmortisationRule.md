# com.finbourne.sdk.services.lusid.model.AmortisationRule
classname AmortisationRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the rule. | [default to String]
**description** | **String** | A description of the rule. | [optional] [default to String]
**filter** | **String** | The filter for this rule. | [default to String]
**amortisationMethod** | **String** | The filter for this rule. Available values: NoAmortisation, StraightLine, EffectiveYield, StraightLineSettlementDate, EffectiveYieldSettlementDate. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AmortisationRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
@javax.annotation.Nullable String description = "example description";
String filter = "example filter";
String amortisationMethod = "example amortisationMethod";


AmortisationRule amortisationRuleInstance = new AmortisationRule()
    .name(name)
    .description(description)
    .filter(filter)
    .amortisationMethod(amortisationMethod);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)