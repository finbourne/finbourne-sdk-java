# com.finbourne.sdk.services.lusid.model.InstrumentEventConfiguration
classname InstrumentEventConfiguration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionTemplateScopes** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.sdk.services.lusid.model.InstrumentEventConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<String> transactionTemplateScopes = new List<String>();
ResourceId recipeId = new ResourceId();


InstrumentEventConfiguration instrumentEventConfigurationInstance = new InstrumentEventConfiguration()
    .transactionTemplateScopes(transactionTemplateScopes)
    .recipeId(recipeId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)