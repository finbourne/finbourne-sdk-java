# com.finbourne.sdk.services.lusid.model.PreviousValuationPoint
classname PreviousValuationPoint

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**valuationPointCode** | **String** | The code of the Valuation Point. | [default to String]
**name** | **String** | Identifiable Name assigned to the Valuation Point. | [optional] [default to String]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective time of the Valuation Point. | [default to OffsetDateTime]
**queryAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The AsAt time of the Valuation Point. This is the AsAt time that will be used when requests are made using the entry. | [default to OffsetDateTime]
**holdingsAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The AsAt time used for building holdings in the Valuation Point. | [optional] [default to OffsetDateTime]
**valuationAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The AsAt time used for performing valuations in the Valuation Point. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.PreviousValuationPoint;
import java.util.*;
import java.lang.System;
import java.net.URI;

String valuationPointCode = "example valuationPointCode";
@javax.annotation.Nullable String name = "example name";
OffsetDateTime effectiveAt = OffsetDateTime.now();
OffsetDateTime queryAsAt = OffsetDateTime.now();
OffsetDateTime holdingsAsAt = OffsetDateTime.now();
OffsetDateTime valuationAsAt = OffsetDateTime.now();


PreviousValuationPoint previousValuationPointInstance = new PreviousValuationPoint()
    .valuationPointCode(valuationPointCode)
    .name(name)
    .effectiveAt(effectiveAt)
    .queryAsAt(queryAsAt)
    .holdingsAsAt(holdingsAsAt)
    .valuationAsAt(valuationAsAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)