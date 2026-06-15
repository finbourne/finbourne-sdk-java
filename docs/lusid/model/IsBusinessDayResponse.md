# com.finbourne.sdk.services.lusid.model.IsBusinessDayResponse
classname IsBusinessDayResponse
Whether or not a DateTimeOffset is a business DateTime

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestedDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**isBusinessDay** | **Boolean** |  | [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.IsBusinessDayResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime requestedDateTime = OffsetDateTime.now();
Boolean isBusinessDay = true;


IsBusinessDayResponse isBusinessDayResponseInstance = new IsBusinessDayResponse()
    .requestedDateTime(requestedDateTime)
    .isBusinessDay(isBusinessDay);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)