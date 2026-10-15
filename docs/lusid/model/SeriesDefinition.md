# com.finbourne.sdk.services.lusid.model.SeriesDefinition
classname SeriesDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**seriesIdentifier** | **String** | The identifier that uniquely identifies this Series within the Share Class. | [default to String]
**seriesType** | **String** | The type of the Series. Available values: Lead, Standard. | [default to String]
**launchDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the Series was launched. | [default to OffsetDateTime]
**launchPriceType** | **String** | The type of launch price for the Series. Available values: Manual, Calculated. | [default to String]
**domCcy** | **String** | The denomination currency of the Series. | [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | An optional set of properties to associate with the Series. Only applied if createInstrument is set to true on the parent Fund. | [optional] [default to Map<String, Property>]
**launchPrice** | **java.math.BigDecimal** | The launch price of the Series. Required when LaunchPriceType is Manual; ignored when it is Calculated. | [optional] [default to java.math.BigDecimal]
**status** | **String** | The lifecycle status of the Series: Open, Closed or Rolled. Defaults to Open. Available values: Open, Closed, Rolled. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.SeriesDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String seriesIdentifier = "example seriesIdentifier";
String seriesType = "example seriesType";
OffsetDateTime launchDate = OffsetDateTime.now();
String launchPriceType = "example launchPriceType";
String domCcy = "example domCcy";
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
@javax.annotation.Nullable java.math.BigDecimal launchPrice = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String status = "example status";


SeriesDefinition seriesDefinitionInstance = new SeriesDefinition()
    .seriesIdentifier(seriesIdentifier)
    .seriesType(seriesType)
    .launchDate(launchDate)
    .launchPriceType(launchPriceType)
    .domCcy(domCcy)
    .properties(properties)
    .launchPrice(launchPrice)
    .status(status);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)