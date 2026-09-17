# com.finbourne.sdk.services.lusid.model.RecActivityWindow
classname RecActivityWindow
Base class for the activity windows that give the date range a rec definition's activity-based  reconciliations cover. Polymorphic by windowType; each supported type has a corresponding inherited class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**windowType** | **String** | Polymorphic discriminator. Supported types: Contiguous. Contiguous requires effectiveAtProgression Series. Available values: Contiguous, FixedLookback, Explicit, ClosedPeriod, ContiguousAsAt. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RecActivityWindow;
import java.util.*;
import java.lang.System;
import java.net.URI;

String windowType = "example windowType";


RecActivityWindow recActivityWindowInstance = new RecActivityWindow()
    .windowType(windowType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)