# com.finbourne.sdk.services.lusid.model.CustomEntityField
classname CustomEntityField

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the field in the custom entity type definition. | [default to String]
**value** | **Object** | The value for the field. | [optional] [default to Object]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime from which the field&#39;s value is valid. For timeVariant fields, this defaults to the beginning of time. | [optional] [default to OffsetDateTime]
**effectiveUntil** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime until which the field&#39;s value is valid. If not supplied, the value will be valid indefinitely or until the next “effectiveFrom” date of the field. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.CustomEntityField;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
@javax.annotation.Nullable Object @javax.annotation.Nullable OffsetDateTime effectiveFrom = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime effectiveUntil = OffsetDateTime.now();


CustomEntityField customEntityFieldInstance = new CustomEntityField()
    .name(name)
    .value(value)
    .effectiveFrom(effectiveFrom)
    .effectiveUntil(effectiveUntil);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)