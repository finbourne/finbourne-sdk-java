# com.finbourne.sdk.services.lusid.model.EstimateVariant
classname EstimateVariant

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**variant** | **String** | The Variant of the Calendar Entry. Together with the valuation point code marks the unique branch for the NavType. | [optional] [default to String]
**displayName** | **String** | The name of the Fund Calendar entry. | [default to String]
**description** | **String** | A description for the Fund Calendar entry. | [optional] [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime for the Calendar Entry. | [default to OffsetDateTime]
**holdingsAsAtOverride** | [**OffsetDateTime**](OffsetDateTime.md) | The optional AsAt Override to use for building holdings in the Valuation Point. Defaults to QueryAsAt. | [optional] [default to OffsetDateTime]
**valuationsAsAtOverride** | [**OffsetDateTime**](OffsetDateTime.md) | The optional AsAt Override to use for performing valuations in the Valuation Point. Defaults to QueryAsAt. | [optional] [default to OffsetDateTime]
**dateOfLastPcaScan** | [**OffsetDateTime**](OffsetDateTime.md) | The last date a PCA scan was conducted for a Valuation Point | [optional] [default to OffsetDateTime]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The properties for the Calendar Entry. These will be from the &#39;ClosedPeriod&#39; domain. | [optional] [default to Map<String, Property>]
**version** | [**Version**](Version.md) |  | [default to Version]

```java
import com.finbourne.sdk.services.lusid.model.EstimateVariant;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String variant = "example variant";
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
OffsetDateTime asAt = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime holdingsAsAtOverride = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime valuationsAsAtOverride = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime dateOfLastPcaScan = OffsetDateTime.now();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
Version version = new Version();


EstimateVariant estimateVariantInstance = new EstimateVariant()
    .variant(variant)
    .displayName(displayName)
    .description(description)
    .asAt(asAt)
    .holdingsAsAtOverride(holdingsAsAtOverride)
    .valuationsAsAtOverride(valuationsAsAtOverride)
    .dateOfLastPcaScan(dateOfLastPcaScan)
    .properties(properties)
    .version(version);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)