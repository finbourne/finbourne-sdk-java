# com.finbourne.sdk.services.lusid.model.CarryAccrualRequest
classname CarryAccrualRequest
The request to accrue carried interest on a partnership fund from amounts a waterfall has produced.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**periodEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The date carry is accrued to. | [default to OffsetDateTime]
**source** | **String** | The waterfall or model the carry amounts came from. | [default to String]
**amounts** | [**List&lt;CarryAccrualAmount&gt;**](CarryAccrualAmount.md) | The carry each partner has earned to the period end, as the source states it. | [default to List<CarryAccrualAmount>]
**book** | **Boolean** | When true, the accrual deltas are booked. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.CarryAccrualRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime periodEnd = OffsetDateTime.now();
String source = "example source";
List<CarryAccrualAmount> amounts = new List<CarryAccrualAmount>();
Boolean book = true;


CarryAccrualRequest carryAccrualRequestInstance = new CarryAccrualRequest()
    .periodEnd(periodEnd)
    .source(source)
    .amounts(amounts)
    .book(book);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)