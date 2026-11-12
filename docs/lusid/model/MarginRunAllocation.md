# com.finbourne.sdk.services.lusid.model.MarginRunAllocation
classname MarginRunAllocation
How far the allocation pass over a run's base calls got: whether it ran, how many calls it proposed collateral  for, and what it left out.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | How far the allocation pass got. One of Pending, Completed, Skipped or Failed. | [default to String]
**allocatedCallCount** | **Integer** | How many calls the pass proposed collateral for. | [default to Integer]
**detail** | **String** | Which calls the pass could not allocate and why, or why it failed. Null when every call that moves our collateral was allocated. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.MarginRunAllocation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String status = "example status";
Integer allocatedCallCount = new Integer("100.00");
@javax.annotation.Nullable String detail = "example detail";


MarginRunAllocation marginRunAllocationInstance = new MarginRunAllocation()
    .status(status)
    .allocatedCallCount(allocatedCallCount)
    .detail(detail);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)