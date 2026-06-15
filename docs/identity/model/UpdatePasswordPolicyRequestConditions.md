# com.finbourne.sdk.services.identity.model.UpdatePasswordPolicyRequestConditions
classname UpdatePasswordPolicyRequestConditions
Password policy conditions for a password policy

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**complexity** | [**UpdatePasswordPolicyRequestComplexity**](UpdatePasswordPolicyRequestComplexity.md) |  | [default to UpdatePasswordPolicyRequestComplexity]
**age** | [**UpdatePasswordPolicyRequestAge**](UpdatePasswordPolicyRequestAge.md) |  | [default to UpdatePasswordPolicyRequestAge]
**lockout** | [**UpdatePasswordPolicyRequestLockout**](UpdatePasswordPolicyRequestLockout.md) |  | [default to UpdatePasswordPolicyRequestLockout]

```java
import com.finbourne.sdk.services.identity.model.UpdatePasswordPolicyRequestConditions;
import java.util.*;
import java.lang.System;
import java.net.URI;

UpdatePasswordPolicyRequestComplexity complexity = new UpdatePasswordPolicyRequestComplexity();
UpdatePasswordPolicyRequestAge age = new UpdatePasswordPolicyRequestAge();
UpdatePasswordPolicyRequestLockout lockout = new UpdatePasswordPolicyRequestLockout();


UpdatePasswordPolicyRequestConditions updatePasswordPolicyRequestConditionsInstance = new UpdatePasswordPolicyRequestConditions()
    .complexity(complexity)
    .age(age)
    .lockout(lockout);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)