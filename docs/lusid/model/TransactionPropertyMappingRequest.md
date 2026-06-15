# com.finbourne.sdk.services.lusid.model.TransactionPropertyMappingRequest
classname TransactionPropertyMappingRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**propertyKey** | **String** | Uniquely identifies the property definition and consists of a Domain, Scope and Code. | [default to String]
**mapFrom** | **String** | The Property Key of the Property to map from. | [optional] [default to String]
**setTo** | **Object** | A pointer to the Property being mapped from. | [optional] [default to Object]

```java
import com.finbourne.sdk.services.lusid.model.TransactionPropertyMappingRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String propertyKey = "example propertyKey";
@javax.annotation.Nullable String mapFrom = "example mapFrom";
@javax.annotation.Nullable Object 

TransactionPropertyMappingRequest transactionPropertyMappingRequestInstance = new TransactionPropertyMappingRequest()
    .propertyKey(propertyKey)
    .mapFrom(mapFrom)
    .setTo(setTo);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)