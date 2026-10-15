# com.finbourne.sdk.services.lusid.model.UpsertEligibleCollateralScheduleRequest
classname UpsertEligibleCollateralScheduleRequest
The request used to create or replace the definition of an Eligible Collateral Schedule from an effective date.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | A description of the Eligible Collateral Schedule. Optional. | [optional] [default to String]
**rows** | [**List&lt;EligibleCollateralRowRequest&gt;**](EligibleCollateralRowRequest.md) | The classes of collateral that may be posted, each with the valuation percentage it is accepted at. At least one and at most 200 rows. | [default to List<EligibleCollateralRowRequest>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties to decorate onto the Eligible Collateral Schedule. Filterable. | [optional] [default to Map<String, Property>]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime or cut label from which the change applies. Defaults to the current LUSID system datetime if not specified. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.UpsertEligibleCollateralScheduleRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String description = "example description";
List<EligibleCollateralRowRequest> rows = new List<EligibleCollateralRowRequest>();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
@javax.annotation.Nullable OffsetDateTime effectiveAt = OffsetDateTime.now();


UpsertEligibleCollateralScheduleRequest upsertEligibleCollateralScheduleRequestInstance = new UpsertEligibleCollateralScheduleRequest()
    .description(description)
    .rows(rows)
    .properties(properties)
    .effectiveAt(effectiveAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)