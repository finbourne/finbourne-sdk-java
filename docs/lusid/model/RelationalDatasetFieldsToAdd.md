# com.finbourne.sdk.services.lusid.model.RelationalDatasetFieldsToAdd
classname RelationalDatasetFieldsToAdd

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**seriesIdentifiers** | [**List&lt;CreateSeriesIdentifierField&gt;**](CreateSeriesIdentifierField.md) | The schema defining the structure and data types of the relational dataset. | [optional] [default to List<CreateSeriesIdentifierField>]
**valueAndMetadataFields** | [**List&lt;RelationalDatasetFieldDefinition&gt;**](RelationalDatasetFieldDefinition.md) | The schema defining the structure and data types of the relational dataset. | [optional] [default to List<RelationalDatasetFieldDefinition>]

```java
import com.finbourne.sdk.services.lusid.model.RelationalDatasetFieldsToAdd;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<CreateSeriesIdentifierField> seriesIdentifiers = new List<CreateSeriesIdentifierField>();
@javax.annotation.Nullable List<RelationalDatasetFieldDefinition> valueAndMetadataFields = new List<RelationalDatasetFieldDefinition>();


RelationalDatasetFieldsToAdd relationalDatasetFieldsToAddInstance = new RelationalDatasetFieldsToAdd()
    .seriesIdentifiers(seriesIdentifiers)
    .valueAndMetadataFields(valueAndMetadataFields);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)