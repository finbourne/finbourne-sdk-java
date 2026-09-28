# com.finbourne.sdk.services.lusid.model.QueryableKeysForMetricsResponse
classname QueryableKeysForMetricsResponse
The queryable key definition of each requested metric. Every requested metric appears in exactly one of  the two maps.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metrics** | [**Map&lt;String, QueryableKey&gt;**](QueryableKey.md) | The definition of each metric that resolved, describing what a valuation returns for it and how to  present it. Keyed by the metric as it was requested, for example &#39;Valuation/PV&#39; or  &#39;ProfitAndLoss/Realised/Market(Window&#x3D;YTD)&#39;. Identical requested keys appear once; different  spellings of the same underlying key, such as a property&#39;s raw and wrapper forms, each appear. | [default to Map<String, QueryableKey>]
**failed** | **Map&lt;String, String&gt;** | Why each metric that did not resolve cannot be requested, keyed as for Metrics. Empty when every  metric resolved. | [default to Map<String, String>]

```java
import com.finbourne.sdk.services.lusid.model.QueryableKeysForMetricsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, QueryableKey> metrics = new Map<String, QueryableKey>();
Map<String, String> failed = new Map<String, String>();


QueryableKeysForMetricsResponse queryableKeysForMetricsResponseInstance = new QueryableKeysForMetricsResponse()
    .metrics(metrics)
    .failed(failed);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)