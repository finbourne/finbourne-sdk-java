# com.finbourne.sdk.services.lusid.model.AppendFxForwardTenorCurveData
classname AppendFxForwardTenorCurveData
Used to append a new point to an FX curve defined using `FxForwardTenorCurveData`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketDataType** | **String** | Available values: AppendFxForwardCurveByQuoteReference, AppendFxForwardCurveData, AppendFxForwardPipsCurveData, AppendFxForwardTenorCurveData, AppendFxForwardTenorPipsCurveData. | [default to String]
**tenor** | **String** | Tenor for which the forward rate applies. | [default to String]
**rate** | **java.math.BigDecimal** | Rate provided for the fx forward (price in FgnCcy per unit of DomCcy). | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.AppendFxForwardTenorCurveData;
import java.util.*;
import java.lang.System;
import java.net.URI;

String tenor = "example tenor";
java.math.BigDecimal rate = new java.math.BigDecimal("100.00");


AppendFxForwardTenorCurveData appendFxForwardTenorCurveDataInstance = new AppendFxForwardTenorCurveData()
    .tenor(tenor)
    .rate(rate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)