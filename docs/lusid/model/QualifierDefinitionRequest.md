# com.finbourne.sdk.services.lusid.model.QualifierDefinitionRequest
classname QualifierDefinitionRequest
A qualifier to declare against a single-value property definition.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The key by which the qualifier is addressed, for example &#39;direction&#39;. Addressed in filters, sort orders and derivation formulae as Properties[{propertyKey}].Qualifiers[{qualifierKey}]. Validated under the same rules as a property code. | [default to String]
**displayName** | **String** | The display name of the qualifier. | [default to String]
**description** | **String** | Describes the qualifier. Optional; null where not supplied. | [optional] [default to String]
**dataTypeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**isRequired** | **Boolean** | Whether a value for this qualifier must be supplied when a value of the property is written. Defaults to false, and is returned as a boolean rather than as null. Validated on write only, so setting it true does not retroactively invalidate values stored before the change. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.QualifierDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String key = "example key";
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
ResourceId dataTypeId = new ResourceId();
@javax.annotation.Nullable Boolean isRequired = true;


QualifierDefinitionRequest qualifierDefinitionRequestInstance = new QualifierDefinitionRequest()
    .key(key)
    .displayName(displayName)
    .description(description)
    .dataTypeId(dataTypeId)
    .isRequired(isRequired);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)