# com.finbourne.sdk.services.lusid.model.AllocationRule
classname AllocationRule
The allocation character of one P&L or fees bucket of the allocation bucket set, and optionally how its pools  are shared, echoed as stored. The effective block, overridden fields and source are derived on the way out and  ignored on the way in, so a read written back pins nothing.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucketId** | **String** | The bucket of the allocation bucket set the rule applies to. | [default to String]
**character** | **String** | The allocation character of the bucket&#39;s lines, which decides the capital account row. Available values: Income, RealisedGain, UnrealisedGain, OtherIncome, ManagementFee, Expense. Fixed by the set, and so omitted, when the allocation bucket set is a system set. | [optional] [default to String]
**basis** | **String** | The register balance the bucket&#39;s pools are shared on. Available values: CommittedCapital, PaidInCapital. Omit to take the character&#39;s default from allocationBases or the built-in default; returned as stored, with what the fund uses under effective. A pool that names its origin member is shared on deal paid-in unless its rule names a basis, and a rule may not ask for deal paid-in. Available values: CommittedCapital, PaidInCapital. | [optional] [default to String]
**exemption** | **String** | Which register flag sits a partner out of the bucket&#39;s pools. Available values: None, FeeExempt, ExpenseExempt. Omit to take the character&#39;s default (FeeExempt for ManagementFee, ExpenseExempt for Expense, otherwise None); returned as stored, with what the fund uses under effective. Available values: None, FeeExempt, ExpenseExempt. | [optional] [default to String]
**excludedInvestorRecordIds** | **List&lt;String&gt;** | Investor records that sit out every pool of the bucket. Optional. | [optional] [default to List<String>]
**effective** | [**AllocationRuleEffective**](AllocationRuleEffective.md) |  | [optional] [default to AllocationRuleEffective]
**overriddenFields** | **List&lt;String&gt;** | On a system set&#39;s rule, the fields this configuration overrides; absent on a configuration&#39;s own rule. Read-only. | [optional] [default to List<String>]
**source** | **String** | Where the rule&#39;s character comes from: System for a released system set, Configuration for the configuration&#39;s own set. Read-only. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AllocationRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String bucketId = "example bucketId";
@javax.annotation.Nullable String character = "example character";
@javax.annotation.Nullable String basis = "example basis";
@javax.annotation.Nullable String exemption = "example exemption";
@javax.annotation.Nullable List<String> excludedInvestorRecordIds = new List<String>();
AllocationRuleEffective effective = new AllocationRuleEffective();
@javax.annotation.Nullable List<String> overriddenFields = new List<String>();
@javax.annotation.Nullable String source = "example source";


AllocationRule allocationRuleInstance = new AllocationRule()
    .bucketId(bucketId)
    .character(character)
    .basis(basis)
    .exemption(exemption)
    .excludedInvestorRecordIds(excludedInvestorRecordIds)
    .effective(effective)
    .overriddenFields(overriddenFields)
    .source(source);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)