# com.finbourne.sdk.services.lusid.model.InstrumentEventHolder
classname InstrumentEventHolder
An instrument event equipped with additional metadata.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventId** | **String** | The unique identifier of this corporate action. | [default to String]
**corporateActionSourceId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The set of identifiers which determine the instrument this event relates to. | [default to Map<String, String>]
**lusidInstrumentId** | **String** | The LUID for the instrument. | [default to String]
**instrumentScope** | **String** | The scope of the instrument. | [default to String]
**description** | **String** | The description of the instrument event. | [default to String]
**eventDateRange** | [**EventDateRange**](EventDateRange.md) |  | [default to EventDateRange]
**completeness** | **String** | Is the event Economically Complete, or is it missing some DataDependent fields (Incomplete). Available values: Complete, Incomplete. | [optional] [readonly] [default to String]
**instrumentEvent** | [**InstrumentEvent**](InstrumentEvent.md) |  | [default to InstrumentEvent]
**properties** | [**List&lt;PerpetualProperty&gt;**](PerpetualProperty.md) | The properties attached to this instrument event. | [optional] [default to List<PerpetualProperty>]
**sequenceNumber** | **Integer** | The order of the instrument event relative others on the same date (0 being processed first). Must be non negative. | [optional] [default to Integer]
**participationType** | **String** | Indicates the type of participation in this event. Default value: Mandatory. Available values: Mandatory, MandatoryWithChoices, Voluntary. | [optional] [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The AsAt time of the instrument event, if available. This is a readonly field and should not be provided on upsert. | [optional] [readonly] [default to OffsetDateTime]
**groupCode** | **String** | The group code that determines the processing order of instrument events with the same effective datetime. Available values: Tier1, Tier2, Tier3, Legacy. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.InstrumentEventHolder;
import java.util.*;
import java.lang.System;
import java.net.URI;

String instrumentEventId = "example instrumentEventId";
ResourceId corporateActionSourceId = new ResourceId();
Map<String, String> instrumentIdentifiers = new Map<String, String>();
String lusidInstrumentId = "example lusidInstrumentId";
String instrumentScope = "example instrumentScope";
String description = "example description";
EventDateRange eventDateRange = new EventDateRange();
@javax.annotation.Nullable String completeness = "example completeness";
InstrumentEvent instrumentEvent = new InstrumentEvent();
@javax.annotation.Nullable List<PerpetualProperty> properties = new List<PerpetualProperty>();
Integer sequenceNumber = new Integer("100.00");
@javax.annotation.Nullable String participationType = "example participationType";
@javax.annotation.Nullable OffsetDateTime asAt = OffsetDateTime.now();
@javax.annotation.Nullable String groupCode = "example groupCode";


InstrumentEventHolder instrumentEventHolderInstance = new InstrumentEventHolder()
    .instrumentEventId(instrumentEventId)
    .corporateActionSourceId(corporateActionSourceId)
    .instrumentIdentifiers(instrumentIdentifiers)
    .lusidInstrumentId(lusidInstrumentId)
    .instrumentScope(instrumentScope)
    .description(description)
    .eventDateRange(eventDateRange)
    .completeness(completeness)
    .instrumentEvent(instrumentEvent)
    .properties(properties)
    .sequenceNumber(sequenceNumber)
    .participationType(participationType)
    .asAt(asAt)
    .groupCode(groupCode);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)