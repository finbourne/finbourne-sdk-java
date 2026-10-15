# com.finbourne.sdk.services.lusid.model.PartnerAllocationRunRequest
classname PartnerAllocationRunRequest
The request to allocate a period's income summary to the partners of a partnership fund.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**periodStart** | [**OffsetDateTime**](OffsetDateTime.md) | The start of the period to allocate, exclusive. | [default to OffsetDateTime]
**periodEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The end of the period to allocate, inclusive. A valuation point must end on this date. | [default to OffsetDateTime]
**navTypeCode** | **String** | The NAV type to allocate under. Defaults to the fund&#39;s primary NAV type. | [optional] [default to String]
**dryRun** | **Boolean** | When true, the allocation is computed and returned but nothing is booked. | [optional] [default to Boolean]
**correction** | **Boolean** | When true, a period that has already been allocated may be re-allocated. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.PartnerAllocationRunRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime periodStart = OffsetDateTime.now();
OffsetDateTime periodEnd = OffsetDateTime.now();
@javax.annotation.Nullable String navTypeCode = "example navTypeCode";
Boolean dryRun = true;
Boolean correction = true;


PartnerAllocationRunRequest partnerAllocationRunRequestInstance = new PartnerAllocationRunRequest()
    .periodStart(periodStart)
    .periodEnd(periodEnd)
    .navTypeCode(navTypeCode)
    .dryRun(dryRun)
    .correction(correction);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)