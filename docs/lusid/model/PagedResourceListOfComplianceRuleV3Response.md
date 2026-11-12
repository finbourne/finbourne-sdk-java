# com.finbourne.sdk.services.lusid.model.PagedResourceListOfComplianceRuleV3Response
classname PagedResourceListOfComplianceRuleV3Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nextPage** | **String** |  | [optional] [default to String]
**previousPage** | **String** |  | [optional] [default to String]
**values** | [**List&lt;ComplianceRuleV3Response&gt;**](ComplianceRuleV3Response.md) |  | [default to List<ComplianceRuleV3Response>]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.PagedResourceListOfComplianceRuleV3Response;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String nextPage = "example nextPage";
@javax.annotation.Nullable String previousPage = "example previousPage";
List<ComplianceRuleV3Response> values = new List<ComplianceRuleV3Response>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable List<Link> links = new List<Link>();


PagedResourceListOfComplianceRuleV3Response pagedResourceListOfComplianceRuleV3ResponseInstance = new PagedResourceListOfComplianceRuleV3Response()
    .nextPage(nextPage)
    .previousPage(previousPage)
    .values(values)
    .href(href)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)