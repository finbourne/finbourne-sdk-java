# com.finbourne.sdk.services.lusid.model.PagedResourceListOfTransactionTemplateSpecification
classname PagedResourceListOfTransactionTemplateSpecification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nextPage** | **String** |  | [optional] [default to String]
**previousPage** | **String** |  | [optional] [default to String]
**values** | [**List&lt;TransactionTemplateSpecification&gt;**](TransactionTemplateSpecification.md) |  | [default to List<TransactionTemplateSpecification>]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.PagedResourceListOfTransactionTemplateSpecification;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String nextPage = "example nextPage";
@javax.annotation.Nullable String previousPage = "example previousPage";
List<TransactionTemplateSpecification> values = new List<TransactionTemplateSpecification>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable List<Link> links = new List<Link>();


PagedResourceListOfTransactionTemplateSpecification pagedResourceListOfTransactionTemplateSpecificationInstance = new PagedResourceListOfTransactionTemplateSpecification()
    .nextPage(nextPage)
    .previousPage(previousPage)
    .values(values)
    .href(href)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)