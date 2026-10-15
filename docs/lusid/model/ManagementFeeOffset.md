# com.finbourne.sdk.services.lusid.model.ManagementFeeOffset
classname ManagementFeeOffset
A fee income the manager has earned elsewhere that offsets the management fee.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourceRef** | **String** | A reference to the fee income being offset. | [default to String]
**amount** | **java.math.BigDecimal** | The amount of fee income received. | [default to java.math.BigDecimal]
**offsetPercentage** | **java.math.BigDecimal** | The fraction of the fee income that offsets the management fee, between 0 and 1. | [default to java.math.BigDecimal]
**deal** | **String** | For a deal-linked offset, the deal the fee income relates to. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ManagementFeeOffset;
import java.util.*;
import java.lang.System;
import java.net.URI;

String sourceRef = "example sourceRef";
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
java.math.BigDecimal offsetPercentage = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String deal = "example deal";


ManagementFeeOffset managementFeeOffsetInstance = new ManagementFeeOffset()
    .sourceRef(sourceRef)
    .amount(amount)
    .offsetPercentage(offsetPercentage)
    .deal(deal);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)