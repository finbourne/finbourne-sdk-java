# com.finbourne.sdk.services.lusid.model.StagedModificationsInfo
classname StagedModificationsInfo
The staged modifications metadata.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countPending** | **Integer** | The number of staged modifications for the entity with a status of Pending for the requested asAt. | [default to Integer]
**hrefPending** | [**URI**](URI.md) | Link to the list staged modifications endpoint, filtered by entityType, entityUniqueId and status (&#x3D; Pending). | [default to URI]
**idsPreviewed** | **List&lt;String&gt;** | An array of the ids of any StagedModifications being previewed. | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.StagedModificationsInfo;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer countPending = new Integer("100.00");
URI hrefPending = URI.create("http://example.com/hrefPending");
@javax.annotation.Nullable List<String> idsPreviewed = new List<String>();


StagedModificationsInfo stagedModificationsInfoInstance = new StagedModificationsInfo()
    .countPending(countPending)
    .hrefPending(hrefPending)
    .idsPreviewed(idsPreviewed);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)