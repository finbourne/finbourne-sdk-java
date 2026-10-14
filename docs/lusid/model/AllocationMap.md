# com.finbourne.sdk.services.lusid.model.AllocationMap
classname AllocationMap
The rules that say which investor records share in the economics of a member of a Fund Structure, and on what basis.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**name** | **String** | The display name of the Allocation Map. | [default to String]
**description** | **String** | An optional description for the Allocation Map. | [optional] [default to String]
**structureMemberId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**inheritsFrom** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**participants** | [**AllocationMapParticipants**](AllocationMapParticipants.md) |  | [default to AllocationMapParticipants]
**basisByEventType** | [**List&lt;AllocationMapEventBasis&gt;**](AllocationMapEventBasis.md) | The basis on which each kind of allocation event is shared between the participants. At most one entry per event type and component; an entry without a component is the default for the event type. | [default to List<AllocationMapEventBasis>]
**roundingPartnerLine** | **String** | The investor record that takes every minor unit left over when the shares of an event are rounded. Absent means the leftover is spread one minor unit at a time over the largest remainders. | [optional] [default to String]
**ilpaTransactionTypes** | [**List&lt;AllocationMapIlpaTransactionType&gt;**](AllocationMapIlpaTransactionType.md) | The ILPA transaction types the map reports particular kinds of allocation event under, where they differ from the default for the event type and component. At most one entry per event type and component; an entry without a component is the default for the event type. Every value must be one the system IlpaTransactionType data type lists. | [optional] [default to List<AllocationMapIlpaTransactionType>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.AllocationMap;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
ResourceId id = new ResourceId();
String name = "example name";
@javax.annotation.Nullable String description = "example description";
ResourceId structureMemberId = new ResourceId();
ResourceId inheritsFrom = new ResourceId();
AllocationMapParticipants participants = new AllocationMapParticipants();
List<AllocationMapEventBasis> basisByEventType = new List<AllocationMapEventBasis>();
@javax.annotation.Nullable String roundingPartnerLine = "example roundingPartnerLine";
@javax.annotation.Nullable List<AllocationMapIlpaTransactionType> ilpaTransactionTypes = new List<AllocationMapIlpaTransactionType>();
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


AllocationMap allocationMapInstance = new AllocationMap()
    .href(href)
    .id(id)
    .name(name)
    .description(description)
    .structureMemberId(structureMemberId)
    .inheritsFrom(inheritsFrom)
    .participants(participants)
    .basisByEventType(basisByEventType)
    .roundingPartnerLine(roundingPartnerLine)
    .ilpaTransactionTypes(ilpaTransactionTypes)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)