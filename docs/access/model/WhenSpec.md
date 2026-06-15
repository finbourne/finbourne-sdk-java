# com.finbourne.sdk.services.access.model.WhenSpec
classname WhenSpec

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**deactivate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.access.model.WhenSpec;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime activate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime deactivate = OffsetDateTime.now();


WhenSpec whenSpecInstance = new WhenSpec()
    .activate(activate)
    .deactivate(deactivate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)