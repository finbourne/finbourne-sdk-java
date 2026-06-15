# com.finbourne.sdk.services.identity.model.UpdatePasswordPolicyRequestLockout
classname UpdatePasswordPolicyRequestLockout

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxAttempts** | **Integer** | The maximum number of unsuccessful attempts before the user is locked out of their account. 0 indicates no limit | [default to Integer]

```java
import com.finbourne.sdk.services.identity.model.UpdatePasswordPolicyRequestLockout;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer maxAttempts = new Integer("100.00");


UpdatePasswordPolicyRequestLockout updatePasswordPolicyRequestLockoutInstance = new UpdatePasswordPolicyRequestLockout()
    .maxAttempts(maxAttempts);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)