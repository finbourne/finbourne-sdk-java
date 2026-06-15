# com.finbourne.sdk.services.lusid.model.TransactionPriceAndType
classname TransactionPriceAndType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**price** | **String** |  | [optional] [default to String]
**type** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TransactionPriceAndType;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String price = "example price";
@javax.annotation.Nullable String type = "example type";


TransactionPriceAndType transactionPriceAndTypeInstance = new TransactionPriceAndType()
    .price(price)
    .type(type);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)