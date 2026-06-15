# com.finbourne.sdk.services.identity.model.LogOutcome
classname LogOutcome
Represents a LogOutcome resource in the Okta API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | **String** |  | [optional] [default to String]
**reason** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.identity.model.LogOutcome;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String result = "example result";
@javax.annotation.Nullable String reason = "example reason";


LogOutcome logOutcomeInstance = new LogOutcome()
    .result(result)
    .reason(reason);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)