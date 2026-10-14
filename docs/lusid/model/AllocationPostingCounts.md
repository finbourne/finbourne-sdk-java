# com.finbourne.sdk.services.lusid.model.AllocationPostingCounts
classname AllocationPostingCounts
How many postings a plan writes on each side.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lpSide** | **Integer** | The number of instrument events on investors&#39; lines. | [optional] [default to Integer]
**rollUps** | **Integer** | The number of roll-ups. | [optional] [default to Integer]
**fundSide** | **Integer** | The number of fund-side transactions. | [optional] [default to Integer]

```java
import com.finbourne.sdk.services.lusid.model.AllocationPostingCounts;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer lpSide = new Integer("100.00");
Integer rollUps = new Integer("100.00");
Integer fundSide = new Integer("100.00");


AllocationPostingCounts allocationPostingCountsInstance = new AllocationPostingCounts()
    .lpSide(lpSide)
    .rollUps(rollUps)
    .fundSide(fundSide);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)