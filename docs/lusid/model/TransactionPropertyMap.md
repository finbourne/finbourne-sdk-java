# com.finbourne.sdk.services.lusid.model.TransactionPropertyMap
classname TransactionPropertyMap

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**propertyKey** | **String** | The key that uniquely identifies the property. It has the format {domain}/{scope}/{code}. | [optional] [default to String]
**value** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TransactionPropertyMap;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String propertyKey = "example propertyKey";
@javax.annotation.Nullable String value = "example value";


TransactionPropertyMap transactionPropertyMapInstance = new TransactionPropertyMap()
    .propertyKey(propertyKey)
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)