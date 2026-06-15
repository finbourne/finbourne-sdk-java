# com.finbourne.sdk.services.lusid.model.CreateDataMapRequest
classname CreateDataMapRequest
Request to create a new data map

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**DataMapKey**](DataMapKey.md) |  | [default to DataMapKey]
**data** | [**DataMapping**](DataMapping.md) |  | [optional] [default to DataMapping]

```java
import com.finbourne.sdk.services.lusid.model.CreateDataMapRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

DataMapKey id = new DataMapKey();
DataMapping data = new DataMapping();


CreateDataMapRequest createDataMapRequestInstance = new CreateDataMapRequest()
    .id(id)
    .data(data);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)