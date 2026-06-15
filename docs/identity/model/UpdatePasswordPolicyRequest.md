# com.finbourne.sdk.services.identity.model.UpdatePasswordPolicyRequest
classname UpdatePasswordPolicyRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conditions** | [**UpdatePasswordPolicyRequestConditions**](UpdatePasswordPolicyRequestConditions.md) |  | [default to UpdatePasswordPolicyRequestConditions]

```java
import com.finbourne.sdk.services.identity.model.UpdatePasswordPolicyRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

UpdatePasswordPolicyRequestConditions conditions = new UpdatePasswordPolicyRequestConditions();


UpdatePasswordPolicyRequest updatePasswordPolicyRequestInstance = new UpdatePasswordPolicyRequest()
    .conditions(conditions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)