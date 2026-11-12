# com.finbourne.sdk.services.lusid.model.QualifyingInvestmentsHistory
classname QualifyingInvestmentsHistory
The daily qualifying-investments history of one collective investment scheme and the flips within it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**luid** | **String** | The LUSID instrument identifier of the collective investment scheme. | [default to String]
**thresholdPercent** | **java.math.BigDecimal** | The qualifying investments percentage the scheme must exceed to be a bond fund. | [default to java.math.BigDecimal]
**observations** | [**List&lt;QualifyingInvestmentsObservation&gt;**](QualifyingInvestmentsObservation.md) | The daily qualifying investments observations in the requested window, oldest first. | [default to List<QualifyingInvestmentsObservation>]
**crossings** | [**List&lt;QualifyingInvestmentsCrossing&gt;**](QualifyingInvestmentsCrossing.md) | Each pair of consecutive observations where the bond fund result flipped. | [default to List<QualifyingInvestmentsCrossing>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.QualifyingInvestmentsHistory;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
String luid = "example luid";
java.math.BigDecimal thresholdPercent = new java.math.BigDecimal("100.00");
List<QualifyingInvestmentsObservation> observations = new List<QualifyingInvestmentsObservation>();
List<QualifyingInvestmentsCrossing> crossings = new List<QualifyingInvestmentsCrossing>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


QualifyingInvestmentsHistory qualifyingInvestmentsHistoryInstance = new QualifyingInvestmentsHistory()
    .href(href)
    .luid(luid)
    .thresholdPercent(thresholdPercent)
    .observations(observations)
    .crossings(crossings)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)