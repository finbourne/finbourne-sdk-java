# com.finbourne.sdk.services.lusid.model.UpsertComplexMarketDataRequest
classname UpsertComplexMarketDataRequest
The details of the complex market data item to upsert into Lusid.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketDataId** | [**ComplexMarketDataId**](ComplexMarketDataId.md) |  | [default to ComplexMarketDataId]
**marketData** | [**ComplexMarketData**](ComplexMarketData.md) |  | [default to ComplexMarketData]

```java
import com.finbourne.sdk.services.lusid.model.UpsertComplexMarketDataRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ComplexMarketDataId marketDataId = new ComplexMarketDataId();
ComplexMarketData marketData = new ComplexMarketData();


UpsertComplexMarketDataRequest upsertComplexMarketDataRequestInstance = new UpsertComplexMarketDataRequest()
    .marketDataId(marketDataId)
    .marketData(marketData);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)