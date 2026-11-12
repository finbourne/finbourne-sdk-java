# com.finbourne.sdk.services.lusid.model.MarginRunRequest
classname MarginRunRequest
A request to value collateral agreements for a business date and publish their margin calls.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveAt** | **String** | The business date, datetime or cut label to value the agreements at. With an effectiveFrom, the last date of the span. | [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime to read agreements, portfolios and market data at. Defaults to the current LUSID system datetime if not specified. | [optional] [default to OffsetDateTime]
**agreementFilter** | **String** | An expression selecting the collateral agreements to run, in the same syntax as listing collateral agreements. Every agreement the caller may calculate margin for is run if not specified. | [optional] [default to String]
**scenarios** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The stored scenarios to value the agreements under, each as a what-if beside the base market, which the run always values. A scenario&#39;s calls are served beside the base calls only when asked for, and cannot be accepted, disputed or matched to a counterparty demand. At most 20. Only the base market is valued if not specified. | [optional] [default to List<ResourceId>]
**effectiveFrom** | **String** | The first business date, datetime or cut label of a span ending at effectiveAt. Each weekday from it to effectiveAt is valued as a run of its own, all at the same asAt, and a date after the asAt is a projection valued on the market as at the asAt that cannot be accepted, disputed or matched to a counterparty demand. At most 130 weekdays. Only effectiveAt is valued if not specified. | [optional] [default to String]
**captureDiagnostics** | **Boolean** | Whether to store the working behind the run&#39;s figures so that it can be explained. Specified, it is honoured. Not specified, the working is stored only for a run of a single date with no scenarios, since storing it costs time and space that a span or what-if run is not expected to repay. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.MarginRunRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String effectiveAt = "example effectiveAt";
@javax.annotation.Nullable OffsetDateTime asAt = OffsetDateTime.now();
@javax.annotation.Nullable String agreementFilter = "example agreementFilter";
@javax.annotation.Nullable List<ResourceId> scenarios = new List<ResourceId>();
@javax.annotation.Nullable String effectiveFrom = "example effectiveFrom";
@javax.annotation.Nullable Boolean captureDiagnostics = true;


MarginRunRequest marginRunRequestInstance = new MarginRunRequest()
    .effectiveAt(effectiveAt)
    .asAt(asAt)
    .agreementFilter(agreementFilter)
    .scenarios(scenarios)
    .effectiveFrom(effectiveFrom)
    .captureDiagnostics(captureDiagnostics);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)