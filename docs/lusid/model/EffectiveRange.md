# com.finbourne.sdk.services.lusid.model.EffectiveRange
classname EffectiveRange

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fromDate** | [**OffsetDateTime**](OffsetDateTime.md) | The effective from datetime that this range applies to. | [optional] [default to OffsetDateTime]
**untilDate** | [**OffsetDateTime**](OffsetDateTime.md) | The effective from datetime that this range applies to. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.EffectiveRange;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime fromDate = OffsetDateTime.now();
OffsetDateTime untilDate = OffsetDateTime.now();


EffectiveRange effectiveRangeInstance = new EffectiveRange()
    .fromDate(fromDate)
    .untilDate(untilDate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)