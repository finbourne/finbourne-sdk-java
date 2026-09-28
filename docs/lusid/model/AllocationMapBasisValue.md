# com.finbourne.sdk.services.lusid.model.AllocationMapBasisValue
classname AllocationMapBasisValue
The value one investor record is weighted by when an Allocation Map is resolved.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record the basis value belongs to. | [default to String]
**basisValue** | **java.math.BigDecimal** | The value the investor record is weighted by, for example its commitment. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.AllocationMapBasisValue;
import java.util.*;
import java.lang.System;
import java.net.URI;

String investorRecordId = "example investorRecordId";
java.math.BigDecimal basisValue = new java.math.BigDecimal("100.00");


AllocationMapBasisValue allocationMapBasisValueInstance = new AllocationMapBasisValue()
    .investorRecordId(investorRecordId)
    .basisValue(basisValue);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)