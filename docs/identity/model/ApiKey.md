# com.finbourne.sdk.services.identity.model.ApiKey
classname ApiKey
The metadata of an API key

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The unique Id of the API key | [default to String]
**displayName** | **String** | The display name of the API key | [default to String]
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) | The creation date of the API key | [default to OffsetDateTime]
**deactivationDate** | [**OffsetDateTime**](OffsetDateTime.md) | The deactivation date of the API key | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.identity.model.ApiKey;
import java.util.*;
import java.lang.System;
import java.net.URI;

String id = "example id";
String displayName = "example displayName";
OffsetDateTime createdDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime deactivationDate = OffsetDateTime.now();


ApiKey apiKeyInstance = new ApiKey()
    .id(id)
    .displayName(displayName)
    .createdDate(createdDate)
    .deactivationDate(deactivationDate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)