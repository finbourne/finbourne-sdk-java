# com.finbourne.sdk.services.lusid.model.UpsertRelationalDataPointRequest
classname UpsertRelationalDataPointRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataSeries** | [**DataSeries**](DataSeries.md) |  | [default to DataSeries]
**effectiveAt** | **String** | The effectiveAt or cut-label datetime of the DataPoint. | [default to String]
**valueFields** | **Map&lt;String, Object&gt;** | The values associated with the DataPoint, structured according to the FieldSchema of the parent RelationalDatasetDefinition. | [default to Map<String, Object>]
**metaDataFields** | **Map&lt;String, Object&gt;** | The metadata associated with the DataPoint, structured according to the FieldSchema of the parent RelationalDatasetDefinition. | [optional] [default to Map<String, Object>]

```java
import com.finbourne.sdk.services.lusid.model.UpsertRelationalDataPointRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

DataSeries dataSeries = new DataSeries();
String effectiveAt = "example effectiveAt";
Map<String, Object> valueFields = new Map<String, Object>();
@javax.annotation.Nullable Map<String, Object> metaDataFields = new Map<String, Object>();


UpsertRelationalDataPointRequest upsertRelationalDataPointRequestInstance = new UpsertRelationalDataPointRequest()
    .dataSeries(dataSeries)
    .effectiveAt(effectiveAt)
    .valueFields(valueFields)
    .metaDataFields(metaDataFields);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)