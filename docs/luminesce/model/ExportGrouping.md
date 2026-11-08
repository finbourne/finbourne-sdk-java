# com.finbourne.sdk.services.luminesce.model.ExportGrouping
classname ExportGrouping

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupKeys** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**dateParts** | **Map&lt;String, String&gt;** |  | [optional] [default to Map<String, String>]
**aggregations** | [**List&lt;ExportAggregation&gt;**](ExportAggregation.md) |  | [optional] [default to List<ExportAggregation>]

```java
import com.finbourne.sdk.services.luminesce.model.ExportGrouping;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<String> groupKeys = new List<String>();
@javax.annotation.Nullable Map<String, String> dateParts = new Map<String, String>();
@javax.annotation.Nullable List<ExportAggregation> aggregations = new List<ExportAggregation>();


ExportGrouping exportGroupingInstance = new ExportGrouping()
    .groupKeys(groupKeys)
    .dateParts(dateParts)
    .aggregations(aggregations);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)