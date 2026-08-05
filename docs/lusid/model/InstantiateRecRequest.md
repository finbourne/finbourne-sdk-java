# com.finbourne.sdk.services.lusid.model.InstantiateRecRequest
classname InstantiateRecRequest
The request to instantiate a new rec instance from a rec definition and start its first run. Each  date accepts a date-time or a LUSID cut label, and defaults to the current date-time when omitted.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**leftEffectiveAt** | **String** | The left effective datetime, as a date-time or a LUSID cut label. Defaults to the current date-time. | [optional] [default to String]
**leftAsAt** | **String** | The left asAt datetime, as a date-time or a LUSID cut label. Defaults to the current date-time. | [optional] [default to String]
**rightEffectiveAt** | **String** | The right effective datetime, as a date-time or a LUSID cut label. Defaults to the current date-time. | [optional] [default to String]
**rightAsAt** | **String** | The right asAt datetime, as a date-time or a LUSID cut label. Defaults to the current date-time. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.InstantiateRecRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId recDefinitionId = new ResourceId();
@javax.annotation.Nullable String leftEffectiveAt = "example leftEffectiveAt";
@javax.annotation.Nullable String leftAsAt = "example leftAsAt";
@javax.annotation.Nullable String rightEffectiveAt = "example rightEffectiveAt";
@javax.annotation.Nullable String rightAsAt = "example rightAsAt";


InstantiateRecRequest instantiateRecRequestInstance = new InstantiateRecRequest()
    .recDefinitionId(recDefinitionId)
    .leftEffectiveAt(leftEffectiveAt)
    .leftAsAt(leftAsAt)
    .rightEffectiveAt(rightEffectiveAt)
    .rightAsAt(rightAsAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)