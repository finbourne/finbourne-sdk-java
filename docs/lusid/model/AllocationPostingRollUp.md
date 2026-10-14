# com.finbourne.sdk.services.lusid.model.AllocationPostingRollUp
classname AllocationPostingRollUp
One roll-up a booking writes on a vehicle's line on the register above it, summing the lines beneath.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The deterministic identifier of the posting: the booking reference, investor record, commitment line, component and side. | [optional] [default to String]
**line** | **String** | The roll-up line, rendered as the held vehicle and the register above it. | [optional] [default to String]
**portfolio** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**amount** | **java.math.BigDecimal** | The amount posted, in the event currency. | [optional] [default to java.math.BigDecimal]
**component** | **String** | The component of the event the posting carries. | [optional] [default to String]
**sumOf** | **List&lt;String&gt;** | The identifiers of the postings beneath that the roll-up sums. | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.AllocationPostingRollUp;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String id = "example id";
@javax.annotation.Nullable String line = "example line";
ResourceId portfolio = new ResourceId();
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String component = "example component";
@javax.annotation.Nullable List<String> sumOf = new List<String>();


AllocationPostingRollUp allocationPostingRollUpInstance = new AllocationPostingRollUp()
    .id(id)
    .line(line)
    .portfolio(portfolio)
    .amount(amount)
    .component(component)
    .sumOf(sumOf);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)