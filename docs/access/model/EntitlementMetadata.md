# com.finbourne.sdk.services.access.model.EntitlementMetadata
classname EntitlementMetadata

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**provider** | **String** |  | [optional] [default to String]
**value** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.access.model.EntitlementMetadata;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String provider = "example provider";
@javax.annotation.Nullable String value = "example value";


EntitlementMetadata entitlementMetadataInstance = new EntitlementMetadata()
    .provider(provider)
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)