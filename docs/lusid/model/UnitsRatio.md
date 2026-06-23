# com.finbourne.sdk.services.lusid.model.UnitsRatio
classname UnitsRatio
The number of units you have after the event (output) for a given number of units you have prior to the event (input).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**input** | **java.math.BigDecimal** | Input amount.  Denominator of the Ratio | [default to java.math.BigDecimal]
**output** | **java.math.BigDecimal** | Output amount. Numerator of the Ratio | [default to java.math.BigDecimal]
**unitScaleType** | **String** | Determines how units are scaled when processing the event.  Supported values: [NEWO, ADEX]. Available values: NEWO, ADEX. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.UnitsRatio;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal input = new java.math.BigDecimal("100.00");
java.math.BigDecimal output = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String unitScaleType = "example unitScaleType";


UnitsRatio unitsRatioInstance = new UnitsRatio()
    .input(input)
    .output(output)
    .unitScaleType(unitScaleType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)