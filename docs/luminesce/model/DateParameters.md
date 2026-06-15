# com.finbourne.sdk.services.luminesce.model.DateParameters
classname DateParameters
Collection of date parameters used in dashboards

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateFrom** | [**OffsetDateTime**](OffsetDateTime.md) | Parameter to determine the lower bound in a date range | [optional] [default to OffsetDateTime]
**dateTo** | [**OffsetDateTime**](OffsetDateTime.md) | Parameter to determine the upper bound in a date range | [optional] [default to OffsetDateTime]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | EffectiveAt of the dashboard | [optional] [default to OffsetDateTime]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | EffectiveFrom of the dashboard | [optional] [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | AsAt of the dashboard | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.luminesce.model.DateParameters;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable OffsetDateTime dateFrom = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime dateTo = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime effectiveAt = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime effectiveFrom = OffsetDateTime.now();
OffsetDateTime asAt = OffsetDateTime.now();


DateParameters dateParametersInstance = new DateParameters()
    .dateFrom(dateFrom)
    .dateTo(dateTo)
    .effectiveAt(effectiveAt)
    .effectiveFrom(effectiveFrom)
    .asAt(asAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)