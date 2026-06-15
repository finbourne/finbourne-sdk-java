# com.finbourne.sdk.services.lusid.model.CollateralInstrument
classname CollateralInstrument
Wrapper for one instrument in a larger collateral basket, as part of a repurchase agreement modelled as a FlexibleRepo.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**units** | **java.math.BigDecimal** | The amount of the instrument in the basket for this repurchase agreement. | [default to java.math.BigDecimal]
**instrument** | [**MasteredInstrument**](MasteredInstrument.md) |  | [default to MasteredInstrument]

```java
import com.finbourne.sdk.services.lusid.model.CollateralInstrument;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal units = new java.math.BigDecimal("100.00");
MasteredInstrument instrument = new MasteredInstrument();


CollateralInstrument collateralInstrumentInstance = new CollateralInstrument()
    .units(units)
    .instrument(instrument);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)