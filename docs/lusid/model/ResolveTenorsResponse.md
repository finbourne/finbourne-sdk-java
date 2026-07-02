# com.finbourne.sdk.services.lusid.model.ResolveTenorsResponse
classname ResolveTenorsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**spotDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**eomRuleApplied** | **Boolean** |  | [default to Boolean]
**dates** | [**Map&lt;String, OffsetDateTime&gt;**](OffsetDateTime.md) |  | [default to Map<String, OffsetDateTime>]

```java
import com.finbourne.sdk.services.lusid.model.ResolveTenorsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime startDate = OffsetDateTime.now();
OffsetDateTime spotDate = OffsetDateTime.now();
Boolean eomRuleApplied = true;
Map<String, OffsetDateTime> dates = new Map<String, OffsetDateTime>();


ResolveTenorsResponse resolveTenorsResponseInstance = new ResolveTenorsResponse()
    .startDate(startDate)
    .spotDate(spotDate)
    .eomRuleApplied(eomRuleApplied)
    .dates(dates);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)