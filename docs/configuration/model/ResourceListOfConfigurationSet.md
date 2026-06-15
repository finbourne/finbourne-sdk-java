# com.finbourne.sdk.services.configuration.model.ResourceListOfConfigurationSet
classname ResourceListOfConfigurationSet

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**List&lt;ConfigurationSet&gt;**](ConfigurationSet.md) |  | [default to List<ConfigurationSet>]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]
**nextPage** | **String** |  | [optional] [default to String]
**previousPage** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.configuration.model.ResourceListOfConfigurationSet;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<ConfigurationSet> values = new List<ConfigurationSet>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable List<Link> links = new List<Link>();
@javax.annotation.Nullable String nextPage = "example nextPage";
@javax.annotation.Nullable String previousPage = "example previousPage";


ResourceListOfConfigurationSet resourceListOfConfigurationSetInstance = new ResourceListOfConfigurationSet()
    .values(values)
    .href(href)
    .links(links)
    .nextPage(nextPage)
    .previousPage(previousPage);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)