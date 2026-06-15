# com.finbourne.sdk.services.lusid.model.ListComplexMarketDataWithMetaDataResponse
classname ListComplexMarketDataWithMetaDataResponse
Wraps a ComplexMarketData object with information that was retrieved from storage with it.  In particular,  the scope that the data was stored in,  and an object identifying the market data in that scope.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope that the listed ComplexMarketData entity is stored in. | [optional] [default to String]
**marketDataId** | [**ComplexMarketDataId**](ComplexMarketDataId.md) |  | [optional] [default to ComplexMarketDataId]
**marketData** | [**ComplexMarketData**](ComplexMarketData.md) |  | [optional] [default to ComplexMarketData]

```java
import com.finbourne.sdk.services.lusid.model.ListComplexMarketDataWithMetaDataResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String scope = "example scope";
ComplexMarketDataId marketDataId = new ComplexMarketDataId();
ComplexMarketData marketData = new ComplexMarketData();


ListComplexMarketDataWithMetaDataResponse listComplexMarketDataWithMetaDataResponseInstance = new ListComplexMarketDataWithMetaDataResponse()
    .scope(scope)
    .marketDataId(marketDataId)
    .marketData(marketData);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)