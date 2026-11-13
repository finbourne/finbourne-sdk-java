# com.finbourne.sdk.services.lusid.model.TaxProvision
classname TaxProvision
The deferred tax provision struck for a fund at a valuation point: the realised and notionally realised  (deemed disposal) gains it is built from, the indexation and loss relief applied, the rate, the resulting  provision amount, its movement since the previous valuation point and, once approved, who approved it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**fund** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**navTypeCode** | **String** | The NAV type the provision was struck for. | [default to String]
**diaryEntryCode** | **String** | The diary entry code of the valuation point the provision was struck at. | [default to String]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date of the valuation point the provision was struck at. | [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which this version of the provision was recorded. | [default to OffsetDateTime]
**status** | **String** | Whether the provision is an Estimate or has been Approved. An approved provision has been posted to the fund as an accrual. | [default to String]
**realisedGains** | **java.math.BigDecimal** | The chargeable gains realised by disposals since the start of the tax period, after indexation allowance. | [default to java.math.BigDecimal]
**unrealisedGains** | **java.math.BigDecimal** | The chargeable gains that would arise on a notional deemed disposal of the fund&#39;s holdings at the valuation point. | [default to java.math.BigDecimal]
**indexationAllowance** | **java.math.BigDecimal** | The indexation allowance taken against the gains in this provision. | [default to java.math.BigDecimal]
**lossesBroughtForward** | **java.math.BigDecimal** | The allowable losses standing at the start of the tax period and available to offset gains. | [default to java.math.BigDecimal]
**lossesUsed** | **java.math.BigDecimal** | The losses brought forward that were used against the gains in this provision. | [default to java.math.BigDecimal]
**lossesCarriedForward** | **java.math.BigDecimal** | The allowable losses remaining after this provision, to be carried forward to the next tax period. Only realised losses are carried; a notional loss on the deemed disposal is not. | [default to java.math.BigDecimal]
**rateApplied** | **java.math.BigDecimal** | The tax rate applied to the net chargeable gains to arrive at the provision amount. | [default to java.math.BigDecimal]
**provisionAmount** | **java.math.BigDecimal** | The deferred tax provision amount at the valuation point. | [default to java.math.BigDecimal]
**movement** | [**TaxProvisionMovement**](TaxProvisionMovement.md) |  | [default to TaxProvisionMovement]
**approvedBy** | **String** | The user who approved the provision, if it has been approved. | [optional] [default to String]
**approvedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the provision was approved, if it has been approved. | [optional] [default to OffsetDateTime]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.TaxProvision;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
ResourceId fund = new ResourceId();
String navTypeCode = "example navTypeCode";
String diaryEntryCode = "example diaryEntryCode";
OffsetDateTime effectiveAt = OffsetDateTime.now();
OffsetDateTime asAt = OffsetDateTime.now();
String status = "example status";
java.math.BigDecimal realisedGains = new java.math.BigDecimal("100.00");
java.math.BigDecimal unrealisedGains = new java.math.BigDecimal("100.00");
java.math.BigDecimal indexationAllowance = new java.math.BigDecimal("100.00");
java.math.BigDecimal lossesBroughtForward = new java.math.BigDecimal("100.00");
java.math.BigDecimal lossesUsed = new java.math.BigDecimal("100.00");
java.math.BigDecimal lossesCarriedForward = new java.math.BigDecimal("100.00");
java.math.BigDecimal rateApplied = new java.math.BigDecimal("100.00");
java.math.BigDecimal provisionAmount = new java.math.BigDecimal("100.00");
TaxProvisionMovement movement = new TaxProvisionMovement();
@javax.annotation.Nullable String approvedBy = "example approvedBy";
@javax.annotation.Nullable OffsetDateTime approvedAt = OffsetDateTime.now();
@javax.annotation.Nullable List<Link> links = new List<Link>();


TaxProvision taxProvisionInstance = new TaxProvision()
    .href(href)
    .fund(fund)
    .navTypeCode(navTypeCode)
    .diaryEntryCode(diaryEntryCode)
    .effectiveAt(effectiveAt)
    .asAt(asAt)
    .status(status)
    .realisedGains(realisedGains)
    .unrealisedGains(unrealisedGains)
    .indexationAllowance(indexationAllowance)
    .lossesBroughtForward(lossesBroughtForward)
    .lossesUsed(lossesUsed)
    .lossesCarriedForward(lossesCarriedForward)
    .rateApplied(rateApplied)
    .provisionAmount(provisionAmount)
    .movement(movement)
    .approvedBy(approvedBy)
    .approvedAt(approvedAt)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)