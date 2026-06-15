# com.finbourne.sdk.services.lusid.model.TransactionTypePropertyMapping
classname TransactionTypePropertyMapping

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**propertyKey** | **String** | The key that uniquely identifies the property. It has the format {domain}/{scope}/{code} | [default to String]
**mapFrom** | **String** | The Property Key of the Property to map from | [optional] [default to String]
**setTo** | **String** | A pointer to the Property being mapped from | [optional] [default to String]
**templateFrom** | **String** | The template that defines how the property value is constructed from transaction, instrument and portfolio details. | [optional] [default to String]
**nullify** | **Boolean** | Flag to unset the Property Key for the mapping | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.TransactionTypePropertyMapping;
import java.util.*;
import java.lang.System;
import java.net.URI;

String propertyKey = "example propertyKey";
@javax.annotation.Nullable String mapFrom = "example mapFrom";
@javax.annotation.Nullable String setTo = "example setTo";
@javax.annotation.Nullable String templateFrom = "example templateFrom";
@javax.annotation.Nullable Boolean nullify = true;


TransactionTypePropertyMapping transactionTypePropertyMappingInstance = new TransactionTypePropertyMapping()
    .propertyKey(propertyKey)
    .mapFrom(mapFrom)
    .setTo(setTo)
    .templateFrom(templateFrom)
    .nullify(nullify);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)