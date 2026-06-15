# com.finbourne.sdk.services.horizon.model.ReplayOptions
classname ReplayOptions
Optional parameters for replay operations.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**overridePublicationStatus** | **String** | Override publication status for all transactions (e.g., force as \&quot;New\&quot;). | [optional] [default to String]

```java
import com.finbourne.sdk.services.horizon.model.ReplayOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String overridePublicationStatus = "example overridePublicationStatus";


ReplayOptions replayOptionsInstance = new ReplayOptions()
    .overridePublicationStatus(overridePublicationStatus);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)