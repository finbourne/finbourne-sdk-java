# com.finbourne.sdk.services.lusid.model.ExternalDealingEstimateSource
classname ExternalDealingEstimateSource
The system that sent an external order set, and its own reference for the batch.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**system** | **String** |  | [default to String]
**reference** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ExternalDealingEstimateSource;
import java.util.*;
import java.lang.System;
import java.net.URI;

String system = "example system";
@javax.annotation.Nullable String reference = "example reference";


ExternalDealingEstimateSource externalDealingEstimateSourceInstance = new ExternalDealingEstimateSource()
    .system(system)
    .reference(reference);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)