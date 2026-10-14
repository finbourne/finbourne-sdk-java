# com.finbourne.sdk.services.lusid.model.AllocationEventEqualisationMark
classname AllocationEventEqualisationMark
A valuation move already allocated to the existing partners that the close re-trues to the admitted partners.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**originMemberShortCode** | **String** | The member of the structure the mark belongs to. | [default to String]
**amount** | **java.math.BigDecimal** | The valuation move already allocated, in the event currency. Negative for a fall in value or an expense. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEventEqualisationMark;
import java.util.*;
import java.lang.System;
import java.net.URI;

String originMemberShortCode = "example originMemberShortCode";
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");


AllocationEventEqualisationMark allocationEventEqualisationMarkInstance = new AllocationEventEqualisationMark()
    .originMemberShortCode(originMemberShortCode)
    .amount(amount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)