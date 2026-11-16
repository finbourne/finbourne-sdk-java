# com.finbourne.sdk.services.lusid.model.PartnerCapitalAccountRowDetail
classname PartnerCapitalAccountRowDetail
One labelled part of a capital account row's total: the kind of amount, the allocation event it arose on and its  quarter-, year- and inception-to-date amounts, each already included in the row's own column.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kind** | **String** | The kind of amount the entry labels: WithholdingTax for tax withheld from a distribution on the partner&#39;s behalf. | [default to String]
**allocationEventId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**eventDate** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date of the allocation event the amount arose on. | [default to OffsetDateTime]
**qtd** | **java.math.BigDecimal** | The part of the row&#39;s quarter-to-date amount the entry labels; zero when the event falls outside the quarter. | [default to java.math.BigDecimal]
**ytd** | **java.math.BigDecimal** | The part of the row&#39;s year-to-date amount the entry labels; zero when the event falls outside the year. | [default to java.math.BigDecimal]
**itd** | **java.math.BigDecimal** | The part of the row&#39;s inception-to-date amount the entry labels. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.PartnerCapitalAccountRowDetail;
import java.util.*;
import java.lang.System;
import java.net.URI;

String kind = "example kind";
ResourceId allocationEventId = new ResourceId();
OffsetDateTime eventDate = OffsetDateTime.now();
java.math.BigDecimal qtd = new java.math.BigDecimal("100.00");
java.math.BigDecimal ytd = new java.math.BigDecimal("100.00");
java.math.BigDecimal itd = new java.math.BigDecimal("100.00");


PartnerCapitalAccountRowDetail partnerCapitalAccountRowDetailInstance = new PartnerCapitalAccountRowDetail()
    .kind(kind)
    .allocationEventId(allocationEventId)
    .eventDate(eventDate)
    .qtd(qtd)
    .ytd(ytd)
    .itd(itd);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)