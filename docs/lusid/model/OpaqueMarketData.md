# com.finbourne.sdk.services.lusid.model.OpaqueMarketData
classname OpaqueMarketData
A representation of an un-built piece of complex market data, to allow for passing through  to the vendor library for building.  The market data will usually be in some standard form such as XML or Json, representing a curve or surface.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketDataType** | **String** | Available values: DiscountFactorCurveData, EquityVolSurfaceData, FxVolSurfaceData, IrVolCubeData, OpaqueMarketData, YieldCurveData, FxForwardCurveData, FxForwardPipsCurveData, FxForwardTenorCurveData, FxForwardTenorPipsCurveData, FxForwardCurveByQuoteReference, CreditSpreadCurveData, EquityCurveByPricesData, ConstantVolatilitySurface. | [default to String]
**document** | **String** | The document as a string. | [default to String]
**format** | **String** | What format is the document stored in, e.g. Xml.  Supported string (enumeration) values are: [Unknown, Xml, Json, Csv]. | [default to String]
**name** | **String** | Internal name of document. This is not used for search, it is simply a designator that helps identify the document  and could be anything (filename, ftp address or similar) | [default to String]
**lineage** | **String** | Description of the complex market data&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. | [optional] [default to String]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]

```java
import com.finbourne.sdk.services.lusid.model.OpaqueMarketData;
import java.util.*;
import java.lang.System;
import java.net.URI;

String document = "example document";
String format = "example format";
String name = "example name";
@javax.annotation.Nullable String lineage = "example lineage";
Version version = new Version();


OpaqueMarketData opaqueMarketDataInstance = new OpaqueMarketData()
    .document(document)
    .format(format)
    .name(name)
    .lineage(lineage)
    .version(version);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)