# com.finbourne.sdk.services.lusid.model.ModelPackage
classname ModelPackage
A structure used to describe the structure of an order or orders that make up a non-trivial trade.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**orderIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | Related order ids. | [default to List<ResourceId>]
**orderInstructionIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | Related order instruction ids. | [default to List<ResourceId>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this execution. | [optional] [default to Map<String, PerpetualProperty>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**dataModelMembership** | [**DataModelMembership**](DataModelMembership.md) |  | [optional] [default to DataModelMembership]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.ModelPackage;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
List<ResourceId> orderIds = new List<ResourceId>();
List<ResourceId> orderInstructionIds = new List<ResourceId>();
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();
Version version = new Version();
DataModelMembership dataModelMembership = new DataModelMembership();
@javax.annotation.Nullable List<Link> links = new List<Link>();


ModelPackage modelPackageInstance = new ModelPackage()
    .id(id)
    .orderIds(orderIds)
    .orderInstructionIds(orderInstructionIds)
    .properties(properties)
    .version(version)
    .dataModelMembership(dataModelMembership)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)