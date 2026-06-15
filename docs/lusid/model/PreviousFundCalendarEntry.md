# com.finbourne.sdk.services.lusid.model.PreviousFundCalendarEntry
classname PreviousFundCalendarEntry

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The unique Code of the Calendar Entry. The Calendar Entry, together with the Fund Scope and Code, uniquely identifies a Fund Calendar Entry. | [default to String]
**displayName** | **String** | The name of the Fund Calendar entry. | [default to String]
**description** | **String** | A description for the Fund Calendar entry. | [optional] [default to String]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective at of the Calendar Entry. | [optional] [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime for the Calendar Entry. | [default to OffsetDateTime]
**holdingsAsAtOverride** | [**OffsetDateTime**](OffsetDateTime.md) | The optional AsAt Override to use for building holdings in the Valuation Point. Defaults to QueryAsAt. | [optional] [default to OffsetDateTime]
**valuationsAsAtOverride** | [**OffsetDateTime**](OffsetDateTime.md) | The optional AsAt Override to use for performing valuations in the Valuation Point. Defaults to QueryAsAt. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.PreviousFundCalendarEntry;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
OffsetDateTime effectiveAt = OffsetDateTime.now();
OffsetDateTime asAt = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime holdingsAsAtOverride = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime valuationsAsAtOverride = OffsetDateTime.now();


PreviousFundCalendarEntry previousFundCalendarEntryInstance = new PreviousFundCalendarEntry()
    .code(code)
    .displayName(displayName)
    .description(description)
    .effectiveAt(effectiveAt)
    .asAt(asAt)
    .holdingsAsAtOverride(holdingsAsAtOverride)
    .valuationsAsAtOverride(valuationsAsAtOverride);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)