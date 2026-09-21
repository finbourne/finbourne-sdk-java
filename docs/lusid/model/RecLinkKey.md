# com.finbourne.sdk.services.lusid.model.RecLinkKey
classname RecLinkKey
One item key that established a link between two rec results: the key name and the identifier value both  results' items carried for it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The key name: holdingId or transactionId. | [default to String]
**value** | **String** | The identifier value both results&#39; items carried under the key. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RecLinkKey;
import java.util.*;
import java.lang.System;
import java.net.URI;

String key = "example key";
String value = "example value";


RecLinkKey recLinkKeyInstance = new RecLinkKey()
    .key(key)
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)