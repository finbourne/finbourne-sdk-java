# com.finbourne.sdk.services.lusid.model.ModelSelection
classname ModelSelection
The combination of a library to use and a model in that library that defines which pricing code will evaluate instruments  having a particular type/class. This allows us to control the model type and library for a given instrument.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**library** | **String** | Available values: Lusid, RefinitivQps, RefinitivTracsWeb, VolMaster, IsdaCds, YieldBook, LusidCalc. | [default to String]
**model** | **String** | Available values: SimpleStatic, Discounting, VendorDefault, BlackScholes, ConstantTimeValueOfMoney, Bachelier, ForwardWithPoints, ForwardWithPointsUndiscounted, ForwardSpecifiedRate, ForwardSpecifiedRateUndiscounted, IndexNav, IndexPrice, InlinedIndex, ForwardFromCurve, ForwardFromCurveUndiscounted, BlackScholesDigital, BjerksundStensland1993, BondLookupPricer, FlexibleLoanPricer, CdsLookupPricer, LoanFacilityPricer, OverrideOnlyPricer, FlexibleRepoSimplePricer. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ModelSelection;
import java.util.*;
import java.lang.System;
import java.net.URI;

String library = "example library";
String model = "example model";


ModelSelection modelSelectionInstance = new ModelSelection()
    .library(library)
    .model(model);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)