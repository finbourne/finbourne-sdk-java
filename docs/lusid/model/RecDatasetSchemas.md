# com.finbourne.sdk.services.lusid.model.RecDatasetSchemas
classname RecDatasetSchemas

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | [**RecDatasetSchema**](RecDatasetSchema.md) |  | [optional] [default to RecDatasetSchema]
**right** | [**RecDatasetSchema**](RecDatasetSchema.md) |  | [optional] [default to RecDatasetSchema]

```java
import com.finbourne.sdk.services.lusid.model.RecDatasetSchemas;
import java.util.*;
import java.lang.System;
import java.net.URI;

RecDatasetSchema left = new RecDatasetSchema();
RecDatasetSchema right = new RecDatasetSchema();


RecDatasetSchemas recDatasetSchemasInstance = new RecDatasetSchemas()
    .left(left)
    .right(right);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)