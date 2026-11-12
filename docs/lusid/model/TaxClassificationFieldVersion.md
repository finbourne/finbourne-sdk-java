# com.finbourne.sdk.services.lusid.model.TaxClassificationFieldVersion
classname TaxClassificationFieldVersion
One stored value of a classification input or override and the bitemporal window it held for.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | **String** | The name of the classification input or override the version belongs to. | [default to String]
**value** | **String** | The value of the field over the version&#39;s effective and asAt window. | [optional] [default to String]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The start of the effective window the value applies from. | [default to OffsetDateTime]
**effectiveUntil** | [**OffsetDateTime**](OffsetDateTime.md) | The end of the effective window the value applies until. | [default to OffsetDateTime]
**asAtFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt time the value was recorded. | [default to OffsetDateTime]
**asAtUntil** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt time the value was superseded, if it has been. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.TaxClassificationFieldVersion;
import java.util.*;
import java.lang.System;
import java.net.URI;

String field = "example field";
@javax.annotation.Nullable String value = "example value";
OffsetDateTime effectiveFrom = OffsetDateTime.now();
OffsetDateTime effectiveUntil = OffsetDateTime.now();
OffsetDateTime asAtFrom = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime asAtUntil = OffsetDateTime.now();


TaxClassificationFieldVersion taxClassificationFieldVersionInstance = new TaxClassificationFieldVersion()
    .field(field)
    .value(value)
    .effectiveFrom(effectiveFrom)
    .effectiveUntil(effectiveUntil)
    .asAtFrom(asAtFrom)
    .asAtUntil(asAtUntil);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)