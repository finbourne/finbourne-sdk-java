# com.finbourne.sdk.services.identity.model.PasswordPolicyResponseAge
classname PasswordPolicyResponseAge

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxAgeDays** | **Integer** | The maximum age (in days) a password can be before expiring and needing to be changed | [default to Integer]
**historyCount** | **Integer** | The number of unique passwords that need to be used before a previous password is permitted again | [default to Integer]

```java
import com.finbourne.sdk.services.identity.model.PasswordPolicyResponseAge;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer maxAgeDays = new Integer("100.00");
Integer historyCount = new Integer("100.00");


PasswordPolicyResponseAge passwordPolicyResponseAgeInstance = new PasswordPolicyResponseAge()
    .maxAgeDays(maxAgeDays)
    .historyCount(historyCount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)