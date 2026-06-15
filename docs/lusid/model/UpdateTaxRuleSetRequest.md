# com.finbourne.sdk.services.lusid.model.UpdateTaxRuleSetRequest
classname UpdateTaxRuleSetRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** |  | [default to String]
**description** | **String** |  | [default to String]
**rules** | [**List&lt;TaxRule&gt;**](TaxRule.md) |  | [default to List<TaxRule>]

```java
import com.finbourne.sdk.services.lusid.model.UpdateTaxRuleSetRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
String description = "example description";
List<TaxRule> rules = new List<TaxRule>();


UpdateTaxRuleSetRequest updateTaxRuleSetRequestInstance = new UpdateTaxRuleSetRequest()
    .displayName(displayName)
    .description(description)
    .rules(rules);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)