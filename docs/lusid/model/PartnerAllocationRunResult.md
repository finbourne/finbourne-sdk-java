# com.finbourne.sdk.services.lusid.model.PartnerAllocationRunResult
classname PartnerAllocationRunResult
The outcome of a partner allocation run: the pools the period's income was split into and what, if anything,  could not be attributed to a pool.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**periodStart** | [**OffsetDateTime**](OffsetDateTime.md) | The start of the period to allocate, exclusive. | [default to OffsetDateTime]
**periodEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The end of the period to allocate, inclusive. A valuation point must end on this date. | [default to OffsetDateTime]
**navTypeCode** | **String** | The NAV type to allocate under. Defaults to the fund&#39;s primary NAV type. | [default to String]
**status** | **String** | The outcome of the run. Available values: Computed, Booked, DryRun. | [default to String]
**runId** | **String** | The identifier of the run, which prefixes every transaction it books. | [default to String]
**pools** | [**List&lt;PartnerAllocationPool&gt;**](PartnerAllocationPool.md) | The pools of fund-level amount that were allocated, in the allocation bucket set&#39;s bucket order with any tag pools after. | [default to List<PartnerAllocationPool>]
**unattributed** | [**List&lt;UnattributedAmount&gt;**](UnattributedAmount.md) | Always empty: every profit and loss line is now pooled or the run is refused. Kept for one release. | [default to List<UnattributedAmount>]
**bookedTransactionIds** | **List&lt;String&gt;** | The identifiers of the transactions the run booked, if any. | [default to List<String>]
**warnings** | **List&lt;String&gt;** | What the run noticed but did not refuse, for example an excluded investor record that is not on the register at the period end. | [optional] [default to List<String>]
**ignoredTags** | [**List&lt;IgnoredDistributionTag&gt;**](IgnoredDistributionTag.md) | The distribution character tags the run did not pool by, by account. | [optional] [default to List<IgnoredDistributionTag>]
**accruedFees** | [**List&lt;AccruedFeeLine&gt;**](AccruedFeeLine.md) | The management fees accrued per partner in the period, which the accrual allocates and the run therefore leaves out of the pools. | [optional] [default to List<AccruedFeeLine>]

```java
import com.finbourne.sdk.services.lusid.model.PartnerAllocationRunResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId fundId = new ResourceId();
OffsetDateTime periodStart = OffsetDateTime.now();
OffsetDateTime periodEnd = OffsetDateTime.now();
String navTypeCode = "example navTypeCode";
String status = "example status";
String runId = "example runId";
List<PartnerAllocationPool> pools = new List<PartnerAllocationPool>();
List<UnattributedAmount> unattributed = new List<UnattributedAmount>();
List<String> bookedTransactionIds = new List<String>();
@javax.annotation.Nullable List<String> warnings = new List<String>();
@javax.annotation.Nullable List<IgnoredDistributionTag> ignoredTags = new List<IgnoredDistributionTag>();
@javax.annotation.Nullable List<AccruedFeeLine> accruedFees = new List<AccruedFeeLine>();


PartnerAllocationRunResult partnerAllocationRunResultInstance = new PartnerAllocationRunResult()
    .fundId(fundId)
    .periodStart(periodStart)
    .periodEnd(periodEnd)
    .navTypeCode(navTypeCode)
    .status(status)
    .runId(runId)
    .pools(pools)
    .unattributed(unattributed)
    .bookedTransactionIds(bookedTransactionIds)
    .warnings(warnings)
    .ignoredTags(ignoredTags)
    .accruedFees(accruedFees);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)