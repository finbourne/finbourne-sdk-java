# com.finbourne.sdk.services.lusid.model.QualifyingInvestmentsCrossing
classname QualifyingInvestmentsCrossing
A flip of the qualifying-investments result between two consecutive observed days.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the observation before the flip. | [default to OffsetDateTime]
**to** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the observation after the flip. | [default to OffsetDateTime]
**wasBondFundBefore** | **Boolean** | Whether the scheme was a bond fund on the From date. | [default to Boolean]
**isBondFundAfter** | **Boolean** | Whether the scheme was a bond fund on the To date. | [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.QualifyingInvestmentsCrossing;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime from = OffsetDateTime.now();
OffsetDateTime to = OffsetDateTime.now();
Boolean wasBondFundBefore = true;
Boolean isBondFundAfter = true;


QualifyingInvestmentsCrossing qualifyingInvestmentsCrossingInstance = new QualifyingInvestmentsCrossing()
    .from(from)
    .to(to)
    .wasBondFundBefore(wasBondFundBefore)
    .isBondFundAfter(isBondFundAfter);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)