# com.finbourne.sdk.services.lusid.model.QualifyingInvestmentsObservation
classname QualifyingInvestmentsObservation
The qualifying-investments test result for one scheme on one day.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date the test was evaluated for. | [default to OffsetDateTime]
**nonEquityPercent** | **java.math.BigDecimal** | The percentage of the scheme&#39;s assets that were qualifying (non-equity) investments on the date. | [default to java.math.BigDecimal]
**isBondFund** | **Boolean** | Whether more than the threshold percentage of the scheme&#39;s assets were qualifying investments on the date, making it a bond fund. | [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.QualifyingInvestmentsObservation;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime date = OffsetDateTime.now();
java.math.BigDecimal nonEquityPercent = new java.math.BigDecimal("100.00");
Boolean isBondFund = true;


QualifyingInvestmentsObservation qualifyingInvestmentsObservationInstance = new QualifyingInvestmentsObservation()
    .date(date)
    .nonEquityPercent(nonEquityPercent)
    .isBondFund(isBondFund);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)