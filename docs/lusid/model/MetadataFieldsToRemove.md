# com.finbourne.sdk.services.lusid.model.MetadataFieldsToRemove
classname MetadataFieldsToRemove

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metadataFields** | **List&lt;String&gt;** | An array of FieldName(s) to be removed from the metadata field schema. | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.MetadataFieldsToRemove;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<String> metadataFields = new List<String>();


MetadataFieldsToRemove metadataFieldsToRemoveInstance = new MetadataFieldsToRemove()
    .metadataFields(metadataFields);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)