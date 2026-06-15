# com.finbourne.sdk.services.lusid.model.AggregationContext
classname AggregationContext
Aggregation context node. Whilst the market and pricing nodes concern themselves with which models are used and where the market data comes from, the aggregation  context determines how data is aggregated together. This controls the behaviour of the grouping and sql-like engine at the back of the valuation. For instance,  it controls conversion of currencies and whether the sql-like engine behaves more like ANSI or MySql SQL.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**options** | [**AggregationOptions**](AggregationOptions.md) |  | [optional] [default to AggregationOptions]

```java
import com.finbourne.sdk.services.lusid.model.AggregationContext;
import java.util.*;
import java.lang.System;
import java.net.URI;

AggregationOptions options = new AggregationOptions();


AggregationContext aggregationContextInstance = new AggregationContext()
    .options(options);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)