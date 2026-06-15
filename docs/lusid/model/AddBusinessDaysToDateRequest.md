# com.finbourne.sdk.services.lusid.model.AddBusinessDaysToDateRequest
classname AddBusinessDaysToDateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessDayOffset** | **Integer** |  | [default to Integer]
**holidayCodes** | **List&lt;String&gt;** |  | [default to List<String>]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.AddBusinessDaysToDateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer businessDayOffset = new Integer("100.00");
List<String> holidayCodes = new List<String>();
OffsetDateTime startDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime asAt = OffsetDateTime.now();


AddBusinessDaysToDateRequest addBusinessDaysToDateRequestInstance = new AddBusinessDaysToDateRequest()
    .businessDayOffset(businessDayOffset)
    .holidayCodes(holidayCodes)
    .startDate(startDate)
    .asAt(asAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)