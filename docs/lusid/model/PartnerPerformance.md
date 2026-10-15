# com.finbourne.sdk.services.lusid.model.PartnerPerformance
classname PartnerPerformance
The ILPA performance measures for one partner, or for the fund as a whole: paid-in to commitment, the  distribution, residual value and total value multiples, and the net IRR, together with the cash flows the IRR  was solved from. When the fund financed deals through a subscription facility, the measures are also given  with the facility-funded calls re-dated to when the deals were actually funded.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**investorRecordId** | **String** | The investor record identifier of the partner, or null when the figures are for the fund as a whole. | [optional] [default to String]
**currency** | **String** | The currency the cash flows and residual value are expressed in. | [default to String]
**commitment** | **java.math.BigDecimal** | The total commitment the paid-in-capital ratio is measured against. | [default to java.math.BigDecimal]
**paidIn** | **java.math.BigDecimal** | The contributions paid in to the fund. | [default to java.math.BigDecimal]
**distributed** | **java.math.BigDecimal** | The distributions paid out of the fund. | [default to java.math.BigDecimal]
**pic** | **java.math.BigDecimal** | Paid-in capital as a multiple of commitment, or null when there is no commitment. | [optional] [default to java.math.BigDecimal]
**dpi** | **java.math.BigDecimal** | Distributions as a multiple of paid-in capital, or null when nothing has been paid in. | [optional] [default to java.math.BigDecimal]
**rvpi** | **java.math.BigDecimal** | Residual value as a multiple of paid-in capital, or null when nothing has been paid in. | [optional] [default to java.math.BigDecimal]
**tvpi** | **java.math.BigDecimal** | Total value as a multiple of paid-in capital, being DPI plus RVPI. | [optional] [default to java.math.BigDecimal]
**netIrr** | **java.math.BigDecimal** | The annualised net internal rate of return solved from the dated cash flows, or null when no rate can be solved. | [optional] [default to java.math.BigDecimal]
**cashFlows** | [**List&lt;PartnerPerformanceCashFlow&gt;**](PartnerPerformanceCashFlow.md) | The dated cash flows the net IRR was solved from, including the terminal residual value. | [default to List<PartnerPerformanceCashFlow>]
**residualValue** | **java.math.BigDecimal** | The partner&#39;s residual value in the fund at the valuation date. | [default to java.math.BigDecimal]
**residualValueDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the residual value is taken as at. | [default to OffsetDateTime]
**withFacility** | [**PartnerPerformanceMeasures**](PartnerPerformanceMeasures.md) |  | [optional] [default to PartnerPerformanceMeasures]
**withoutFacility** | [**PartnerPerformanceMeasures**](PartnerPerformanceMeasures.md) |  | [optional] [default to PartnerPerformanceMeasures]

```java
import com.finbourne.sdk.services.lusid.model.PartnerPerformance;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId fundId = new ResourceId();
@javax.annotation.Nullable String investorRecordId = "example investorRecordId";
String currency = "example currency";
java.math.BigDecimal commitment = new java.math.BigDecimal("100.00");
java.math.BigDecimal paidIn = new java.math.BigDecimal("100.00");
java.math.BigDecimal distributed = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal pic = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal dpi = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal rvpi = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal tvpi = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal netIrr = new java.math.BigDecimal("100.00");
List<PartnerPerformanceCashFlow> cashFlows = new List<PartnerPerformanceCashFlow>();
java.math.BigDecimal residualValue = new java.math.BigDecimal("100.00");
OffsetDateTime residualValueDate = OffsetDateTime.now();
PartnerPerformanceMeasures withFacility = new PartnerPerformanceMeasures();
PartnerPerformanceMeasures withoutFacility = new PartnerPerformanceMeasures();


PartnerPerformance partnerPerformanceInstance = new PartnerPerformance()
    .fundId(fundId)
    .investorRecordId(investorRecordId)
    .currency(currency)
    .commitment(commitment)
    .paidIn(paidIn)
    .distributed(distributed)
    .pic(pic)
    .dpi(dpi)
    .rvpi(rvpi)
    .tvpi(tvpi)
    .netIrr(netIrr)
    .cashFlows(cashFlows)
    .residualValue(residualValue)
    .residualValueDate(residualValueDate)
    .withFacility(withFacility)
    .withoutFacility(withoutFacility);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)