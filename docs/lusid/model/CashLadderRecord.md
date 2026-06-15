# com.finbourne.sdk.services.lusid.model.CashLadderRecord
classname CashLadderRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**open** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**activities** | **Map&lt;String, java.math.BigDecimal&gt;** |  | [default to Map<String, java.math.BigDecimal>]
**close** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.CashLadderRecord;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime effectiveDate = OffsetDateTime.now();
java.math.BigDecimal open = new java.math.BigDecimal("100.00");
Map<String, java.math.BigDecimal> activities = new Map<String, java.math.BigDecimal>();
java.math.BigDecimal close = new java.math.BigDecimal("100.00");


CashLadderRecord cashLadderRecordInstance = new CashLadderRecord()
    .effectiveDate(effectiveDate)
    .open(open)
    .activities(activities)
    .close(close);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)