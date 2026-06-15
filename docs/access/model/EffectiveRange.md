# com.finbourne.sdk.services.access.model.EffectiveRange
classname EffectiveRange

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**to** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.access.model.EffectiveRange;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime from = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime to = OffsetDateTime.now();


EffectiveRange effectiveRangeInstance = new EffectiveRange()
    .from(from)
    .to(to);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)