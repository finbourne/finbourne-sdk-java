# com.finbourne.sdk.services.lusid.model.RecDatasetSchema
classname RecDatasetSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The kind of dataset this side draws on. One of: PortfolioContents, LusidEntity, RelationalData. At most one side may be RelationalData. Available values: PortfolioContents, LusidEntity, RelationalData. | [default to String]
**entityType** | **String** | The entity within the dataset. Required when type is PortfolioContents, in which case it is one of: Holding, Valuation, Transaction, OutputTransaction, SettlementActivity. Must be omitted when type is RelationalData. Available values: Holding, Valuation, Transaction, OutputTransaction, SettlementActivity. | [optional] [default to String]
**relationalDatasetDefinitionId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.sdk.services.lusid.model.RecDatasetSchema;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
@javax.annotation.Nullable String entityType = "example entityType";
ResourceId relationalDatasetDefinitionId = new ResourceId();


RecDatasetSchema recDatasetSchemaInstance = new RecDatasetSchema()
    .type(type)
    .entityType(entityType)
    .relationalDatasetDefinitionId(relationalDatasetDefinitionId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)