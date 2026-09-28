# com.finbourne.sdk.services.lusid.model.AllocationMapResolution
classname AllocationMapResolution
The result of resolving an Allocation Map for one event: how much each investor record receives, and why.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventType** | **String** | The kind of allocation event that was resolved. Available values: CapitalCall, Distribution, FeeExpense, ValuationMove. | [optional] [default to String]
**amount** | **java.math.BigDecimal** | The amount that was shared. | [optional] [default to java.math.BigDecimal]
**currency** | **String** | The currency of the amount. | [optional] [default to String]
**basisRule** | **String** | The basis the map applies to this event type. Available values: ValueWeighted, PropertyWeighted, FixedPercentage. | [optional] [default to String]
**basisPool** | **java.math.BigDecimal** | The sum of the basis values over the participants that share the remainder pro rata. | [optional] [default to java.math.BigDecimal]
**fixedTotal** | **java.math.BigDecimal** | The total taken off the top by FixedPercentage exceptions before the remainder is shared. | [optional] [default to java.math.BigDecimal]
**participantCount** | **Integer** | The number of investor records that receive a share, whether fixed or pro rata. | [optional] [default to Integer]
**excludedCount** | **Integer** | The number of investor records an exception removed from the allocation. | [optional] [default to Integer]
**allocations** | [**List&lt;AllocationMapAllocation&gt;**](AllocationMapAllocation.md) | The share of each investor record, including those excluded, which receive nothing. | [optional] [default to List<AllocationMapAllocation>]
**reconciles** | **Boolean** | Whether the allocated amounts sum exactly to the requested amount. Amounts are rounded to two decimal places with the largest-remainder method, so an amount with more decimal places does not reconcile. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.AllocationMapResolution;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String eventType = "example eventType";
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String currency = "example currency";
@javax.annotation.Nullable String basisRule = "example basisRule";
java.math.BigDecimal basisPool = new java.math.BigDecimal("100.00");
java.math.BigDecimal fixedTotal = new java.math.BigDecimal("100.00");
Integer participantCount = new Integer("100.00");
Integer excludedCount = new Integer("100.00");
@javax.annotation.Nullable List<AllocationMapAllocation> allocations = new List<AllocationMapAllocation>();
Boolean reconciles = true;


AllocationMapResolution allocationMapResolutionInstance = new AllocationMapResolution()
    .eventType(eventType)
    .amount(amount)
    .currency(currency)
    .basisRule(basisRule)
    .basisPool(basisPool)
    .fixedTotal(fixedTotal)
    .participantCount(participantCount)
    .excludedCount(excludedCount)
    .allocations(allocations)
    .reconciles(reconciles);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)