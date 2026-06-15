# com.finbourne.sdk.services.identity.model.SupportAccessExpiry
classname SupportAccessExpiry
Time at which the support access expires

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expiry** | [**OffsetDateTime**](OffsetDateTime.md) | DateTimeOffset at which the access will be revoked | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.identity.model.SupportAccessExpiry;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime expiry = OffsetDateTime.now();


SupportAccessExpiry supportAccessExpiryInstance = new SupportAccessExpiry()
    .expiry(expiry);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)