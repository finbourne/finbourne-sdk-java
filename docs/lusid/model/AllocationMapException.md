# com.finbourne.sdk.services.lusid.model.AllocationMapException
classname AllocationMapException
A departure from the default participation of an Allocation Map for one investor record.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record the exception applies to. | [default to String]
**treatment** | **String** | What the exception does. Excluded removes the investor record from every allocation; FixedPercentage gives it participationPercent of each event off the top, before the remainder is shared pro rata between the other participants. Available values: Excluded, FixedPercentage. | [default to String]
**participationPercent** | **java.math.BigDecimal** | For a FixedPercentage exception, the fixed share as a fraction in the range (0, 1]. Not allowed on an Excluded exception. The fixed shares of all exceptions may not sum to more than 1. | [optional] [default to java.math.BigDecimal]
**reason** | **String** | Why the exception exists, for example a side letter or regulatory restriction. Required. | [default to String]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime from which the exception is in force. Defaults to always if not specified. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.AllocationMapException;
import java.util.*;
import java.lang.System;
import java.net.URI;

String investorRecordId = "example investorRecordId";
String treatment = "example treatment";
@javax.annotation.Nullable java.math.BigDecimal participationPercent = new java.math.BigDecimal("100.00");
String reason = "example reason";
@javax.annotation.Nullable OffsetDateTime effectiveFrom = OffsetDateTime.now();


AllocationMapException allocationMapExceptionInstance = new AllocationMapException()
    .investorRecordId(investorRecordId)
    .treatment(treatment)
    .participationPercent(participationPercent)
    .reason(reason)
    .effectiveFrom(effectiveFrom);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)