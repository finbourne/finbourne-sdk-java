# com.finbourne.sdk.services.lusid.model.AppendComplexMarketDataRequest
classname AppendComplexMarketDataRequest
The details of the point to be appended to a complex market data item.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketDataId** | [**ComplexMarketDataId**](ComplexMarketDataId.md) |  | [default to ComplexMarketDataId]
**appendMarketData** | [**AppendMarketData**](AppendMarketData.md) |  | [default to AppendMarketData]

```java
import com.finbourne.sdk.services.lusid.model.AppendComplexMarketDataRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ComplexMarketDataId marketDataId = new ComplexMarketDataId();
AppendMarketData appendMarketData = new AppendMarketData();


AppendComplexMarketDataRequest appendComplexMarketDataRequestInstance = new AppendComplexMarketDataRequest()
    .marketDataId(marketDataId)
    .appendMarketData(appendMarketData);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)