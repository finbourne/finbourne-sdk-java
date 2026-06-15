# com.finbourne.sdk.services.lusid.model.TaxRuleSet
classname TaxRuleSet

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | A user-friendly name | [default to String]
**description** | **String** | A description of what this rule set is for | [default to String]
**outputPropertyKey** | **String** | The property key that this rule set will write to | [default to String]
**rules** | [**List&lt;TaxRule&gt;**](TaxRule.md) | The rules of this rule set, which stipulate what rate to apply (i.e. write to the OutputPropertyKey) under certain conditions | [default to List<TaxRule>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.TaxRuleSet;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
String displayName = "example displayName";
String description = "example description";
String outputPropertyKey = "example outputPropertyKey";
List<TaxRule> rules = new List<TaxRule>();
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


TaxRuleSet taxRuleSetInstance = new TaxRuleSet()
    .id(id)
    .displayName(displayName)
    .description(description)
    .outputPropertyKey(outputPropertyKey)
    .rules(rules)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)