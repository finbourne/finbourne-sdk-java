# com.finbourne.sdk.services.configuration.model.ServiceApiEndpoints
classname ServiceApiEndpoints

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application** | **String** |  | [default to String]
**endpoints** | [**List&lt;ApiEndpoint&gt;**](ApiEndpoint.md) |  | [default to List<ApiEndpoint>]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.configuration.model.ServiceApiEndpoints;
import java.util.*;
import java.lang.System;
import java.net.URI;

String application = "example application";
List<ApiEndpoint> endpoints = new List<ApiEndpoint>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable List<Link> links = new List<Link>();


ServiceApiEndpoints serviceApiEndpointsInstance = new ServiceApiEndpoints()
    .application(application)
    .endpoints(endpoints)
    .href(href)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)