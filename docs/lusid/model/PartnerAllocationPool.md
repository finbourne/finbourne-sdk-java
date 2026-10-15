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
**allocations** | [**List&lt;PartnerAllocation&gt;**](PartnerAllocation.md) | Each partner&#39;s share of the pool. | [default to List<PartnerAllocation>]
**residual** | **java.math.BigDecimal** | The rounding residual, carried by the largest allocation. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.PartnerAllocationPool;
import java.util.*;
import java.lang.System;
import java.net.URI;

String character = "example character";
@javax.annotation.Nullable String originMemberShortCode = "example originMemberShortCode";
java.math.BigDecimal poolAmount = new java.math.BigDecimal("100.00");
String basis = "example basis";
List<PartnerAllocation> allocations = new List<PartnerAllocation>();
java.math.BigDecimal residual = new java.math.BigDecimal("100.00");


PartnerAllocationPool partnerAllocationPoolInstance = new PartnerAllocationPool()
    .character(character)
    .originMemberShortCode(originMemberShortCode)
    .poolAmount(poolAmount)
    .basis(basis)
    .allocations(allocations)
    .residual(residual);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)