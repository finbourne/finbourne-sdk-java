# com.finbourne.sdk.services.lusid.model.MetadataFieldsToUpdate
classname MetadataFieldsToUpdate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metadataFields** | [**List&lt;MetadataFieldDefinition&gt;**](MetadataFieldDefinition.md) | The metadata field definitions for this configuration. | [optional] [default to List<MetadataFieldDefinition>]

```java
import com.finbourne.sdk.services.lusid.model.MetadataFieldsToUpdate;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<MetadataFieldDefinition> metadataFields = new List<MetadataFieldDefinition>();


MetadataFieldsToUpdate metadataFieldsToUpdateInstance = new MetadataFieldsToUpdate()
    .metadataFields(metadataFields);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)