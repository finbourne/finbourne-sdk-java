# com.finbourne.sdk.services.lusid.model.DataSeries
classname DataSeries

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**seriesScope** | **String** | The scope of the DataSeries. | [default to String]
**applicableEntity** | [**ApplicableEntity**](ApplicableEntity.md) |  | [default to ApplicableEntity]
**seriesIdentifiers** | **Map&lt;String, Object&gt;** | The identifiers that uniquely define this DataSeries, if any, structured according to the FieldSchema of the parent RelationalDatasetDefinition. | [optional] [default to Map<String, Object>]

```java
import com.finbourne.sdk.services.lusid.model.DataSeries;
import java.util.*;
import java.lang.System;
import java.net.URI;

String seriesScope = "example seriesScope";
ApplicableEntity applicableEntity = new ApplicableEntity();
@javax.annotation.Nullable Map<String, Object> seriesIdentifiers = new Map<String, Object>();


DataSeries dataSeriesInstance = new DataSeries()
    .seriesScope(seriesScope)
    .applicableEntity(applicableEntity)
    .seriesIdentifiers(seriesIdentifiers);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)