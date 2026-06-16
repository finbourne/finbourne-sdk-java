# com.finbourne.sdk.services.lusid.model.ValuationPointInstrument
classname ValuationPointInstrument
An Instrument held at a Valuation Point, including its origin

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrument** | [**Instrument**](Instrument.md) |  | [optional] [default to Instrument]
**valuationPointOrigin** | **String** | Designates if the instrument was originally part of the Valuation Point or if it was added as part of a Complex Close action. Available values: None, Original, Added, OriginalAndAdded. | [optional] [default to String]
**addedOriginValuationPointCode** | **String** | The Valuation Point, only for an Instrument added as part of a Complex Close action. | [optional] [default to String]
**addedOriginValuationPointVariantCode** | **String** | The Valuation Point variant, only for Instruments added as part of a Complex Close action. | [optional] [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The requested instrument properties. These will be from the &#39;Instrument&#39; domain. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.sdk.services.lusid.model.ValuationPointInstrument;
import java.util.*;
import java.lang.System;
import java.net.URI;

Instrument instrument = new Instrument();
@javax.annotation.Nullable String valuationPointOrigin = "example valuationPointOrigin";
@javax.annotation.Nullable String addedOriginValuationPointCode = "example addedOriginValuationPointCode";
@javax.annotation.Nullable String addedOriginValuationPointVariantCode = "example addedOriginValuationPointVariantCode";
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();


ValuationPointInstrument valuationPointInstrumentInstance = new ValuationPointInstrument()
    .instrument(instrument)
    .valuationPointOrigin(valuationPointOrigin)
    .addedOriginValuationPointCode(addedOriginValuationPointCode)
    .addedOriginValuationPointVariantCode(addedOriginValuationPointVariantCode)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)