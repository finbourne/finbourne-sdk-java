# com.finbourne.sdk.services.lusid.model.UpsertInstrumentEventRequest
classname UpsertInstrumentEventRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventId** | **String** | Free string that uniquely identifies the event within the corporate action source | [default to String]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The set of identifiers which determine the instrument this event relates to. | [default to Map<String, String>]
**description** | **String** | The description of the instrument event. | [optional] [default to String]
**instrumentEvent** | [**InstrumentEvent**](InstrumentEvent.md) |  | [default to InstrumentEvent]
**properties** | [**List&lt;PerpetualProperty&gt;**](PerpetualProperty.md) | The properties attached to this instrument event. | [optional] [default to List<PerpetualProperty>]
**sequenceNumber** | **Integer** | The order of the instrument event relative others on the same date (0 being processed first). Must be non negative. | [optional] [default to Integer]
**participationType** | **String** | Indicates the type of participation in this event. Default value: Mandatory. Available values: Mandatory, MandatoryWithChoices, Voluntary. | [optional] [default to String]
**eventDateStamps** | [**Map&lt;String, YearMonthDay&gt;**](YearMonthDay.md) | The date stamps corresponding to the relevant date-time fields for the instrument event. The key for each provided date stamp must match the field name of a valid datetime field from the InstrumentEvent DTO. | [optional] [default to Map<String, YearMonthDay>]

```java
import com.finbourne.sdk.services.lusid.model.UpsertInstrumentEventRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String instrumentEventId = "example instrumentEventId";
Map<String, String> instrumentIdentifiers = new Map<String, String>();
@javax.annotation.Nullable String description = "example description";
InstrumentEvent instrumentEvent = new InstrumentEvent();
@javax.annotation.Nullable List<PerpetualProperty> properties = new List<PerpetualProperty>();
@javax.annotation.Nullable Integer sequenceNumber = new Integer("100.00");
@javax.annotation.Nullable String participationType = "example participationType";
@javax.annotation.Nullable Map<String, YearMonthDay> eventDateStamps = new Map<String, YearMonthDay>();


UpsertInstrumentEventRequest upsertInstrumentEventRequestInstance = new UpsertInstrumentEventRequest()
    .instrumentEventId(instrumentEventId)
    .instrumentIdentifiers(instrumentIdentifiers)
    .description(description)
    .instrumentEvent(instrumentEvent)
    .properties(properties)
    .sequenceNumber(sequenceNumber)
    .participationType(participationType)
    .eventDateStamps(eventDateStamps);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)