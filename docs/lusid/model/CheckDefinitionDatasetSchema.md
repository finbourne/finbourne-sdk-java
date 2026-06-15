# com.finbourne.sdk.services.lusid.model.CheckDefinitionDatasetSchema
classname CheckDefinitionDatasetSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of dataset schema that the Check Definition applies to | [optional] [default to String]
**entityType** | **String** | The type of entity that the dataset schema applies to, e.g. Instrument, Transaction, etc. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CheckDefinitionDatasetSchema;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String entityType = "example entityType";


CheckDefinitionDatasetSchema checkDefinitionDatasetSchemaInstance = new CheckDefinitionDatasetSchema()
    .type(type)
    .entityType(entityType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)