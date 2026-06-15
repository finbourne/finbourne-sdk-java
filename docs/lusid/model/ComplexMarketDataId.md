# com.finbourne.sdk.services.lusid.model.ComplexMarketDataId
classname ComplexMarketDataId
An identifier that uniquely describes an item of complex market data such as an interest rate curve or volatility surface.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**provider** | **String** | The platform or vendor that provided the complex market data, e.g. &#39;DataScope&#39;, &#39;LUSID&#39;, etc. | [default to String]
**priceSource** | **String** | The source or originator of the complex market data, e.g. a bank or financial institution. | [optional] [default to String]
**lineage** | **String** | This is obsolete. It is not used, it will not be stored, and has no effects.  If you wish to attach a Lineage to your ComplexMarketData,  you should provide it in the optional Lineage field in the ComplexMarketData class. | [optional] [default to String]
**effectiveAt** | **String** | The effectiveAt or cut label that this item of complex market data is/was updated/inserted with. | [optional] [default to String]
**marketAsset** | **String** | The name of the market entity that the document represents | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ComplexMarketDataId;
import java.util.*;
import java.lang.System;
import java.net.URI;

String provider = "example provider";
@javax.annotation.Nullable String priceSource = "example priceSource";
@javax.annotation.Nullable String lineage = "example lineage";
@javax.annotation.Nullable String effectiveAt = "example effectiveAt";
String marketAsset = "example marketAsset";


ComplexMarketDataId complexMarketDataIdInstance = new ComplexMarketDataId()
    .provider(provider)
    .priceSource(priceSource)
    .lineage(lineage)
    .effectiveAt(effectiveAt)
    .marketAsset(marketAsset);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)