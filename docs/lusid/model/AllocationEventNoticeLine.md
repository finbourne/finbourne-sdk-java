# com.finbourne.sdk.services.lusid.model.AllocationEventNoticeLine
classname AllocationEventNoticeLine
One line of a notice: an amount allocated to the partner under an ILPA transaction type.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ilpaTransactionType** | **String** | The ILPA transaction type of the line. | [default to String]
**component** | **String** | The allocation event component the line is for. | [optional] [default to String]
**insideFund** | **Boolean** | Whether the line moves capital inside the fund, as opposed to a fee or expense outside it. | [default to Boolean]
**amount** | **java.math.BigDecimal** | The amount of the line. | [default to java.math.BigDecimal]
**unfundedImpact** | **java.math.BigDecimal** | The effect of the line on the partner&#39;s unfunded commitment. | [default to java.math.BigDecimal]
**recallableUntil** | [**OffsetDateTime**](OffsetDateTime.md) | The date until which a recallable distribution may be recalled, or null. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEventNoticeLine;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ilpaTransactionType = "example ilpaTransactionType";
@javax.annotation.Nullable String component = "example component";
Boolean insideFund = true;
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
java.math.BigDecimal unfundedImpact = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable OffsetDateTime recallableUntil = OffsetDateTime.now();


AllocationEventNoticeLine allocationEventNoticeLineInstance = new AllocationEventNoticeLine()
    .ilpaTransactionType(ilpaTransactionType)
    .component(component)
    .insideFund(insideFund)
    .amount(amount)
    .unfundedImpact(unfundedImpact)
    .recallableUntil(recallableUntil);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)