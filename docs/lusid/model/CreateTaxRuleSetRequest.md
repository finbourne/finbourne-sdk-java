# com.finbourne.sdk.services.lusid.model.CreateTaxRuleSetRequest
classname CreateTaxRuleSetRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** |  | [default to String]
**description** | **String** |  | [default to String]
**outputPropertyKey** | **String** |  | [default to String]
**rules** | [**List&lt;TaxRule&gt;**](TaxRule.md) |  | [default to List<TaxRule>]

```java
import com.finbourne.sdk.services.lusid.model.CreateTaxRuleSetRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
String displayName = "example displayName";
String description = "example description";
String outputPropertyKey = "example outputPropertyKey";
List<TaxRule> rules = new List<TaxRule>();


CreateTaxRuleSetRequest createTaxRuleSetRequestInstance = new CreateTaxRuleSetRequest()
    .id(id)
    .displayName(displayName)
    .description(description)
    .outputPropertyKey(outputPropertyKey)
    .rules(rules);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)