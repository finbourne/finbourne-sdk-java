# com.finbourne.sdk.services.luminesce.model.ExportAggregation
classname ExportAggregation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**colId** | **String** |  | [default to String]
**aggFunc** | [**ExportAggregationFunction**](ExportAggregationFunction.md) |  | [optional] [default to ExportAggregationFunction]
**placement** | [**ExportAggregationPlacement**](ExportAggregationPlacement.md) |  | [optional] [default to ExportAggregationPlacement]

```java
import com.finbourne.sdk.services.luminesce.model.ExportAggregation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String colId = "example colId";
ExportAggregationFunction ExportAggregationPlacement 

ExportAggregation exportAggregationInstance = new ExportAggregation()
    .colId(colId)
    .aggFunc(aggFunc)
    .placement(placement);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)