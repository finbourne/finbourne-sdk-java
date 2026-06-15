# com.finbourne.sdk.services.lusid.model.CreateDateRequest
classname CreateDateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateId** | **String** |  | [default to String]
**fromUtc** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**toUtc** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**timeZone** | **String** |  | [default to String]
**description** | **String** |  | [default to String]
**type** | **String** |  | [optional] [default to String]
**attributes** | [**DateAttributes**](DateAttributes.md) |  | [optional] [default to DateAttributes]
**sourceData** | **Map&lt;String, String&gt;** |  | [optional] [default to Map<String, String>]

```java
import com.finbourne.sdk.services.lusid.model.CreateDateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String dateId = "example dateId";
OffsetDateTime fromUtc = OffsetDateTime.now();
OffsetDateTime toUtc = OffsetDateTime.now();
String timeZone = "example timeZone";
String description = "example description";
@javax.annotation.Nullable String type = "example type";
DateAttributes attributes = new DateAttributes();
@javax.annotation.Nullable Map<String, String> sourceData = new Map<String, String>();


CreateDateRequest createDateRequestInstance = new CreateDateRequest()
    .dateId(dateId)
    .fromUtc(fromUtc)
    .toUtc(toUtc)
    .timeZone(timeZone)
    .description(description)
    .type(type)
    .attributes(attributes)
    .sourceData(sourceData);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)