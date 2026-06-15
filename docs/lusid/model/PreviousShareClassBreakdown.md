# com.finbourne.sdk.services.lusid.model.PreviousShareClassBreakdown
classname PreviousShareClassBreakdown
The data for a Share Class at the previous valuation point.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nav** | [**PreviousNAV**](PreviousNAV.md) |  | [default to PreviousNAV]
**unitisation** | [**UnitisationData**](UnitisationData.md) |  | [optional] [default to UnitisationData]
**shareClassToFundFxRate** | **java.math.BigDecimal** | The fx rate from the Share Class currency to the fund currency at this valuation point. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.PreviousShareClassBreakdown;
import java.util.*;
import java.lang.System;
import java.net.URI;

PreviousNAV nav = new PreviousNAV();
UnitisationData unitisation = new UnitisationData();
java.math.BigDecimal shareClassToFundFxRate = new java.math.BigDecimal("100.00");


PreviousShareClassBreakdown previousShareClassBreakdownInstance = new PreviousShareClassBreakdown()
    .nav(nav)
    .unitisation(unitisation)
    .shareClassToFundFxRate(shareClassToFundFxRate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)