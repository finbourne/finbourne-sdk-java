# com.finbourne.sdk.services.lusid.model.CleardownModuleResponse
classname CleardownModuleResponse
A Cleardown Module definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**cleardownModuleCode** | **String** | The code of the Cleardown Module. | [default to String]
**chartOfAccountsId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the Cleardown Module. | [default to String]
**description** | **String** | A description for the Cleardown Module. | [optional] [default to String]
**rules** | [**List&lt;CleardownModuleRule&gt;**](CleardownModuleRule.md) | The Cleardown Rules that apply for the Cleardown Module. Rules are evaluated in the order they occur in this collection. | [optional] [default to List<CleardownModuleRule>]
**status** | **String** | The Cleardown Module status. Default value: Active. Available values: Active, Inactive, Deleted. | [default to String]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.CleardownModuleResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
String cleardownModuleCode = "example cleardownModuleCode";
ResourceId chartOfAccountsId = new ResourceId();
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable List<CleardownModuleRule> rules = new List<CleardownModuleRule>();
String status = "example status";
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


CleardownModuleResponse cleardownModuleResponseInstance = new CleardownModuleResponse()
    .href(href)
    .cleardownModuleCode(cleardownModuleCode)
    .chartOfAccountsId(chartOfAccountsId)
    .displayName(displayName)
    .description(description)
    .rules(rules)
    .status(status)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)