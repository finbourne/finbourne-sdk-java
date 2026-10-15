# com.finbourne.sdk.services.lusid.model.AllocationEventNoticePartner
classname AllocationEventNoticePartner
The partner a notice is addressed to.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record identifier of the partner. | [default to String]
**displayName** | **String** | The display name of the partner. | [optional] [default to String]
**commitment** | **java.math.BigDecimal** | The partner&#39;s total commitment. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEventNoticePartner;
import java.util.*;
import java.lang.System;
import java.net.URI;

String investorRecordId = "example investorRecordId";
@javax.annotation.Nullable String displayName = "example displayName";
java.math.BigDecimal commitment = new java.math.BigDecimal("100.00");


AllocationEventNoticePartner allocationEventNoticePartnerInstance = new AllocationEventNoticePartner()
    .investorRecordId(investorRecordId)
    .displayName(displayName)
    .commitment(commitment);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)