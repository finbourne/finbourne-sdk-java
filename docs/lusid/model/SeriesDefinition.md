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


SeriesDefinition seriesDefinitionInstance = new SeriesDefinition()
    .seriesIdentifier(seriesIdentifier)
    .seriesType(seriesType)
    .launchDate(launchDate)
    .launchPriceType(launchPriceType)
    .domCcy(domCcy)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)