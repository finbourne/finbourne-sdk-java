# com.finbourne.sdk.services.lusid.model.AppendFxForwardTenorPipsCurveData
classname AppendFxForwardTenorPipsCurveData
Used to append a new point to an FX curve defined using `FxForwardTenorPipsCurveData`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketDataType** | **String** | Available values: AppendFxForwardCurveByQuoteReference, AppendFxForwardCurveData, AppendFxForwardPipsCurveData, AppendFxForwardTenorCurveData, AppendFxForwardTenorPipsCurveData. | [default to String]
**tenor** | **String** | Tenor for which the forward rate applies. | [default to String]
**pipRate** | **java.math.BigDecimal** | Rate provided for the fx forward (price in FgnCcy per unit of DomCcy), expressed in pips. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.AppendFxForwardTenorPipsCurveData;
import java.util.*;
import java.lang.System;
import java.net.URI;

String tenor = "example tenor";
java.math.BigDecimal pipRate = new java.math.BigDecimal("100.00");


AppendFxForwardTenorPipsCurveData appendFxForwardTenorPipsCurveDataInstance = new AppendFxForwardTenorPipsCurveData()
    .tenor(tenor)
    .pipRate(pipRate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)