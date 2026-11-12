# com.finbourne.sdk.services.lusid.model.TaxCostRecordRequest
classname TaxCostRecordRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioScope** | **String** | The scope of the portfolio the holding belongs to. | [default to String]
**portfolioCode** | **String** | The code of the portfolio the holding belongs to. | [default to String]
**instrumentIdentifier** | **String** | The LUSID instrument identifier (LUID) of the holding the tax cost applies to. | [default to String]
**navTypeCode** | **String** | The code of the NAV type the tax cost applies to. Optional; omit for the fund&#39;s primary NAV type. | [optional] [default to String]
**taxCost** | **java.math.BigDecimal** | The tax cost of the holding at the effective period end, in the fund&#39;s base currency. | [default to java.math.BigDecimal]
**carriedForwardAmount** | **java.math.BigDecimal** | The amount carried forward into the next tax period, in the fund&#39;s base currency. | [default to java.math.BigDecimal]
**effectivePeriodEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The end date of the tax period the record applies to. | [default to OffsetDateTime]
**sourceValuationPointId** | **String** | The identifier of the valuation point the record was derived from. Optional; omit for externally supplied records. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TaxCostRecordRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String portfolioScope = "example portfolioScope";
String portfolioCode = "example portfolioCode";
String instrumentIdentifier = "example instrumentIdentifier";
@javax.annotation.Nullable String navTypeCode = "example navTypeCode";
java.math.BigDecimal taxCost = new java.math.BigDecimal("100.00");
java.math.BigDecimal carriedForwardAmount = new java.math.BigDecimal("100.00");
OffsetDateTime effectivePeriodEnd = OffsetDateTime.now();
@javax.annotation.Nullable String sourceValuationPointId = "example sourceValuationPointId";


TaxCostRecordRequest taxCostRecordRequestInstance = new TaxCostRecordRequest()
    .portfolioScope(portfolioScope)
    .portfolioCode(portfolioCode)
    .instrumentIdentifier(instrumentIdentifier)
    .navTypeCode(navTypeCode)
    .taxCost(taxCost)
    .carriedForwardAmount(carriedForwardAmount)
    .effectivePeriodEnd(effectivePeriodEnd)
    .sourceValuationPointId(sourceValuationPointId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)