# com.finbourne.sdk.services.lusid.model.TimeZoneConventions
classname TimeZoneConventions
Provides information on the primary time zone of an instrument and optional cut labels  for defining times to be used by instrument events.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**primaryTimeZone** | **String** | The IANA time zone code for the instrument. | [default to String]
**startOfDay** | **String** | A LUSID Cut Label code used for generating instrument events at a time other than local midnight. | [optional] [default to String]
**primaryMarketOpen** | **String** | A LUSID Cut Label code used for delaying the transaction time of certain instrument events until market open. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TimeZoneConventions;
import java.util.*;
import java.lang.System;
import java.net.URI;

String primaryTimeZone = "example primaryTimeZone";
@javax.annotation.Nullable String startOfDay = "example startOfDay";
@javax.annotation.Nullable String primaryMarketOpen = "example primaryMarketOpen";


TimeZoneConventions timeZoneConventionsInstance = new TimeZoneConventions()
    .primaryTimeZone(primaryTimeZone)
    .startOfDay(startOfDay)
    .primaryMarketOpen(primaryMarketOpen);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)