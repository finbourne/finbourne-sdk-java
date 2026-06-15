# com.finbourne.sdk.services.horizon.model.UpdateVersionedConfigurationDraftRequest
classname UpdateVersionedConfigurationDraftRequest
Request to update the value of an existing draft versioned configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** | The new JSON value to store. Must be valid JSON. | [default to String]

```java
import com.finbourne.sdk.services.horizon.model.UpdateVersionedConfigurationDraftRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String value = "example value";


UpdateVersionedConfigurationDraftRequest updateVersionedConfigurationDraftRequestInstance = new UpdateVersionedConfigurationDraftRequest()
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)