# com.finbourne.sdk.services.lusid.model.ManagementFeeRequest
classname ManagementFeeRequest
The request to calculate a period's management fee for the partners of a partnership fund.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**periodStart** | [**OffsetDateTime**](OffsetDateTime.md) | The start of the fee period, exclusive. | [default to OffsetDateTime]
**periodEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The end of the fee period, inclusive. | [default to OffsetDateTime]
**basis** | **String** | The capital base the fee is charged on. Available values: Auto, CommittedCapital, InvestedCapital. Auto charges on committed capital until the investment period ends and on invested capital after. | [optional] [default to String]
**offsets** | [**List&lt;ManagementFeeOffset&gt;**](ManagementFeeOffset.md) | Fee income received by the manager that offsets the management fee. | [optional] [default to List<ManagementFeeOffset>]
**book** | **Boolean** | When true, the net fee per partner is booked. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.ManagementFeeRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime periodStart = OffsetDateTime.now();
OffsetDateTime periodEnd = OffsetDateTime.now();
@javax.annotation.Nullable String basis = "example basis";
@javax.annotation.Nullable List<ManagementFeeOffset> offsets = new List<ManagementFeeOffset>();
Boolean book = true;


ManagementFeeRequest managementFeeRequestInstance = new ManagementFeeRequest()
    .periodStart(periodStart)
    .periodEnd(periodEnd)
    .basis(basis)
    .offsets(offsets)
    .book(book);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)