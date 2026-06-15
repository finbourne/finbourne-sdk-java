# com.finbourne.sdk.services.lusid.model.CleardownModuleRulesUpdatedResponse
classname CleardownModuleRulesUpdatedResponse
A Cleardown Module rules update response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rules** | [**List&lt;CleardownModuleRule&gt;**](CleardownModuleRule.md) | The Cleardown Rules that apply for the Cleardown Module. Rules are evaluated in the order they occur in this collection. | [optional] [default to List<CleardownModuleRule>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.CleardownModuleRulesUpdatedResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<CleardownModuleRule> rules = new List<CleardownModuleRule>();
Version version = new Version();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable List<Link> links = new List<Link>();


CleardownModuleRulesUpdatedResponse cleardownModuleRulesUpdatedResponseInstance = new CleardownModuleRulesUpdatedResponse()
    .rules(rules)
    .version(version)
    .href(href)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)