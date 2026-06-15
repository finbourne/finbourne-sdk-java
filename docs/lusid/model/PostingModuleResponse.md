# com.finbourne.sdk.services.lusid.model.PostingModuleResponse
classname PostingModuleResponse
A Posting Module definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**postingModuleCode** | **String** | The code of the Posting Module. | [default to String]
**chartOfAccountsId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the Posting Module. | [default to String]
**description** | **String** | A description for the Posting Module. | [optional] [default to String]
**rules** | [**List&lt;PostingModuleRule&gt;**](PostingModuleRule.md) | The Posting Rules that apply for the Posting Module. Rules are evaluated in the order they occur in this collection. | [optional] [default to List<PostingModuleRule>]
**status** | **String** | The Posting Module status. Default value: Active. Available values: Active, Inactive, Deleted. | [default to String]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.PostingModuleResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
String postingModuleCode = "example postingModuleCode";
ResourceId chartOfAccountsId = new ResourceId();
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable List<PostingModuleRule> rules = new List<PostingModuleRule>();
String status = "example status";
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


PostingModuleResponse postingModuleResponseInstance = new PostingModuleResponse()
    .href(href)
    .postingModuleCode(postingModuleCode)
    .chartOfAccountsId(chartOfAccountsId)
    .displayName(displayName)
    .description(description)
    .rules(rules)
    .status(status)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)