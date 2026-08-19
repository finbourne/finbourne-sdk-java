# com.finbourne.sdk.services.lusid.model.RecDefRecipeIds
classname RecDefRecipeIds

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**right** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]

```java
import com.finbourne.sdk.services.lusid.model.RecDefRecipeIds;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId left = new ResourceId();
ResourceId right = new ResourceId();


RecDefRecipeIds recDefRecipeIdsInstance = new RecDefRecipeIds()
    .left(left)
    .right(right);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)