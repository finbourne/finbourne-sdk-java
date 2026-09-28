# com.finbourne.sdk.services.lusid.model.ContiguousActivityWindow
classname ContiguousActivityWindow
The activity window for a running series of instances: each instance's window starts where the previous  instance's ended, so the series tiles the effective timeline with no gaps and no overlap. Requires the  definition's effectiveAtProgression to be Series.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**initialActivitySinceEffectiveAt** | [**RecActivitySinceEffectiveAt**](RecActivitySinceEffectiveAt.md) |  | [default to RecActivitySinceEffectiveAt]
**windowType** | **String** | Polymorphic discriminator. Supported types: Contiguous. Contiguous requires effectiveAtProgression Series. Available values: Contiguous, FixedLookback, Explicit, ClosedPeriod, ContiguousAsAt. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ContiguousActivityWindow;
import java.util.*;
import java.lang.System;
import java.net.URI;

RecActivitySinceEffectiveAt initialActivitySinceEffectiveAt = new RecActivitySinceEffectiveAt();
String windowType = "example windowType";


ContiguousActivityWindow contiguousActivityWindowInstance = new ContiguousActivityWindow()
    .initialActivitySinceEffectiveAt(initialActivitySinceEffectiveAt)
    .windowType(windowType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)