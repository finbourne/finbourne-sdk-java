# com.finbourne.sdk.services.insights.model.VendorRequest
classname VendorRequest
Details of a request made to a vendor service.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID of the log. | [default to String]
**request** | **String** | The body of the request. | [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.insights.model.VendorRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String id = "example id";
String request = "example request";
@javax.annotation.Nullable List<Link> links = new List<Link>();


VendorRequest vendorRequestInstance = new VendorRequest()
    .id(id)
    .request(request)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)