# com.finbourne.sdk.services.lusid.model.CompositeDispersion
classname CompositeDispersion
A list of Dispersion calculations for the given years.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date for which dipsersion calculation has been done. This should be 31 Dec for each given year. | [default to OffsetDateTime]
**dispersionCalculation** | **java.math.BigDecimal** | The result for the dispersion calculation on the given effectiveAt. | [optional] [default to java.math.BigDecimal]
**variance** | **java.math.BigDecimal** | The variance on the given effectiveAt. | [optional] [default to java.math.BigDecimal]
**firstQuartile** | **java.math.BigDecimal** | First Quartile (Q1) &#x3D;  (lower quartile) &#x3D; the middle of the bottom half of the returns. | [optional] [default to java.math.BigDecimal]
**thirdQuartile** | **java.math.BigDecimal** | Third Quartile (Q3) &#x3D;  (higher quartile) &#x3D; the middle of the top half of the returns. | [optional] [default to java.math.BigDecimal]
**range** | **java.math.BigDecimal** | Highest return - Lowest return. | [optional] [default to java.math.BigDecimal]
**constituentsInScope** | [**List&lt;ResourceId&gt;**](ResourceId.md) | List containing Composite members which are part of the dispersion calcualtion. | [optional] [default to List<ResourceId>]
**constituentsExcluded** | [**List&lt;ResourceId&gt;**](ResourceId.md) | List containing the Composite members which are not part of the dispersion calculation | [optional] [default to List<ResourceId>]

```java
import com.finbourne.sdk.services.lusid.model.CompositeDispersion;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime effectiveAt = OffsetDateTime.now();
@javax.annotation.Nullable java.math.BigDecimal dispersionCalculation = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal variance = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal firstQuartile = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal thirdQuartile = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal range = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable List<ResourceId> constituentsInScope = new List<ResourceId>();
@javax.annotation.Nullable List<ResourceId> constituentsExcluded = new List<ResourceId>();


CompositeDispersion compositeDispersionInstance = new CompositeDispersion()
    .effectiveAt(effectiveAt)
    .dispersionCalculation(dispersionCalculation)
    .variance(variance)
    .firstQuartile(firstQuartile)
    .thirdQuartile(thirdQuartile)
    .range(range)
    .constituentsInScope(constituentsInScope)
    .constituentsExcluded(constituentsExcluded);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)