# com.finbourne.sdk.services.lusid.model.FeeStepDown
classname FeeStepDown

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**trigger** | **String** | Available values: EndOfInvestmentPeriod, Date, Closing. | [default to String]
**stepDownDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**closingId** | **String** |  | [optional] [default to String]
**rate** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**basis** | **String** | Available values: CommittedCapital, InvestedCapital, NetInvestedCapital, Nav. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.FeeStepDown;
import java.util.*;
import java.lang.System;
import java.net.URI;

String trigger = "example trigger";
@javax.annotation.Nullable OffsetDateTime stepDownDate = OffsetDateTime.now();
@javax.annotation.Nullable String closingId = "example closingId";
@javax.annotation.Nullable java.math.BigDecimal rate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String basis = "example basis";


FeeStepDown feeStepDownInstance = new FeeStepDown()
    .trigger(trigger)
    .stepDownDate(stepDownDate)
    .closingId(closingId)
    .rate(rate)
    .basis(basis);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)