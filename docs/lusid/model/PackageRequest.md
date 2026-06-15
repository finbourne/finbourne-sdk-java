# com.finbourne.sdk.services.lusid.model.PackageRequest
classname PackageRequest
A request to create or update a Package.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**orderIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | Related order ids. | [default to List<ResourceId>]
**orderInstructionIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | Related order instruction ids. | [default to List<ResourceId>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this execution. | [optional] [default to Map<String, PerpetualProperty>]

```java
import com.finbourne.sdk.services.lusid.model.PackageRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
List<ResourceId> orderIds = new List<ResourceId>();
List<ResourceId> orderInstructionIds = new List<ResourceId>();
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();


PackageRequest packageRequestInstance = new PackageRequest()
    .id(id)
    .orderIds(orderIds)
    .orderInstructionIds(orderInstructionIds)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)