# com.finbourne.sdk.services.lusid.model.RecActivitySinceEffectiveAt
classname RecActivitySinceEffectiveAt
A per-side exclusive lower bound on an activity window's effective range.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | [**OffsetDateTime**](OffsetDateTime.md) | The exclusive lower bound for the left side. Activity effective at exactly this datetime falls outside the window. | [default to OffsetDateTime]
**right** | [**OffsetDateTime**](OffsetDateTime.md) | The exclusive lower bound for the right side. Activity effective at exactly this datetime falls outside the window. | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.RecActivitySinceEffectiveAt;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime left = OffsetDateTime.now();
OffsetDateTime right = OffsetDateTime.now();


RecActivitySinceEffectiveAt recActivitySinceEffectiveAtInstance = new RecActivitySinceEffectiveAt()
    .left(left)
    .right(right);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)