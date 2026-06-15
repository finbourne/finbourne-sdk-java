# com.finbourne.sdk.services.lusid.model.RelationalDatasetFieldsToUpdate
classname RelationalDatasetFieldsToUpdate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**seriesIdentifiers** | [**List&lt;UpdateSeriesIdentifierField&gt;**](UpdateSeriesIdentifierField.md) | The schema defining the structure and data types of the relational dataset. | [optional] [default to List<UpdateSeriesIdentifierField>]
**valueAndMetadataFields** | [**List&lt;RelationalDatasetFieldDefinition&gt;**](RelationalDatasetFieldDefinition.md) | The schema defining the structure and data types of the relational dataset. | [optional] [default to List<RelationalDatasetFieldDefinition>]

```java
import com.finbourne.sdk.services.lusid.model.RelationalDatasetFieldsToUpdate;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<UpdateSeriesIdentifierField> seriesIdentifiers = new List<UpdateSeriesIdentifierField>();
@javax.annotation.Nullable List<RelationalDatasetFieldDefinition> valueAndMetadataFields = new List<RelationalDatasetFieldDefinition>();


RelationalDatasetFieldsToUpdate relationalDatasetFieldsToUpdateInstance = new RelationalDatasetFieldsToUpdate()
    .seriesIdentifiers(seriesIdentifiers)
    .valueAndMetadataFields(valueAndMetadataFields);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)