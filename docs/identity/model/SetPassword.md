# com.finbourne.sdk.services.identity.model.SetPassword
classname SetPassword
Set password request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** | The value of the new password | [default to String]

```java
import com.finbourne.sdk.services.identity.model.SetPassword;
import java.util.*;
import java.lang.System;
import java.net.URI;

String value = "example value";


SetPassword setPasswordInstance = new SetPassword()
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)