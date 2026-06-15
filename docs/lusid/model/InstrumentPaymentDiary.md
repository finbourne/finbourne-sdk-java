# com.finbourne.sdk.services.lusid.model.InstrumentPaymentDiary
classname InstrumentPaymentDiary
A payment diary containing all the cashflows on a single instrument.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentIdType** | **String** | The identifier type of the instrument. | [optional] [default to String]
**instrumentId** | **String** | The identifier for the instrument. | [optional] [default to String]
**instrumentScope** | **String** | The scope of the instrument. | [optional] [default to String]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**legs** | [**List&lt;InstrumentPaymentDiaryLeg&gt;**](InstrumentPaymentDiaryLeg.md) | Aggregated sets of Cashflows. | [optional] [default to List<InstrumentPaymentDiaryLeg>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.InstrumentPaymentDiary;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String instrumentIdType = "example instrumentIdType";
@javax.annotation.Nullable String instrumentId = "example instrumentId";
@javax.annotation.Nullable String instrumentScope = "example instrumentScope";
Version version = new Version();
@javax.annotation.Nullable List<InstrumentPaymentDiaryLeg> legs = new List<InstrumentPaymentDiaryLeg>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable List<Link> links = new List<Link>();


InstrumentPaymentDiary instrumentPaymentDiaryInstance = new InstrumentPaymentDiary()
    .instrumentIdType(instrumentIdType)
    .instrumentId(instrumentId)
    .instrumentScope(instrumentScope)
    .version(version)
    .legs(legs)
    .href(href)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)