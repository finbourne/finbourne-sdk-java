# com.finbourne.sdk.services.lusid.model.SeriesConfiguration
classname SeriesConfiguration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shareClassShortCode** | **String** |  | [default to String]
**seriesLaunchPrice** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**distributionSeriesSelection** | **String** | Available values: ProRataByNav, FIFO, SpecifiedSeries. | [optional] [default to String]
**dealLinkedSeries** | **Boolean** |  | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.SeriesConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

String shareClassShortCode = "example shareClassShortCode";
@javax.annotation.Nullable java.math.BigDecimal seriesLaunchPrice = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String distributionSeriesSelection = "example distributionSeriesSelection";
@javax.annotation.Nullable Boolean dealLinkedSeries = true;


SeriesConfiguration seriesConfigurationInstance = new SeriesConfiguration()
    .shareClassShortCode(shareClassShortCode)
    .seriesLaunchPrice(seriesLaunchPrice)
    .distributionSeriesSelection(distributionSeriesSelection)
    .dealLinkedSeries(dealLinkedSeries);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)