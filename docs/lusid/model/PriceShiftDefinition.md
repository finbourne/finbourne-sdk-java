# com.finbourne.sdk.services.lusid.model.PriceShiftDefinition
classname PriceShiftDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scenarioShiftType** | **String** | Available values: RateCurveShiftDefinition, FxShiftDefinition, PriceShiftDefinition, VolSurfaceShiftDefinition, MdkrGroupShiftDefinition. | [default to String]
**instrument** | **String** | A single instrument identifier this shift applies to. Exactly one of Instrument and Filter  must be supplied. | [optional] [default to String]
**filter** | **String** | A LUSID filter expression over the instrument entity - fields and properties - selecting which  instruments&#39; quotes the shift applies to, e.g.  \&quot;assetClass eq &#39;Bond&#39; and properties[Instrument/Issuer/Name] eq &#39;X&#39;\&quot;.  Exactly one of Instrument and Filter must be supplied. | [optional] [default to String]
**amount** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**shiftType** | **String** | Available values: Absolute, Relative, Percentage. | [default to String]
**quoteType** | **String** | Available values: Price, Spread, Rate, LogNormalVol, NormalVol, ParSpread, IsdaSpread, Upfront, Index, Ratio, Delta, PoolFactor, InflationAssumption, DirtyPrice, PrincipalWriteOff, InterestDeferred, InterestShortfall, ConstituentWeightFactor. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PriceShiftDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String instrument = "example instrument";
@javax.annotation.Nullable String filter = "example filter";
@javax.annotation.Nullable java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
String shiftType = "example shiftType";
@javax.annotation.Nullable String quoteType = "example quoteType";


PriceShiftDefinition priceShiftDefinitionInstance = new PriceShiftDefinition()
    .instrument(instrument)
    .filter(filter)
    .amount(amount)
    .shiftType(shiftType)
    .quoteType(quoteType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)