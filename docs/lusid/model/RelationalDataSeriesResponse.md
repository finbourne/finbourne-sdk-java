# com.finbourne.sdk.services.lusid.model.RelationalDataSeriesResponse
classname RelationalDataSeriesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**seriesScope** | **String** | The scope of the DataSeries. | [default to String]
**applicableEntity** | [**ApplicableEntity**](ApplicableEntity.md) |  | [default to ApplicableEntity]
**seriesIdentifiers** | [**Map&lt;String, RelationalDataPointFieldValueResponse&gt;**](RelationalDataPointFieldValueResponse.md) | The identifiers that uniquely define this DataSeries, if any, structured according to the FieldSchema of the parent RelationalDatasetDefinition. | [default to Map<String, RelationalDataPointFieldValueResponse>]

```java
import com.finbourne.sdk.services.lusid.model.RelationalDataSeriesResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String seriesScope = "example seriesScope";
ApplicableEntity applicableEntity = new ApplicableEntity();
Map<String, RelationalDataPointFieldValueResponse> seriesIdentifiers = new Map<String, RelationalDataPointFieldValueResponse>();


RelationalDataSeriesResponse relationalDataSeriesResponseInstance = new RelationalDataSeriesResponse()
    .seriesScope(seriesScope)
    .applicableEntity(applicableEntity)
    .seriesIdentifiers(seriesIdentifiers);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)