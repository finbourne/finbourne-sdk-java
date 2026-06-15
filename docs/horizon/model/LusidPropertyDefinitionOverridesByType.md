# com.finbourne.sdk.services.horizon.model.LusidPropertyDefinitionOverridesByType
classname LusidPropertyDefinitionOverridesByType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayNameOverride** | **String** |  | [optional] [default to String]
**descriptionOverride** | **String** |  | [optional] [default to String]
**entityType** | **String** |  | [optional] [default to String]
**entitySubType** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**vendorPackage** | **List&lt;String&gt;** |  | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.horizon.model.LusidPropertyDefinitionOverridesByType;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String displayNameOverride = "example displayNameOverride";
@javax.annotation.Nullable String descriptionOverride = "example descriptionOverride";
@javax.annotation.Nullable String entityType = "example entityType";
@javax.annotation.Nullable List<String> entitySubType = new List<String>();
@javax.annotation.Nullable List<String> vendorPackage = new List<String>();


LusidPropertyDefinitionOverridesByType lusidPropertyDefinitionOverridesByTypeInstance = new LusidPropertyDefinitionOverridesByType()
    .displayNameOverride(displayNameOverride)
    .descriptionOverride(descriptionOverride)
    .entityType(entityType)
    .entitySubType(entitySubType)
    .vendorPackage(vendorPackage);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)