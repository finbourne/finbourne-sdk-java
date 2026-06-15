# com.finbourne.sdk.services.identity.model.UpdateSessionPolicyRequest
classname UpdateSessionPolicyRequest
Session timing settings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxSessionIdleMinutes** | **Long** | Maximum minutes a user&#39;s session can be idle before re-authentication is required. Must be between 5 minutes and 12 hours (720 minutes). | [default to Long]
**maxSessionLifetimeMinutes** | **Long** | Maximum minutes a user&#39;s session can live in total. Omit to disable session expiry; otherwise must be between 5 minutes and 24 hours (1440 minutes). | [optional] [default to Long]

```java
import com.finbourne.sdk.services.identity.model.UpdateSessionPolicyRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Long maxSessionIdleMinutes = new Long("100.00");
@javax.annotation.Nullable Long maxSessionLifetimeMinutes = new Long("100.00");


UpdateSessionPolicyRequest updateSessionPolicyRequestInstance = new UpdateSessionPolicyRequest()
    .maxSessionIdleMinutes(maxSessionIdleMinutes)
    .maxSessionLifetimeMinutes(maxSessionLifetimeMinutes);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)