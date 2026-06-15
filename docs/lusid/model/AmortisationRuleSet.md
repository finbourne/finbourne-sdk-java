# com.finbourne.sdk.services.lusid.model.AmortisationRuleSet
classname AmortisationRuleSet

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | A user-friendly name. | [default to String]
**description** | **String** | A description of what this rule set is for. | [optional] [default to String]
**rulesInterval** | [**RulesInterval**](RulesInterval.md) |  | [default to RulesInterval]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.AmortisationRuleSet;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
ResourceId id = new ResourceId();
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
RulesInterval rulesInterval = new RulesInterval();
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


AmortisationRuleSet amortisationRuleSetInstance = new AmortisationRuleSet()
    .href(href)
    .id(id)
    .displayName(displayName)
    .description(description)
    .rulesInterval(rulesInterval)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)