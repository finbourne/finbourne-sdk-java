# com.finbourne.sdk.services.lusid.model.PartnerStatementRequest
classname PartnerStatementRequest
The request to produce a partner statement over a period.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**periodStart** | [**OffsetDateTime**](OffsetDateTime.md) | The start of the statement period, exclusive. | [default to OffsetDateTime]
**periodEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The end of the statement period, inclusive. | [default to OffsetDateTime]
**navTypeCode** | **String** | The NAV type to produce the statement under. Defaults to the fund&#39;s primary NAV type. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PartnerStatementRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime periodStart = OffsetDateTime.now();
OffsetDateTime periodEnd = OffsetDateTime.now();
@javax.annotation.Nullable String navTypeCode = "example navTypeCode";


PartnerStatementRequest partnerStatementRequestInstance = new PartnerStatementRequest()
    .periodStart(periodStart)
    .periodEnd(periodEnd)
    .navTypeCode(navTypeCode);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)