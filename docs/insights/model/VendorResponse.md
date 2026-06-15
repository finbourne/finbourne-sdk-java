# com.finbourne.sdk.services.insights.model.VendorResponse
classname VendorResponse
Details of a response to a request made to a vendor service.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID of the log. | [default to String]
**response** | **String** | The body of the response. | [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.insights.model.VendorResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String id = "example id";
String response = "example response";
@javax.annotation.Nullable List<Link> links = new List<Link>();


VendorResponse vendorResponseInstance = new VendorResponse()
    .id(id)
    .response(response)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)