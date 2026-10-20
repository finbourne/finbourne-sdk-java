# com.finbourne.sdk.services.lusid.model.RecDefCurrencies
classname RecDefCurrencies

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | **String** | The currency used on the left side of the reconciliation. Required when the left side has portfolio sources; must be null when it draws on relational data. | [optional] [default to String]
**right** | **String** | The currency used on the right side of the reconciliation. Required when the right side has portfolio sources; must be null when it draws on relational data. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RecDefCurrencies;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String left = "example left";
@javax.annotation.Nullable String right = "example right";


RecDefCurrencies recDefCurrenciesInstance = new RecDefCurrencies()
    .left(left)
    .right(right);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)