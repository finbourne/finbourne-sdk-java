# com.finbourne.sdk.services.identity.model.PasswordPolicyResponseComplexity
classname PasswordPolicyResponseComplexity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**minLength** | **Integer** | The minimum length for a password | [default to Integer]
**excludeFirstName** | **Boolean** | Rule determining whether a user&#39;s first name should be permitted in their password | [default to Boolean]
**excludeLastName** | **Boolean** | Rule determining whether a user&#39;s last name should be permitted in their password | [default to Boolean]

```java
import com.finbourne.sdk.services.identity.model.PasswordPolicyResponseComplexity;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer minLength = new Integer("100.00");
Boolean excludeFirstName = true;
Boolean excludeLastName = true;


PasswordPolicyResponseComplexity passwordPolicyResponseComplexityInstance = new PasswordPolicyResponseComplexity()
    .minLength(minLength)
    .excludeFirstName(excludeFirstName)
    .excludeLastName(excludeLastName);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)