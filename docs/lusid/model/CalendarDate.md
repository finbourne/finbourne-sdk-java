# com.finbourne.sdk.services.lusid.model.CalendarDate
classname CalendarDate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**dateIdentifier** | **String** |  | [default to String]
**fromUtc** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**toUtc** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**_localDate** | **String** |  | [default to String]
**timezone** | **String** |  | [default to String]
**description** | **String** |  | [default to String]
**type** | **String** |  | [optional] [default to String]
**attributes** | [**DateAttributes**](DateAttributes.md) |  | [optional] [default to DateAttributes]
**sourceData** | **Map&lt;String, String&gt;** |  | [optional] [default to Map<String, String>]

```java
import com.finbourne.sdk.services.lusid.model.CalendarDate;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
String dateIdentifier = "example dateIdentifier";
OffsetDateTime fromUtc = OffsetDateTime.now();
OffsetDateTime toUtc = OffsetDateTime.now();
String localDate = "example localDate";
String timezone = "example timezone";
String description = "example description";
@javax.annotation.Nullable String type = "example type";
DateAttributes attributes = new DateAttributes();
@javax.annotation.Nullable Map<String, String> sourceData = new Map<String, String>();


CalendarDate calendarDateInstance = new CalendarDate()
    .href(href)
    .dateIdentifier(dateIdentifier)
    .fromUtc(fromUtc)
    .toUtc(toUtc)
    .localDate(localDate)
    .timezone(timezone)
    .description(description)
    .type(type)
    .attributes(attributes)
    .sourceData(sourceData);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)