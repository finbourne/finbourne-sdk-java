# com.finbourne.sdk.services.lusid.model.AccountHolderIdentifier
classname AccountHolderIdentifier

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | A client-defined key used to identify the Account Holder, unique within the Investment Account | [default to String]
**scope** | **String** | The scope in which the Investor Record lies. | [default to String]
**identifiers** | **Map&lt;String, String&gt;** | Single Account Holder identifier that should target the desired Investor Record. | [default to Map<String, String>]

```java
import com.finbourne.sdk.services.lusid.model.AccountHolderIdentifier;
import java.util.*;
import java.lang.System;
import java.net.URI;

String key = "example key";
String scope = "example scope";
Map<String, String> identifiers = new Map<String, String>();


AccountHolderIdentifier accountHolderIdentifierInstance = new AccountHolderIdentifier()
    .key(key)
    .scope(scope)
    .identifiers(identifiers);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)