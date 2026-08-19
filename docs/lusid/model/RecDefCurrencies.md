# com.finbourne.sdk.services.lusid.model.RecDefCurrencies
classname RecDefCurrencies

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | **String** | The currency used on the left side of the reconciliation. | [default to String]
**right** | **String** | The currency used on the right side of the reconciliation. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RecDefCurrencies;
import java.util.*;
import java.lang.System;
import java.net.URI;

String left = "example left";
String right = "example right";


RecDefCurrencies recDefCurrenciesInstance = new RecDefCurrencies()
    .left(left)
    .right(right);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)