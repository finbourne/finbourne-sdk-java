# com.finbourne.sdk.services.horizon.model.AlertRule
classname AlertRule
An alert rule on an integration instance. Finbourne.Horizon.Integrations.Web.Dto.AlertRule.Type selects the rule and decides which of the optional fields apply. A field that does not belong to the selected type is rejected.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The rule type (Allowed: MustStartBy, MaxDuration, FailedAfterRetries) | [default to String]
**severity** | **String** | The severity alerts from this rule are raised at (Allowed: Critical, High, Medium, Low, Informational). Critical pages on-call for a client-facing outage. High needs action today. Medium is a missed or late run. Low is an overrun or record-count check. Informational never pages. Defaults per type when omitted: MustStartBy and FailedAfterRetries Medium, MaxDuration Low. | [optional] [default to String]
**timeOfDay** | **String** | MustStartBy only. The local time of day, as HH:mm, by which a run must have started. | [optional] [default to String]
**timeZone** | **String** | MustStartBy only. The IANA or Windows time zone id that TimeOfDay is expressed in. | [optional] [default to String]
**daysOfWeek** | **List&lt;String&gt;** | MustStartBy only. The days the rule applies on, by name (e.g. Monday). Every day when omitted. | [optional] [default to List<String>]
**graceMinutes** | **Integer** | MustStartBy only. Minutes after TimeOfDay before a missing run counts as a breach. 0 when omitted. | [optional] [default to Integer]
**maxMinutes** | **Integer** | MaxDuration only. Alert once a run has been running for longer than this many minutes. Minimum 10. | [optional] [default to Integer]
**includePaused** | **Boolean** | MaxDuration only. Also measure paused runs. False when omitted. | [optional] [default to Boolean]
**alertOnFirstFailure** | **Boolean** | FailedAfterRetries only. Also alert on the first failure of a retry chain, not only when the retries are exhausted. False when omitted. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.horizon.model.AlertRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
@javax.annotation.Nullable String severity = "example severity";
@javax.annotation.Nullable String timeOfDay = "example timeOfDay";
@javax.annotation.Nullable String timeZone = "example timeZone";
@javax.annotation.Nullable List<String> daysOfWeek = new List<String>();
@javax.annotation.Nullable Integer graceMinutes = new Integer("100.00");
@javax.annotation.Nullable Integer maxMinutes = new Integer("100.00");
@javax.annotation.Nullable Boolean includePaused = true;
@javax.annotation.Nullable Boolean alertOnFirstFailure = true;


AlertRule alertRuleInstance = new AlertRule()
    .type(type)
    .severity(severity)
    .timeOfDay(timeOfDay)
    .timeZone(timeZone)
    .daysOfWeek(daysOfWeek)
    .graceMinutes(graceMinutes)
    .maxMinutes(maxMinutes)
    .includePaused(includePaused)
    .alertOnFirstFailure(alertOnFirstFailure);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)