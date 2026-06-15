# com.finbourne.sdk.services.lusid.model.Participation
classname Participation
The record an order's participation in a specific placement.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**placementId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**orderId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**dataModelMembership** | [**DataModelMembership**](DataModelMembership.md) |  | [optional] [default to DataModelMembership]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.Participation;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
ResourceId placementId = new ResourceId();
ResourceId orderId = new ResourceId();
Version version = new Version();
DataModelMembership dataModelMembership = new DataModelMembership();
@javax.annotation.Nullable List<Link> links = new List<Link>();


Participation participationInstance = new Participation()
    .id(id)
    .placementId(placementId)
    .orderId(orderId)
    .version(version)
    .dataModelMembership(dataModelMembership)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)