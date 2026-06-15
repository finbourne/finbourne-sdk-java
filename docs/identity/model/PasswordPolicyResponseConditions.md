# com.finbourne.sdk.services.identity.model.PasswordPolicyResponseConditions
classname PasswordPolicyResponseConditions
Password policy conditions for a password policy

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**complexity** | [**PasswordPolicyResponseComplexity**](PasswordPolicyResponseComplexity.md) |  | [default to PasswordPolicyResponseComplexity]
**age** | [**PasswordPolicyResponseAge**](PasswordPolicyResponseAge.md) |  | [default to PasswordPolicyResponseAge]
**lockout** | [**PasswordPolicyResponseLockout**](PasswordPolicyResponseLockout.md) |  | [default to PasswordPolicyResponseLockout]

```java
import com.finbourne.sdk.services.identity.model.PasswordPolicyResponseConditions;
import java.util.*;
import java.lang.System;
import java.net.URI;

PasswordPolicyResponseComplexity complexity = new PasswordPolicyResponseComplexity();
PasswordPolicyResponseAge age = new PasswordPolicyResponseAge();
PasswordPolicyResponseLockout lockout = new PasswordPolicyResponseLockout();


PasswordPolicyResponseConditions passwordPolicyResponseConditionsInstance = new PasswordPolicyResponseConditions()
    .complexity(complexity)
    .age(age)
    .lockout(lockout);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)