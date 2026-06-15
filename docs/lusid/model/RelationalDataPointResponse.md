# com.finbourne.sdk.services.lusid.model.RelationalDataPointResponse
classname RelationalDataPointResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**relationalDatasetDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**dataSeries** | [**RelationalDataSeriesResponse**](RelationalDataSeriesResponse.md) |  | [default to RelationalDataSeriesResponse]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effectiveAt or cut-label datetime of the DataPoint. | [default to OffsetDateTime]
**valueFields** | [**Map&lt;String, RelationalDataPointFieldValueResponse&gt;**](RelationalDataPointFieldValueResponse.md) | The values associated with the DataPoint, structured according to the FieldSchema of the parent RelationalDatasetDefinition. | [default to Map<String, RelationalDataPointFieldValueResponse>]
**metaDataFields** | [**Map&lt;String, RelationalDataPointFieldValueResponse&gt;**](RelationalDataPointFieldValueResponse.md) | The metadata associated with the DataPoint, structured according to the FieldSchema of the parent RelationalDatasetDefinition. | [default to Map<String, RelationalDataPointFieldValueResponse>]
**effectiveAtEntered** | **String** | The effectiveAt datetime as entered when the DataPoint was created. | [default to String]
**dataPointVersion** | [**DataPointVersion**](DataPointVersion.md) |  | [optional] [default to DataPointVersion]

```java
import com.finbourne.sdk.services.lusid.model.RelationalDataPointResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId relationalDatasetDefinitionId = new ResourceId();
RelationalDataSeriesResponse dataSeries = new RelationalDataSeriesResponse();
OffsetDateTime effectiveAt = OffsetDateTime.now();
Map<String, RelationalDataPointFieldValueResponse> valueFields = new Map<String, RelationalDataPointFieldValueResponse>();
Map<String, RelationalDataPointFieldValueResponse> metaDataFields = new Map<String, RelationalDataPointFieldValueResponse>();
String effectiveAtEntered = "example effectiveAtEntered";
DataPointVersion dataPointVersion = new DataPointVersion();


RelationalDataPointResponse relationalDataPointResponseInstance = new RelationalDataPointResponse()
    .relationalDatasetDefinitionId(relationalDatasetDefinitionId)
    .dataSeries(dataSeries)
    .effectiveAt(effectiveAt)
    .valueFields(valueFields)
    .metaDataFields(metaDataFields)
    .effectiveAtEntered(effectiveAtEntered)
    .dataPointVersion(dataPointVersion);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)