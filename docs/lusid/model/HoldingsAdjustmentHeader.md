# com.finbourne.sdk.services.lusid.model.HoldingsAdjustmentHeader
classname HoldingsAdjustmentHeader
A record of holdings adjustments made on the transaction portfolio.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime from which the adjustment is valid. There can only be one holdings adjustment for a transaction portfolio at a specific effective datetime, so this uniquely identifies the adjustment. | [default to OffsetDateTime]
**version** | [**Version**](Version.md) |  | [default to Version]
**unmatchedHoldingMethod** | **String** | Describes how the holdings were adjusted. If &#39;PositionToZero&#39; the entire transaction portfolio&#39;s holdings were set via a call to &#39;Set holdings&#39;. If &#39;KeepTheSame&#39; only the specified holdings were adjusted via a call to &#39;Adjust holdings&#39;. Available values: PositionToZero, KeepTheSame. | [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.HoldingsAdjustmentHeader;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime effectiveAt = OffsetDateTime.now();
Version version = new Version();
String unmatchedHoldingMethod = "example unmatchedHoldingMethod";
@javax.annotation.Nullable List<Link> links = new List<Link>();


HoldingsAdjustmentHeader holdingsAdjustmentHeaderInstance = new HoldingsAdjustmentHeader()
    .effectiveAt(effectiveAt)
    .version(version)
    .unmatchedHoldingMethod(unmatchedHoldingMethod)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)