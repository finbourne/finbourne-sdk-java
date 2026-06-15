# com.finbourne.sdk.services.lusid.model.CreateClosedPeriodRequest
classname CreateClosedPeriodRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**closedPeriodId** | **String** | The unique Id of the Closed Period. The ClosedPeriodId, together with the Timeline Scope and Code, uniquely identifies a Closed Period | [default to String]
**effectiveEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The effective end of the Closed Period | [optional] [default to OffsetDateTime]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The Closed Periods properties. These will be from the &#39;ClosedPeriod&#39; domain. | [optional] [default to Map<String, Property>]
**asAtClosed** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt closed datetime for the Closed Period | [optional] [default to OffsetDateTime]
**displayName** | **String** | The name of the Closed Period. | [optional] [default to String]
**description** | **String** | A description for the Closed Period. | [optional] [default to String]
**holdingsAsAtClosedOverride** | [**OffsetDateTime**](OffsetDateTime.md) | The optional AsAtClosed Override to use for building holdings in the Closed Period.If not specified, the AsAtClosed on the Closed Period will be used. | [optional] [default to OffsetDateTime]
**valuationAsAtClosedOverride** | [**OffsetDateTime**](OffsetDateTime.md) | The optional AsAtClosed Override to use for performing valuations in the Closed Period.If not specified, the AsAtClosed on the Closed Period will be used. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.CreateClosedPeriodRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String closedPeriodId = "example closedPeriodId";
OffsetDateTime effectiveEnd = OffsetDateTime.now();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
@javax.annotation.Nullable OffsetDateTime asAtClosed = OffsetDateTime.now();
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable OffsetDateTime holdingsAsAtClosedOverride = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime valuationAsAtClosedOverride = OffsetDateTime.now();


CreateClosedPeriodRequest createClosedPeriodRequestInstance = new CreateClosedPeriodRequest()
    .closedPeriodId(closedPeriodId)
    .effectiveEnd(effectiveEnd)
    .properties(properties)
    .asAtClosed(asAtClosed)
    .displayName(displayName)
    .description(description)
    .holdingsAsAtClosedOverride(holdingsAsAtClosedOverride)
    .valuationAsAtClosedOverride(valuationAsAtClosedOverride);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)