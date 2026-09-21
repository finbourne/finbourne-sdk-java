# com.finbourne.sdk.services.horizon.model.SetInstanceOptionalPropertyMappingResponse
classname SetInstanceOptionalPropertyMappingResponse
Response for SetInstanceOptionalPropertyMapping.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**propertyOverrides** | [**Map&lt;String, LusidPropertyDefinitionOverridesByType&gt;**](LusidPropertyDefinitionOverridesByType.md) | The full, current optional property mapping for the instance, after the write. | [default to Map<String, LusidPropertyDefinitionOverridesByType>]
**warnings** | **List&lt;String&gt;** | Advisory warnings about a write that succeeded regardless, e.g. a future-dated effectiveFromOverride, or another enabled instance of the same integration holding a different effectiveFromOverride for the same property. | [default to List<String>]

```java
import com.finbourne.sdk.services.horizon.model.SetInstanceOptionalPropertyMappingResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, LusidPropertyDefinitionOverridesByType> propertyOverrides = new Map<String, LusidPropertyDefinitionOverridesByType>();
List<String> warnings = new List<String>();


SetInstanceOptionalPropertyMappingResponse setInstanceOptionalPropertyMappingResponseInstance = new SetInstanceOptionalPropertyMappingResponse()
    .propertyOverrides(propertyOverrides)
    .warnings(warnings);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)