# com.finbourne.sdk.services.horizon.model.VersionedConfigurationTypeResponse
classname VersionedConfigurationTypeResponse
Represents a registered versioned configuration type.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configType** | **String** |  | [default to String]
**displayName** | **String** |  | [default to String]

```java
import com.finbourne.sdk.services.horizon.model.VersionedConfigurationTypeResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String configType = "example configType";
String displayName = "example displayName";


VersionedConfigurationTypeResponse versionedConfigurationTypeResponseInstance = new VersionedConfigurationTypeResponse()
    .configType(configType)
    .displayName(displayName);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)