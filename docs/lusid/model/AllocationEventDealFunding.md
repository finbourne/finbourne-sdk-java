# com.finbourne.sdk.services.lusid.model.AllocationEventDealFunding
classname AllocationEventDealFunding
The details of a DealFunding Allocation Event: the deal the vehicle funds, where the money came from and which  investor records are excused from it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dealId** | **String** | The deal the vehicle funds. A later capital call names it in an Investment row of its use of proceeds. | [default to String]
**facilityId** | **String** | The subscription facility the funding was drawn from. Absent means the deal was paid from cash. | [optional] [default to String]
**excludedInvestorRecordIds** | **List&lt;String&gt;** | The investor records excused from the deal. They pay nothing towards it when it is called and the others take up their share. | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEventDealFunding;
import java.util.*;
import java.lang.System;
import java.net.URI;

String dealId = "example dealId";
@javax.annotation.Nullable String facilityId = "example facilityId";
@javax.annotation.Nullable List<String> excludedInvestorRecordIds = new List<String>();


AllocationEventDealFunding allocationEventDealFundingInstance = new AllocationEventDealFunding()
    .dealId(dealId)
    .facilityId(facilityId)
    .excludedInvestorRecordIds(excludedInvestorRecordIds);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)