# com.finbourne.sdk.services.lusid.model.Membership
classname Membership

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope of the unique identifier associated with the Custom Data Model. | [default to String]
**code** | **String** | The code of the unique identifier associated with the Custom Data Model. | [default to String]
**displayName** | **String** | The name of the Custom Data Model. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.Membership;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scope = "example scope";
String code = "example code";
String displayName = "example displayName";


Membership membershipInstance = new Membership()
    .scope(scope)
    .code(code)
    .displayName(displayName);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)