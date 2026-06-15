# com.finbourne.sdk.services.lusid.model.RelationalDatasetFieldsToRemove
classname RelationalDatasetFieldsToRemove

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**valueAndMetadataFields** | **List&lt;String&gt;** | An array of FieldName(s) to be removed from the FieldSchema. Only Value or Metadata fields can be removed. | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.RelationalDatasetFieldsToRemove;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<String> valueAndMetadataFields = new List<String>();


RelationalDatasetFieldsToRemove relationalDatasetFieldsToRemoveInstance = new RelationalDatasetFieldsToRemove()
    .valueAndMetadataFields(valueAndMetadataFields);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)