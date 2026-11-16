# com.finbourne.sdk.services.lusid.model.PartnerAllocationPool
classname PartnerAllocationPool
One pool of an allocation run: an amount of a given character, split across the partners on a basis.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**character** | **String** | The character of the pool&#39;s amount, for example Income, RealisedGain or Expense. | [default to String]
**originMemberShortCode** | **String** | For a deal-linked pool, the short code of the member fund the amount originates from. | [optional] [default to String]
**poolAmount** | **java.math.BigDecimal** | The amount in the pool. | [default to java.math.BigDecimal]
**basis** | **String** | The basis the pool was shared on. Available values: CommittedCapital, PaidInCapital, DealPaidIn. | [default to String]
**basisSource** | **String** | Where the figures a deal pool was shared on came from; absent on a fund-level pool, which is shared on the register&#39;s balances. Available values: DealContributions (what each partner paid into the pool&#39;s deal, from the booked allocation events), Fallback (a deal pool no partner has paid into, shared on its character&#39;s fund-level basis instead). | [optional] [default to String]
**allocations** | [**List&lt;PartnerAllocation&gt;**](PartnerAllocation.md) | Each partner&#39;s share of the pool. | [default to List<PartnerAllocation>]
**residual** | **java.math.BigDecimal** | The rounding residual, carried by the largest allocation. | [default to java.math.BigDecimal]
**poolId** | **String** | The pool&#39;s identifier: the allocation rule&#39;s bucket id, or TAG: followed by the character for lines pooled by their distribution character tag. | [default to String]
**bucketSet** | **String** | The code of the allocation bucket set the pool was classified by, with its version, for example PA-ALLOCATION-v1. | [default to String]
**basisLevel** | **String** | Which level of the basis precedence decided the pool&#39;s basis. Available values: Rule (the bucket rule&#39;s own basis), CharacterDefault (the configuration&#39;s allocationBases entry for the character), BuiltIn (the built-in default for the character). | [default to String]
**exemption** | **String** | The register flag that sat partners out of the pool. Available values: None, FeeExempt, ExpenseExempt. | [default to String]
**excludedInvestorRecordIds** | **List&lt;String&gt;** | The partners the pool&#39;s rule left out of it. | [optional] [default to List<String>]
**reportRow** | **String** | The capital account row the pool&#39;s allocations land on, derived from the character. Available values: NetOperatingIncome, ManagementFeesGross, RealisedGainLoss, UnrealisedGainLoss. | [optional] [default to String]
**sources** | [**PartnerAllocationPoolSources**](PartnerAllocationPoolSources.md) |  | [default to PartnerAllocationPoolSources]

```java
import com.finbourne.sdk.services.lusid.model.PartnerAllocationPool;
import java.util.*;
import java.lang.System;
import java.net.URI;

String character = "example character";
@javax.annotation.Nullable String originMemberShortCode = "example originMemberShortCode";
java.math.BigDecimal poolAmount = new java.math.BigDecimal("100.00");
String basis = "example basis";
@javax.annotation.Nullable String basisSource = "example basisSource";
List<PartnerAllocation> allocations = new List<PartnerAllocation>();
java.math.BigDecimal residual = new java.math.BigDecimal("100.00");
String poolId = "example poolId";
String bucketSet = "example bucketSet";
String basisLevel = "example basisLevel";
String exemption = "example exemption";
@javax.annotation.Nullable List<String> excludedInvestorRecordIds = new List<String>();
@javax.annotation.Nullable String reportRow = "example reportRow";
PartnerAllocationPoolSources sources = new PartnerAllocationPoolSources();


PartnerAllocationPool partnerAllocationPoolInstance = new PartnerAllocationPool()
    .character(character)
    .originMemberShortCode(originMemberShortCode)
    .poolAmount(poolAmount)
    .basis(basis)
    .basisSource(basisSource)
    .allocations(allocations)
    .residual(residual)
    .poolId(poolId)
    .bucketSet(bucketSet)
    .basisLevel(basisLevel)
    .exemption(exemption)
    .excludedInvestorRecordIds(excludedInvestorRecordIds)
    .reportRow(reportRow)
    .sources(sources);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)