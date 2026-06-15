# com.finbourne.sdk.services.lusid.model.GroupReconciliationDefinitionRecipeIds
classname GroupReconciliationDefinitionRecipeIds

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**right** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]

```java
import com.finbourne.sdk.services.lusid.model.GroupReconciliationDefinitionRecipeIds;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId left = new ResourceId();
ResourceId right = new ResourceId();


GroupReconciliationDefinitionRecipeIds groupReconciliationDefinitionRecipeIdsInstance = new GroupReconciliationDefinitionRecipeIds()
    .left(left)
    .right(right);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)