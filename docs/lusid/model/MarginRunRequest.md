# com.finbourne.sdk.services.lusid.model.MarginRunRequest
classname MarginRunRequest
A request to value collateral agreements for a business date and publish their margin calls.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveAt** | **String** | The business date, datetime or cut label to value the agreements at. | [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime to read agreements, portfolios and market data at. Defaults to the current LUSID system datetime if not specified. | [optional] [default to OffsetDateTime]
**agreementFilter** | **String** | An expression selecting the collateral agreements to run, in the same syntax as listing collateral agreements. Every agreement the caller may calculate margin for is run if not specified. | [optional] [default to String]
**scenario** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.sdk.services.lusid.model.MarginRunRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String effectiveAt = "example effectiveAt";
@javax.annotation.Nullable OffsetDateTime asAt = OffsetDateTime.now();
@javax.annotation.Nullable String agreementFilter = "example agreementFilter";
ResourceId scenario = new ResourceId();


MarginRunRequest marginRunRequestInstance = new MarginRunRequest()
    .effectiveAt(effectiveAt)
    .asAt(asAt)
    .agreementFilter(agreementFilter)
    .scenario(scenario);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)