# com.finbourne.sdk.services.insights.model.IdentityMetricsDataSet
classname IdentityMetricsDataSet
Identity population and activity counts for the domain, pivoted from the latest tranche the identity metrics provider collected.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of this data set. Always &#x60;IdentityMetrics&#x60;, matching the corresponding Finbourne.Insights.WebApi.Dtos.Metrics.MetricDataSet value and Finbourne.Insights.WebApi.Dtos.Metrics.MetricsResponse property. | [default to String]
**collectedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp of the tranche these values were collected in, in UTC, or null if no tranche was returned. | [optional] [default to OffsetDateTime]
**personalUsers** | **Long** | The number of personal (human) users in the domain, or null if not reported. | [optional] [default to Long]
**serviceUsers** | **Long** | The number of service users in the domain, or null if not reported. | [optional] [default to Long]
**neverLoggedIn** | **Long** | The number of users that have never logged in, or null if not reported. | [optional] [default to Long]
**ignored** | **Long** | The number of users excluded from the other counts, or null if not reported. | [optional] [default to Long]
**accountLocked** | **Long** | The number of users whose account is locked, or null if not reported. | [optional] [default to Long]
**suspendedPwReset** | **Long** | The number of users suspended pending a password reset, or null if not reported. | [optional] [default to Long]
**createdLast24Hours** | **Long** | The number of users created in the last 24 hours, or null if not reported. | [optional] [default to Long]
**createdLast7Days** | **Long** | The number of users created in the last 7 days, or null if not reported. | [optional] [default to Long]
**createdLast30Days** | **Long** | The number of users created in the last 30 days, or null if not reported. | [optional] [default to Long]
**activeLast24Hours** | **Long** | The number of users active in the last 24 hours, or null if not reported. | [optional] [default to Long]
**activeLast7Days** | **Long** | The number of users active in the last 7 days, or null if not reported. | [optional] [default to Long]
**activeLast30Days** | **Long** | The number of users active in the last 30 days, or null if not reported. | [optional] [default to Long]

```java
import com.finbourne.sdk.services.insights.model.IdentityMetricsDataSet;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
@javax.annotation.Nullable OffsetDateTime collectedAt = OffsetDateTime.now();
@javax.annotation.Nullable Long personalUsers = new Long("100.00");
@javax.annotation.Nullable Long serviceUsers = new Long("100.00");
@javax.annotation.Nullable Long neverLoggedIn = new Long("100.00");
@javax.annotation.Nullable Long ignored = new Long("100.00");
@javax.annotation.Nullable Long accountLocked = new Long("100.00");
@javax.annotation.Nullable Long suspendedPwReset = new Long("100.00");
@javax.annotation.Nullable Long createdLast24Hours = new Long("100.00");
@javax.annotation.Nullable Long createdLast7Days = new Long("100.00");
@javax.annotation.Nullable Long createdLast30Days = new Long("100.00");
@javax.annotation.Nullable Long activeLast24Hours = new Long("100.00");
@javax.annotation.Nullable Long activeLast7Days = new Long("100.00");
@javax.annotation.Nullable Long activeLast30Days = new Long("100.00");


IdentityMetricsDataSet identityMetricsDataSetInstance = new IdentityMetricsDataSet()
    .name(name)
    .collectedAt(collectedAt)
    .personalUsers(personalUsers)
    .serviceUsers(serviceUsers)
    .neverLoggedIn(neverLoggedIn)
    .ignored(ignored)
    .accountLocked(accountLocked)
    .suspendedPwReset(suspendedPwReset)
    .createdLast24Hours(createdLast24Hours)
    .createdLast7Days(createdLast7Days)
    .createdLast30Days(createdLast30Days)
    .activeLast24Hours(activeLast24Hours)
    .activeLast7Days(activeLast7Days)
    .activeLast30Days(activeLast30Days);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)