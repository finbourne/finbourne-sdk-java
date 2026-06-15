# com.finbourne.sdk.services.lusid.model.InstrumentResolutionDetail
classname InstrumentResolutionDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | Unique instrument identifiers | [default to Map<String, String>]
**lusidInstrumentId** | **String** | LUSID&#39;s internal unique instrument identifier, resolved from the instrument identifiers | [optional] [readonly] [default to String]
**instrumentScope** | **String** | The scope in which the instrument lies. | [optional] [readonly] [default to String]
**launchPrice** | **java.math.BigDecimal** | The launch price set when a shareclass is added to the fund. Defaults to 1. | [optional] [default to java.math.BigDecimal]
**launchDate** | [**OffsetDateTime**](OffsetDateTime.md) | The launch date set when a shareclass is added to the fund. Defaults to Fund Inception Date. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.InstrumentResolutionDetail;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> instrumentIdentifiers = new Map<String, String>();
@javax.annotation.Nullable String lusidInstrumentId = "example lusidInstrumentId";
@javax.annotation.Nullable String instrumentScope = "example instrumentScope";
@javax.annotation.Nullable java.math.BigDecimal launchPrice = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable OffsetDateTime launchDate = OffsetDateTime.now();


InstrumentResolutionDetail instrumentResolutionDetailInstance = new InstrumentResolutionDetail()
    .instrumentIdentifiers(instrumentIdentifiers)
    .lusidInstrumentId(lusidInstrumentId)
    .instrumentScope(instrumentScope)
    .launchPrice(launchPrice)
    .launchDate(launchDate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)