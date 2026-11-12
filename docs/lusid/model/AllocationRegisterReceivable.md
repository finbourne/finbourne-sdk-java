# com.finbourne.sdk.services.lusid.model.AllocationRegisterReceivable
classname AllocationRegisterReceivable
What one register is owed on a booked capital call, across every record called on its lines.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolio** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**called** | **java.math.BigDecimal** | What was called on the register&#39;s lines. | [optional] [default to java.math.BigDecimal]
**received** | **java.math.BigDecimal** | What has settled the register&#39;s lines so far. | [optional] [default to java.math.BigDecimal]
**outstanding** | **java.math.BigDecimal** | What the register is still owed. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.AllocationRegisterReceivable;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId portfolio = new ResourceId();
java.math.BigDecimal called = new java.math.BigDecimal("100.00");
java.math.BigDecimal received = new java.math.BigDecimal("100.00");
java.math.BigDecimal outstanding = new java.math.BigDecimal("100.00");


AllocationRegisterReceivable allocationRegisterReceivableInstance = new AllocationRegisterReceivable()
    .portfolio(portfolio)
    .called(called)
    .received(received)
    .outstanding(outstanding);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)