# com.finbourne.sdk.services.lusid.model.AppendMarketData
classname AppendMarketData
Base class for types containing required data to append to complex market data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketDataType** | **String** | Available values: AppendFxForwardCurveByQuoteReference, AppendFxForwardCurveData, AppendFxForwardPipsCurveData, AppendFxForwardTenorCurveData, AppendFxForwardTenorPipsCurveData. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AppendMarketData;
import java.util.*;
import java.lang.System;
import java.net.URI;

String marketDataType = "example marketDataType";


AppendMarketData appendMarketDataInstance = new AppendMarketData()
    .marketDataType(marketDataType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)