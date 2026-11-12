# com.finbourne.sdk.services.lusid.model.ShareClassRoundingConvention
classname ShareClassRoundingConvention

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**precision** | **Integer** | The precision of the rounding: the number of decimal places, or of significant figures when PrecisionType is SignificantFigures. At most 28, and at least 1 for SignificantFigures. Defaults to 0. | [optional] [default to Integer]
**roundingType** | **String** | The type of rounding, applied at the last decimal place or significant figure. Defaults to None, which leaves the value unrounded. Available values: None, Down, Up, Nearest. | [optional] [default to String]
**precisionType** | **String** | What Precision counts: DecimalPlaces (the default) or SignificantFigures. A SignificantFigures convention is not copied onto an instrument created for the share class. Available values: DecimalPlaces, SignificantFigures. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ShareClassRoundingConvention;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer precision = new Integer("100.00");
@javax.annotation.Nullable String roundingType = "example roundingType";
@javax.annotation.Nullable String precisionType = "example precisionType";


ShareClassRoundingConvention shareClassRoundingConventionInstance = new ShareClassRoundingConvention()
    .precision(precision)
    .roundingType(roundingType)
    .precisionType(precisionType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)