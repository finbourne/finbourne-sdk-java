# com.finbourne.sdk.services.identity.model.CreateApiKey
classname CreateApiKey
Create an API key

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The display name for the API key | [default to String]
**deactivationDate** | [**OffsetDateTime**](OffsetDateTime.md) | The optional date at which the key should deactivate | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.identity.model.CreateApiKey;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
@javax.annotation.Nullable OffsetDateTime deactivationDate = OffsetDateTime.now();


CreateApiKey createApiKeyInstance = new CreateApiKey()
    .displayName(displayName)
    .deactivationDate(deactivationDate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)