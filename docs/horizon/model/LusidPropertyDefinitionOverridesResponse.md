# com.finbourne.sdk.services.horizon.model.LusidPropertyDefinitionOverridesResponse
classname LusidPropertyDefinitionOverridesResponse
An item that has been updated as a result of setting LusidPropertyDefinitionOverrides.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **String** | The action performed on this property. \&quot;upsert\&quot; for setting values for new and existing             properties. \&quot;delete\&quot; for existing properties that were removed | [default to String]
**writeError** | **String** |  | [optional] [default to String]
**writeErrorDetail** | **String** |  | [optional] [default to String]
**displayNameOverride** | **String** |  | [optional] [default to String]
**descriptionOverride** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.horizon.model.LusidPropertyDefinitionOverridesResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String action = "example action";
@javax.annotation.Nullable String writeError = "example writeError";
@javax.annotation.Nullable String writeErrorDetail = "example writeErrorDetail";
@javax.annotation.Nullable String displayNameOverride = "example displayNameOverride";
@javax.annotation.Nullable String descriptionOverride = "example descriptionOverride";


LusidPropertyDefinitionOverridesResponse lusidPropertyDefinitionOverridesResponseInstance = new LusidPropertyDefinitionOverridesResponse()
    .action(action)
    .writeError(writeError)
    .writeErrorDetail(writeErrorDetail)
    .displayNameOverride(displayNameOverride)
    .descriptionOverride(descriptionOverride);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)