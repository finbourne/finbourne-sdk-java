# com.finbourne.sdk.services.lusid.model.UpdateMarketDataFieldConfigurationRequest
classname UpdateMarketDataFieldConfigurationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**add** | [**MetadataFieldsToAdd**](MetadataFieldsToAdd.md) |  | [optional] [default to MetadataFieldsToAdd]
**update** | [**MetadataFieldsToUpdate**](MetadataFieldsToUpdate.md) |  | [optional] [default to MetadataFieldsToUpdate]
**remove** | [**MetadataFieldsToRemove**](MetadataFieldsToRemove.md) |  | [optional] [default to MetadataFieldsToRemove]

```java
import com.finbourne.sdk.services.lusid.model.UpdateMarketDataFieldConfigurationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

MetadataFieldsToAdd add = new MetadataFieldsToAdd();
MetadataFieldsToUpdate update = new MetadataFieldsToUpdate();
MetadataFieldsToRemove remove = new MetadataFieldsToRemove();


UpdateMarketDataFieldConfigurationRequest updateMarketDataFieldConfigurationRequestInstance = new UpdateMarketDataFieldConfigurationRequest()
    .add(add)
    .update(update)
    .remove(remove);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)