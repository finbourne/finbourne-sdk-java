# com.finbourne.sdk.services.identity.model.TemporaryPassword
classname TemporaryPassword

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**password** | **String** | The user&#39;s temporary password | [default to String]

```java
import com.finbourne.sdk.services.identity.model.TemporaryPassword;
import java.util.*;
import java.lang.System;
import java.net.URI;

String password = "example password";


TemporaryPassword temporaryPasswordInstance = new TemporaryPassword()
    .password(password);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)