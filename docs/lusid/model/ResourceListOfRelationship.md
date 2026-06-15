# com.finbourne.sdk.services.lusid.model.ResourceListOfRelationship
classname ResourceListOfRelationship

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**List&lt;Relationship&gt;**](Relationship.md) |  | [default to List<Relationship>]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]
**nextPage** | **String** |  | [optional] [default to String]
**previousPage** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ResourceListOfRelationship;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<Relationship> values = new List<Relationship>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable List<Link> links = new List<Link>();
@javax.annotation.Nullable String nextPage = "example nextPage";
@javax.annotation.Nullable String previousPage = "example previousPage";


ResourceListOfRelationship resourceListOfRelationshipInstance = new ResourceListOfRelationship()
    .values(values)
    .href(href)
    .links(links)
    .nextPage(nextPage)
    .previousPage(previousPage);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)