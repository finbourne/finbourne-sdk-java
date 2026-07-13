# com.finbourne.sdk.services.lusid.model.AccountedComplexMarketData
classname AccountedComplexMarketData
The Valuation Point complex market data response for a Fund, including the origin of the complex market data relative to the Valuation Point period.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**complexMarketData** | [**ComplexMarketData**](ComplexMarketData.md) |  | [optional] [default to ComplexMarketData]
**valuationPointOrigin** | **String** | Designates if the complex market data was originally part of the Valuation Point or if it was added as part of a Complex Close action. Available values: None, Original, Added, OriginalAndAdded. | [optional] [default to String]
**addedOriginValuationPointCode** | **String** | The Valuation Point code, only for complex market data added as part of a Complex Close action. | [optional] [default to String]
**addedOriginValuationPointVariantCode** | **String** | The Valuation Point variant code, only for complex market data added as part of a Complex Close action. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AccountedComplexMarketData;
import java.util.*;
import java.lang.System;
import java.net.URI;

ComplexMarketData complexMarketData = new ComplexMarketData();
@javax.annotation.Nullable String valuationPointOrigin = "example valuationPointOrigin";
@javax.annotation.Nullable String addedOriginValuationPointCode = "example addedOriginValuationPointCode";
@javax.annotation.Nullable String addedOriginValuationPointVariantCode = "example addedOriginValuationPointVariantCode";


AccountedComplexMarketData accountedComplexMarketDataInstance = new AccountedComplexMarketData()
    .complexMarketData(complexMarketData)
    .valuationPointOrigin(valuationPointOrigin)
    .addedOriginValuationPointCode(addedOriginValuationPointCode)
    .addedOriginValuationPointVariantCode(addedOriginValuationPointVariantCode);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)