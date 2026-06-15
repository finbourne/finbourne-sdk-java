# com.finbourne.sdk.services.identity.model.PasswordPolicyResponse
classname PasswordPolicyResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conditions** | [**PasswordPolicyResponseConditions**](PasswordPolicyResponseConditions.md) |  | [default to PasswordPolicyResponseConditions]

```java
import com.finbourne.sdk.services.identity.model.PasswordPolicyResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

PasswordPolicyResponseConditions conditions = new PasswordPolicyResponseConditions();


PasswordPolicyResponse passwordPolicyResponseInstance = new PasswordPolicyResponse()
    .conditions(conditions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)