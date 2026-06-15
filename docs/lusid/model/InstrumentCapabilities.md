# com.finbourne.sdk.services.lusid.model.InstrumentCapabilities
classname InstrumentCapabilities
Instrument capabilities containing useful information about the instrument and the model. This includes  - features corresponding to the instrument i.e. Optionality:American, Other:InflationLinked  - supported addresses (if model provided) i.e. Valuation/Pv, Valuation/DirtyPriceKey, Valuation/Accrued  - economic dependencies (if model provided) i.e. Cash:USD, Fx:GBP.USD, Rates:GBP.GBPOIS

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentId** | **String** | The Lusid instrument id for the instrument e.g. &#39;LUID_00003D4X&#39;. | [optional] [default to String]
**model** | **String** | The pricing model e.g. &#39;Discounting&#39;. | [optional] [default to String]
**features** | **Map&lt;String, String&gt;** | Features of the instrument describing its optionality, payoff type and more e.g. &#39;Instrument/Features/Exercise: American&#39;, &#39;Instrument/Features/Product: Option&#39; | [optional] [default to Map<String, String>]
**supportedAddresses** | [**List&lt;DescribedAddressKey&gt;**](DescribedAddressKey.md) | Queryable addresses supported by the model, e.g. &#39;Valuation/Pv&#39;, &#39;Valuation/Accrued&#39;. | [optional] [default to List<DescribedAddressKey>]
**economicDependencies** | [**List&lt;EconomicDependency&gt;**](EconomicDependency.md) | Economic dependencies for the model, e.g. &#39;Fx:GBP.USD&#39;, &#39;Cash:GBP&#39;, &#39;Rates:GBP.GBPOIS&#39;. | [optional] [default to List<EconomicDependency>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.InstrumentCapabilities;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String instrumentId = "example instrumentId";
@javax.annotation.Nullable String model = "example model";
@javax.annotation.Nullable Map<String, String> features = new Map<String, String>();
@javax.annotation.Nullable List<DescribedAddressKey> supportedAddresses = new List<DescribedAddressKey>();
@javax.annotation.Nullable List<EconomicDependency> economicDependencies = new List<EconomicDependency>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


InstrumentCapabilities instrumentCapabilitiesInstance = new InstrumentCapabilities()
    .instrumentId(instrumentId)
    .model(model)
    .features(features)
    .supportedAddresses(supportedAddresses)
    .economicDependencies(economicDependencies)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)