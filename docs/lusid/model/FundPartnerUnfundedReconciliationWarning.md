# com.finbourne.sdk.services.lusid.model.FundPartnerUnfundedReconciliationWarning
classname FundPartnerUnfundedReconciliationWarning
A soft warning on an unfunded commitment statement: the statement is still produced, with a caveat.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The warning. PeriodStartsBeforeAdmission: the period opens before the partner was admitted, so the opening balances are zero and the admission commitment is counted as a commitment change. | [default to String]
**admittedOn** | [**OffsetDateTime**](OffsetDateTime.md) | For PeriodStartsBeforeAdmission, the date the partner was admitted to the fund. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.FundPartnerUnfundedReconciliationWarning;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
@javax.annotation.Nullable OffsetDateTime admittedOn = OffsetDateTime.now();


FundPartnerUnfundedReconciliationWarning fundPartnerUnfundedReconciliationWarningInstance = new FundPartnerUnfundedReconciliationWarning()
    .code(code)
    .admittedOn(admittedOn);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)