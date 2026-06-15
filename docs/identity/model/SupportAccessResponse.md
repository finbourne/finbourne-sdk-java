# com.finbourne.sdk.services.identity.model.SupportAccessResponse
classname SupportAccessResponse
Timestamped successful response to grant access to your account

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID of the support access request | [default to String]
**duration** | **String** | The duration for which access is requested (in any ISO-8601 format) | [default to String]
**description** | **String** | The description of why the support access has been granted (i.e. support ticket numbers) | [optional] [default to String]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | DateTimeOffset at which the access was granted | [default to OffsetDateTime]
**expiry** | [**OffsetDateTime**](OffsetDateTime.md) | DateTimeOffset at which the access will be revoked | [default to OffsetDateTime]
**createdBy** | **String** | Obfuscated UserId of the user who granted the support access | [default to String]
**terminated** | **Boolean** | Whether or not that access has been invalidated | [optional] [default to Boolean]
**terminatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | DateTimeOffset at which the access was invalidated | [optional] [default to OffsetDateTime]
**terminatedBy** | **String** | Obfuscated UserId of the user who revoked the access | [optional] [default to String]
**permittedRoles** | **List&lt;String&gt;** | A list of permitted roles, valid for support staff to assume, for the duration of the access request | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.identity.model.SupportAccessResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String id = "example id";
String duration = "example duration";
@javax.annotation.Nullable String description = "example description";
OffsetDateTime createdAt = OffsetDateTime.now();
OffsetDateTime expiry = OffsetDateTime.now();
String createdBy = "example createdBy";
Boolean terminated = true;
@javax.annotation.Nullable OffsetDateTime terminatedAt = OffsetDateTime.now();
@javax.annotation.Nullable String terminatedBy = "example terminatedBy";
@javax.annotation.Nullable List<String> permittedRoles = new List<String>();


SupportAccessResponse supportAccessResponseInstance = new SupportAccessResponse()
    .id(id)
    .duration(duration)
    .description(description)
    .createdAt(createdAt)
    .expiry(expiry)
    .createdBy(createdBy)
    .terminated(terminated)
    .terminatedAt(terminatedAt)
    .terminatedBy(terminatedBy)
    .permittedRoles(permittedRoles);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)