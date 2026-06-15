# com.finbourne.sdk.services.identity.model.LogGeolocation
classname LogGeolocation
Represents a LogGeolocation resource in the Okta API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**latitude** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**longitude** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.identity.model.LogGeolocation;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable java.math.BigDecimal latitude = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal longitude = new java.math.BigDecimal("100.00");


LogGeolocation logGeolocationInstance = new LogGeolocation()
    .latitude(latitude)
    .longitude(longitude);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)