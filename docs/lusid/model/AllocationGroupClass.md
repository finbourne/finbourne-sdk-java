# com.finbourne.sdk.services.lusid.model.AllocationGroupClass
classname AllocationGroupClass

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shareClassShortCode** | **String** | A short code that uniquely identifies the share class within the Fund and is attached to the transaction. | [default to String]
**apportionmentFactor** | **java.math.BigDecimal** | Only used for fixed percentage method or be zero, must equal 1 or 0 across all classes in the fund. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.AllocationGroupClass;
import java.util.*;
import java.lang.System;
import java.net.URI;

String shareClassShortCode = "example shareClassShortCode";
@javax.annotation.Nullable java.math.BigDecimal apportionmentFactor = new java.math.BigDecimal("100.00");


AllocationGroupClass allocationGroupClassInstance = new AllocationGroupClass()
    .shareClassShortCode(shareClassShortCode)
    .apportionmentFactor(apportionmentFactor);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)