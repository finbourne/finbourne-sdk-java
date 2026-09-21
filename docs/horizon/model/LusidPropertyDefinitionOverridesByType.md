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
**effectiveFromOverride** | **String** | ISO-8601 instant to use as the property value&#39;s effectiveFrom instead of the date the integration derives, e.g. \&quot;0001-01-01T00:00:00Z\&quot;. Only accepted for integrations reporting supportsEffectiveFromOverride, and only for TimeVariant property definitions. Omit to leave any stored value untouched; send an empty string to clear it. | [optional] [default to String]

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
@javax.annotation.Nullable String effectiveFromOverride = "example effectiveFromOverride";


LusidPropertyDefinitionOverridesByType lusidPropertyDefinitionOverridesByTypeInstance = new LusidPropertyDefinitionOverridesByType()
    .displayNameOverride(displayNameOverride)
    .descriptionOverride(descriptionOverride)
    .entityType(entityType)
    .entitySubType(entitySubType)
    .vendorPackage(vendorPackage)
    .effectiveFromOverride(effectiveFromOverride);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)