# com.finbourne.sdk.services.lusid.model.AppendFxForwardPipsCurveData
classname AppendFxForwardPipsCurveData
Used to append a new point to an FX curve defined using `FxForwardPipsCurveData`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketDataType** | **String** | Available values: AppendFxForwardCurveByQuoteReference, AppendFxForwardCurveData, AppendFxForwardPipsCurveData, AppendFxForwardTenorCurveData, AppendFxForwardTenorPipsCurveData. | [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | Date for which the forward rate applies. | [default to OffsetDateTime]
**pipRate** | **java.math.BigDecimal** | Rate provided for the fx forward (price in FgnCcy per unit of DomCcy), expressed in pips. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.AppendFxForwardPipsCurveData;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime date = OffsetDateTime.now();
java.math.BigDecimal pipRate = new java.math.BigDecimal("100.00");


AppendFxForwardPipsCurveData appendFxForwardPipsCurveDataInstance = new AppendFxForwardPipsCurveData()
    .date(date)
    .pipRate(pipRate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)