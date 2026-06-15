# com.finbourne.sdk.services.identity.model.UpdatePasswordPolicyRequestAge
classname UpdatePasswordPolicyRequestAge

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxAgeDays** | **Integer** | The maximum age (in days) a password can be before expiring and needing to be changed. 0 indicates no limit | [default to Integer]
**historyCount** | **Integer** | The number of unique passwords that need to be used before a previous password is permitted again. 0 indicates none | [default to Integer]

```java
import com.finbourne.sdk.services.identity.model.UpdatePasswordPolicyRequestAge;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer maxAgeDays = new Integer("100.00");
Integer historyCount = new Integer("100.00");


UpdatePasswordPolicyRequestAge updatePasswordPolicyRequestAgeInstance = new UpdatePasswordPolicyRequestAge()
    .maxAgeDays(maxAgeDays)
    .historyCount(historyCount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)