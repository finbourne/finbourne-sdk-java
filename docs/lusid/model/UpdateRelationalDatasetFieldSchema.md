# com.finbourne.sdk.services.lusid.model.UpdateRelationalDatasetFieldSchema
classname UpdateRelationalDatasetFieldSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**add** | [**RelationalDatasetFieldsToAdd**](RelationalDatasetFieldsToAdd.md) |  | [optional] [default to RelationalDatasetFieldsToAdd]
**update** | [**RelationalDatasetFieldsToUpdate**](RelationalDatasetFieldsToUpdate.md) |  | [optional] [default to RelationalDatasetFieldsToUpdate]
**remove** | [**RelationalDatasetFieldsToRemove**](RelationalDatasetFieldsToRemove.md) |  | [optional] [default to RelationalDatasetFieldsToRemove]

```java
import com.finbourne.sdk.services.lusid.model.UpdateRelationalDatasetFieldSchema;
import java.util.*;
import java.lang.System;
import java.net.URI;

RelationalDatasetFieldsToAdd add = new RelationalDatasetFieldsToAdd();
RelationalDatasetFieldsToUpdate update = new RelationalDatasetFieldsToUpdate();
RelationalDatasetFieldsToRemove remove = new RelationalDatasetFieldsToRemove();


UpdateRelationalDatasetFieldSchema updateRelationalDatasetFieldSchemaInstance = new UpdateRelationalDatasetFieldSchema()
    .add(add)
    .update(update)
    .remove(remove);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)