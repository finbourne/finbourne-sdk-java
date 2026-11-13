# com.finbourne.sdk.services.lusid.model.CollateralInstrument
classname CollateralInstrument
Wrapper for one instrument in a larger collateral basket, as part of a repurchase agreement modelled as a FlexibleRepo.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**units** | **java.math.BigDecimal** | The amount of the instrument in the basket for this repurchase agreement. | [default to java.math.BigDecimal]
**instrument** | [**MasteredInstrument**](MasteredInstrument.md) |  | [default to MasteredInstrument]
**collateralStartDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date from which the instrument is held as collateral for this repurchase agreement.  Read only: an instrument upsert cannot set or change it. An existing value must be sent back unchanged.  When not set, the instrument is held from the StartDate of the FlexibleRepo. | [optional] [default to OffsetDateTime]
**collateralEndDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the instrument stops being held as collateral for this repurchase agreement.  Read only: an instrument upsert cannot set or change it. An existing value must be sent back unchanged.  When not set, the instrument is held until the MaturityDate of the FlexibleRepo. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.CollateralInstrument;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal units = new java.math.BigDecimal("100.00");
MasteredInstrument instrument = new MasteredInstrument();
@javax.annotation.Nullable OffsetDateTime collateralStartDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime collateralEndDate = OffsetDateTime.now();


CollateralInstrument collateralInstrumentInstance = new CollateralInstrument()
    .units(units)
    .instrument(instrument)
    .collateralStartDate(collateralStartDate)
    .collateralEndDate(collateralEndDate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)