# com.finbourne.sdk.services.lusid.model.PartnerPerformanceCashFlow
classname PartnerPerformanceCashFlow
One dated cash flow the net IRR was solved from, signed from the partner's point of view.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the cash flow. | [default to OffsetDateTime]
**amount** | **java.math.BigDecimal** | The amount of the cash flow, negative for contributions and positive for distributions and the residual value. | [default to java.math.BigDecimal]
**kind** | **String** | The kind of cash flow: Contribution, Distribution or ResidualValue. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PartnerPerformanceCashFlow;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime date = OffsetDateTime.now();
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
String kind = "example kind";


PartnerPerformanceCashFlow partnerPerformanceCashFlowInstance = new PartnerPerformanceCashFlow()
    .date(date)
    .amount(amount)
    .kind(kind);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)