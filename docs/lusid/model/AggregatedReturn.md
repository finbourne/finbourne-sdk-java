# com.finbourne.sdk.services.lusid.model.AggregatedReturn
classname AggregatedReturn
A list of Aggregated Returns.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effectiveAt for the return. | [default to OffsetDateTime]
**endOfPeriod** | [**OffsetDateTime**](OffsetDateTime.md) | The end of period date. For the monthly period this will be the Month End Date. | [default to OffsetDateTime]
**openingMarketValue** | **java.math.BigDecimal** | The opening market value. | [optional] [default to java.math.BigDecimal]
**closingMarketValue** | **java.math.BigDecimal** | The closing market value. | [optional] [default to java.math.BigDecimal]
**metricsValue** | **Map&lt;String, java.math.BigDecimal&gt;** | The value for the specified metric. | [default to Map<String, java.math.BigDecimal>]
**frequency** | **String** | Show the aggregated output returns on a Daily or Monthly period. | [optional] [default to String]
**compositeMembers** | **Integer** | The number of members in the Composite on the given day. | [optional] [default to Integer]
**compositeMembersWithoutReturn** | [**List&lt;ResourceId&gt;**](ResourceId.md) | List containing Composite members which post no return on the given day. | [optional] [default to List<ResourceId>]
**warnings** | **List&lt;String&gt;** | List of the warnings about the calculation of the aggregated return. | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.AggregatedReturn;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime effectiveAt = OffsetDateTime.now();
OffsetDateTime endOfPeriod = OffsetDateTime.now();
@javax.annotation.Nullable java.math.BigDecimal openingMarketValue = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal closingMarketValue = new java.math.BigDecimal("100.00");
Map<String, java.math.BigDecimal> metricsValue = new Map<String, java.math.BigDecimal>();
@javax.annotation.Nullable String frequency = "example frequency";
@javax.annotation.Nullable Integer compositeMembers = new Integer("100.00");
@javax.annotation.Nullable List<ResourceId> compositeMembersWithoutReturn = new List<ResourceId>();
@javax.annotation.Nullable List<String> warnings = new List<String>();


AggregatedReturn aggregatedReturnInstance = new AggregatedReturn()
    .effectiveAt(effectiveAt)
    .endOfPeriod(endOfPeriod)
    .openingMarketValue(openingMarketValue)
    .closingMarketValue(closingMarketValue)
    .metricsValue(metricsValue)
    .frequency(frequency)
    .compositeMembers(compositeMembers)
    .compositeMembersWithoutReturn(compositeMembersWithoutReturn)
    .warnings(warnings);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)