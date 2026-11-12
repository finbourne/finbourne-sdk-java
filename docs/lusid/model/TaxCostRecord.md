# com.finbourne.sdk.services.lusid.model.TaxCostRecord
classname TaxCostRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**taxCostRecordCode** | **String** | The code of the Tax Cost Record, unique within the Fund. | [optional] [default to String]
**portfolioScope** | **String** | The scope of the portfolio the holding belongs to. | [default to String]
**portfolioCode** | **String** | The code of the portfolio the holding belongs to. | [default to String]
**instrumentIdentifier** | **String** | The LUSID instrument identifier (LUID) of the holding the tax cost applies to. | [default to String]
**navTypeCode** | **String** | The code of the NAV type the tax cost applies to. Optional; omit for the fund&#39;s primary NAV type. | [optional] [default to String]
**taxCost** | **java.math.BigDecimal** | The tax cost of the holding at the effective period end, in the fund&#39;s base currency. | [default to java.math.BigDecimal]
**carriedForwardAmount** | **java.math.BigDecimal** | The amount carried forward into the next tax period, in the fund&#39;s base currency. | [default to java.math.BigDecimal]
**effectivePeriodEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The end date of the tax period the record applies to. | [default to OffsetDateTime]
**sourceValuationPointId** | **String** | The identifier of the valuation point the record was derived from. Optional; omit for externally supplied records. | [optional] [default to String]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.TaxCostRecord;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable String taxCostRecordCode = "example taxCostRecordCode";
String portfolioScope = "example portfolioScope";
String portfolioCode = "example portfolioCode";
String instrumentIdentifier = "example instrumentIdentifier";
@javax.annotation.Nullable String navTypeCode = "example navTypeCode";
java.math.BigDecimal taxCost = new java.math.BigDecimal("100.00");
java.math.BigDecimal carriedForwardAmount = new java.math.BigDecimal("100.00");
OffsetDateTime effectivePeriodEnd = OffsetDateTime.now();
@javax.annotation.Nullable String sourceValuationPointId = "example sourceValuationPointId";
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


TaxCostRecord taxCostRecordInstance = new TaxCostRecord()
    .href(href)
    .taxCostRecordCode(taxCostRecordCode)
    .portfolioScope(portfolioScope)
    .portfolioCode(portfolioCode)
    .instrumentIdentifier(instrumentIdentifier)
    .navTypeCode(navTypeCode)
    .taxCost(taxCost)
    .carriedForwardAmount(carriedForwardAmount)
    .effectivePeriodEnd(effectivePeriodEnd)
    .sourceValuationPointId(sourceValuationPointId)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)