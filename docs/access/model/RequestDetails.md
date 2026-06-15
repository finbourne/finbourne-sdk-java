# com.finbourne.sdk.services.access.model.RequestDetails
classname RequestDetails
The details of the requested evaluation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**RequestedActionKey**](RequestedActionKey.md) |  | [default to RequestedActionKey]
**fromEffectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date for the requested effective date range for the resource (if null, UtcNow) | [optional] [default to OffsetDateTime]
**toEffectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | The end date for the requested effective date range for the resource (if null, same as from date) | [optional] [default to OffsetDateTime]
**fromAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The requested AsAt date for the resource (if null, Latest). If specifying a range of AsAt dates, this is the lower bounds. | [optional] [default to OffsetDateTime]
**toAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | Upper bound if specifying a request that requires a range of AsAt dates. This is used if specifying the desire to grant access for a user between an AsAt range. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.access.model.RequestDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

RequestedActionKey action = new RequestedActionKey();
@javax.annotation.Nullable OffsetDateTime fromEffectiveDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime toEffectiveDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime fromAsAt = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime toAsAt = OffsetDateTime.now();


RequestDetails requestDetailsInstance = new RequestDetails()
    .action(action)
    .fromEffectiveDate(fromEffectiveDate)
    .toEffectiveDate(toEffectiveDate)
    .fromAsAt(fromAsAt)
    .toAsAt(toAsAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)