# com.finbourne.sdk.services.lusid.model.AllocationMapFixedFactor
classname AllocationMapFixedFactor
The weight of one investor record under a FixedPercentage basis.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record the factor belongs to. | [default to String]
**factor** | **java.math.BigDecimal** | The weight of the investor record. Weights are normalised over the participants that receive the remainder, so they need not sum to 1. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.AllocationMapFixedFactor;
import java.util.*;
import java.lang.System;
import java.net.URI;

String investorRecordId = "example investorRecordId";
java.math.BigDecimal factor = new java.math.BigDecimal("100.00");


AllocationMapFixedFactor allocationMapFixedFactorInstance = new AllocationMapFixedFactor()
    .investorRecordId(investorRecordId)
    .factor(factor);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)