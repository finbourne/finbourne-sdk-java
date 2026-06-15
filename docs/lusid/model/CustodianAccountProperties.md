# com.finbourne.sdk.services.lusid.model.CustodianAccountProperties
classname CustodianAccountProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The Custodian Account properties. These will be from the &#39;CustodianAccount&#39; domain. | [optional] [default to Map<String, Property>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.CustodianAccountProperties;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


CustodianAccountProperties custodianAccountPropertiesInstance = new CustodianAccountProperties()
    .href(href)
    .properties(properties)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)