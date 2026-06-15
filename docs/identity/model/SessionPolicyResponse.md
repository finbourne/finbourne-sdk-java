# com.finbourne.sdk.services.identity.model.SessionPolicyResponse
classname SessionPolicyResponse
Session timing settings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxSessionIdleMinutes** | **Long** | Maximum minutes a user&#39;s session can be idle before re-authentication is required. | [optional] [default to Long]
**maxSessionLifetimeMinutes** | **Long** | Maximum minutes a user&#39;s session can live in total. When absent, sessions do not expire. | [optional] [default to Long]

```java
import com.finbourne.sdk.services.identity.model.SessionPolicyResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Long maxSessionIdleMinutes = new Long("100.00");
@javax.annotation.Nullable Long maxSessionLifetimeMinutes = new Long("100.00");


SessionPolicyResponse sessionPolicyResponseInstance = new SessionPolicyResponse()
    .maxSessionIdleMinutes(maxSessionIdleMinutes)
    .maxSessionLifetimeMinutes(maxSessionLifetimeMinutes);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)