# com.finbourne.sdk.services.identity.model.LogGeographicalContext
classname LogGeographicalContext
Represents a LogGeographicalContext resource in the Okta API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**city** | **String** |  | [optional] [default to String]
**state** | **String** |  | [optional] [default to String]
**country** | **String** |  | [optional] [default to String]
**postalCode** | **String** |  | [optional] [default to String]
**geolocation** | [**LogGeolocation**](LogGeolocation.md) |  | [optional] [default to LogGeolocation]

```java
import com.finbourne.sdk.services.identity.model.LogGeographicalContext;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String city = "example city";
@javax.annotation.Nullable String state = "example state";
@javax.annotation.Nullable String country = "example country";
@javax.annotation.Nullable String postalCode = "example postalCode";
LogGeolocation geolocation = new LogGeolocation();


LogGeographicalContext logGeographicalContextInstance = new LogGeographicalContext()
    .city(city)
    .state(state)
    .country(country)
    .postalCode(postalCode)
    .geolocation(geolocation);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)