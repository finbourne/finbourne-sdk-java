# com.finbourne.sdk.services.lusid.model.StagingRuleSet
classname StagingRuleSet

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | **String** | The entity type the staging rule set applies to. | [default to String]
**stagingRuleSetId** | **String** | System generated unique id for the staging rule set. | [default to String]
**displayName** | **String** | The name of the staging rule set. | [default to String]
**description** | **String** | A description for the staging rule set. | [optional] [default to String]
**rules** | [**List&lt;StagingRule&gt;**](StagingRule.md) | The list of staging rules that apply to a specific entity type. | [default to List<StagingRule>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.StagingRuleSet;
import java.util.*;
import java.lang.System;
import java.net.URI;

String entityType = "example entityType";
String stagingRuleSetId = "example stagingRuleSetId";
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
List<StagingRule> rules = new List<StagingRule>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


StagingRuleSet stagingRuleSetInstance = new StagingRuleSet()
    .entityType(entityType)
    .stagingRuleSetId(stagingRuleSetId)
    .displayName(displayName)
    .description(description)
    .rules(rules)
    .href(href)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)