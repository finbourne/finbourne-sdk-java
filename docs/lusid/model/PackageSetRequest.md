# com.finbourne.sdk.services.lusid.model.PackageSetRequest
classname PackageSetRequest
A request to create or update multiple Packages.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requests** | [**List&lt;PackageRequest&gt;**](PackageRequest.md) | A collection of PackageRequests. | [optional] [default to List<PackageRequest>]

```java
import com.finbourne.sdk.services.lusid.model.PackageSetRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<PackageRequest> requests = new List<PackageRequest>();


PackageSetRequest packageSetRequestInstance = new PackageSetRequest()
    .requests(requests);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)