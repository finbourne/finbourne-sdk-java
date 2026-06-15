# com.finbourne.sdk.services.lusid.model.FeeType
classname FeeType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the fee type. | [default to String]
**description** | **String** | The description of the fee type. | [default to String]
**componentTransactions** | [**List&lt;ComponentTransaction&gt;**](ComponentTransaction.md) | A set of component transactions that relate to the fee type to be created. | [default to List<ComponentTransaction>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.FeeType;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
ResourceId id = new ResourceId();
String displayName = "example displayName";
String description = "example description";
List<ComponentTransaction> componentTransactions = new List<ComponentTransaction>();
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


FeeType feeTypeInstance = new FeeType()
    .href(href)
    .id(id)
    .displayName(displayName)
    .description(description)
    .componentTransactions(componentTransactions)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)