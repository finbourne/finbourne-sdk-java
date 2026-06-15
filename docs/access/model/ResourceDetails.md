# com.finbourne.sdk.services.access.model.ResourceDetails
classname ResourceDetails
Details about the resource being requested that may be pertinent to the entitlement evaluation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Map&lt;String, String&gt;** | The identifier of the resource being evaluated | [default to Map<String, String>]
**metadata** | [**Map&lt;String, List&lt;EntitlementMetadata&gt;&gt;**](List.md) | Any metadata associated with the resource being requested | [optional] [default to Map<String, List<EntitlementMetadata>>]

```java
import com.finbourne.sdk.services.access.model.ResourceDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> id = new Map<String, String>();
@javax.annotation.Nullable Map<String, List<EntitlementMetadata>> metadata = new Map<String, List<EntitlementMetadata>>();


ResourceDetails resourceDetailsInstance = new ResourceDetails()
    .id(id)
    .metadata(metadata);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)