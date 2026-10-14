# com.finbourne.sdk.services.lusid.model.AllocationMapRequest
classname AllocationMapRequest
The request used to create or update an Allocation Map.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code of the Allocation Map. | [default to String]
**name** | **String** | The display name of the Allocation Map. | [default to String]
**description** | **String** | An optional description for the Allocation Map. | [optional] [default to String]
**structureMemberId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**inheritsFrom** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**participants** | [**AllocationMapParticipants**](AllocationMapParticipants.md) |  | [optional] [default to AllocationMapParticipants]
**basisByEventType** | [**List&lt;AllocationMapEventBasis&gt;**](AllocationMapEventBasis.md) | The basis on which each kind of allocation event is shared between the participants. At most one entry per event type and component; an entry without a component is the default for the event type. | [optional] [default to List<AllocationMapEventBasis>]
**roundingPartnerLine** | **String** | The investor record that takes every minor unit left over when the shares of an event are rounded. Absent means the leftover is spread one minor unit at a time over the largest remainders. | [optional] [default to String]
**ilpaTransactionTypes** | [**List&lt;AllocationMapIlpaTransactionType&gt;**](AllocationMapIlpaTransactionType.md) | The ILPA transaction types the map reports particular kinds of allocation event under, where they differ from the default for the event type and component. At most one entry per event type and component; an entry without a component is the default for the event type. Every value must be one the system IlpaTransactionType data type lists. | [optional] [default to List<AllocationMapIlpaTransactionType>]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime from which the Allocation Map applies. Defaults to the beginning of time if not specified, so that the map is visible at every effective datetime. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.AllocationMapRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
String name = "example name";
@javax.annotation.Nullable String description = "example description";
ResourceId structureMemberId = new ResourceId();
ResourceId inheritsFrom = new ResourceId();
AllocationMapParticipants participants = new AllocationMapParticipants();
@javax.annotation.Nullable List<AllocationMapEventBasis> basisByEventType = new List<AllocationMapEventBasis>();
@javax.annotation.Nullable String roundingPartnerLine = "example roundingPartnerLine";
@javax.annotation.Nullable List<AllocationMapIlpaTransactionType> ilpaTransactionTypes = new List<AllocationMapIlpaTransactionType>();
@javax.annotation.Nullable OffsetDateTime effectiveAt = OffsetDateTime.now();


AllocationMapRequest allocationMapRequestInstance = new AllocationMapRequest()
    .code(code)
    .name(name)
    .description(description)
    .structureMemberId(structureMemberId)
    .inheritsFrom(inheritsFrom)
    .participants(participants)
    .basisByEventType(basisByEventType)
    .roundingPartnerLine(roundingPartnerLine)
    .ilpaTransactionTypes(ilpaTransactionTypes)
    .effectiveAt(effectiveAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)