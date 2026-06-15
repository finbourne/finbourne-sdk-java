# com.finbourne.sdk.services.lusid.model.TransactionPropertyMapping
classname TransactionPropertyMapping

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**propertyKey** | **String** | The key that uniquely identifies the property. It has the format {domain}/{scope}/{code} | [default to String]
**mapFrom** | **String** | The Property Key of the Property to map from | [optional] [default to String]
**setTo** | **Object** | A pointer to the Property being mapped from | [optional] [default to Object]

```java
import com.finbourne.sdk.services.lusid.model.TransactionPropertyMapping;
import java.util.*;
import java.lang.System;
import java.net.URI;

String propertyKey = "example propertyKey";
@javax.annotation.Nullable String mapFrom = "example mapFrom";
@javax.annotation.Nullable Object 

TransactionPropertyMapping transactionPropertyMappingInstance = new TransactionPropertyMapping()
    .propertyKey(propertyKey)
    .mapFrom(mapFrom)
    .setTo(setTo);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)