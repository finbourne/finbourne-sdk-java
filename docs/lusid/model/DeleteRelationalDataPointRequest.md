# com.finbourne.sdk.services.lusid.model.DeleteRelationalDataPointRequest
classname DeleteRelationalDataPointRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataSeries** | [**DataSeries**](DataSeries.md) |  | [default to DataSeries]
**effectiveAt** | **String** | The effectiveAt or cut-label datetime of the DataPoint. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.DeleteRelationalDataPointRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

DataSeries dataSeries = new DataSeries();
String effectiveAt = "example effectiveAt";


DeleteRelationalDataPointRequest deleteRelationalDataPointRequestInstance = new DeleteRelationalDataPointRequest()
    .dataSeries(dataSeries)
    .effectiveAt(effectiveAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)