# com.finbourne.sdk.services.lusid.model.ResourceListOfAddressKeyDefinition
classname ResourceListOfAddressKeyDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**List&lt;AddressKeyDefinition&gt;**](AddressKeyDefinition.md) |  | [default to List<AddressKeyDefinition>]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]
**nextPage** | **String** |  | [optional] [default to String]
**previousPage** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ResourceListOfAddressKeyDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<AddressKeyDefinition> values = new List<AddressKeyDefinition>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable List<Link> links = new List<Link>();
@javax.annotation.Nullable String nextPage = "example nextPage";
@javax.annotation.Nullable String previousPage = "example previousPage";


ResourceListOfAddressKeyDefinition resourceListOfAddressKeyDefinitionInstance = new ResourceListOfAddressKeyDefinition()
    .values(values)
    .href(href)
    .links(links)
    .nextPage(nextPage)
    .previousPage(previousPage);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)