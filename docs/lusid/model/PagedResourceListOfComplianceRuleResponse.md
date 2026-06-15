# com.finbourne.sdk.services.lusid.model.PagedResourceListOfComplianceRuleResponse
classname PagedResourceListOfComplianceRuleResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nextPage** | **String** |  | [optional] [default to String]
**previousPage** | **String** |  | [optional] [default to String]
**values** | [**List&lt;ComplianceRuleResponse&gt;**](ComplianceRuleResponse.md) |  | [default to List<ComplianceRuleResponse>]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.PagedResourceListOfComplianceRuleResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String nextPage = "example nextPage";
@javax.annotation.Nullable String previousPage = "example previousPage";
List<ComplianceRuleResponse> values = new List<ComplianceRuleResponse>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable List<Link> links = new List<Link>();


PagedResourceListOfComplianceRuleResponse pagedResourceListOfComplianceRuleResponseInstance = new PagedResourceListOfComplianceRuleResponse()
    .nextPage(nextPage)
    .previousPage(previousPage)
    .values(values)
    .href(href)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)