# com.finbourne.sdk.services.horizon.model.LusidPropertyDefinitionOverrides
classname LusidPropertyDefinitionOverrides
Override values for property Display Name and Description

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayNameOverride** | **String** |  | [optional] [default to String]
**descriptionOverride** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.horizon.model.LusidPropertyDefinitionOverrides;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String displayNameOverride = "example displayNameOverride";
@javax.annotation.Nullable String descriptionOverride = "example descriptionOverride";


LusidPropertyDefinitionOverrides lusidPropertyDefinitionOverridesInstance = new LusidPropertyDefinitionOverrides()
    .displayNameOverride(displayNameOverride)
    .descriptionOverride(descriptionOverride);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)