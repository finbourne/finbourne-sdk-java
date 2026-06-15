# com.finbourne.sdk.services.lusid.model.UpdateDerivedPropertyDefinitionRequest
classname UpdateDerivedPropertyDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The display name of the property. | [default to String]
**dataTypeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**propertyDescription** | **String** | Describes the property | [optional] [default to String]
**derivationFormula** | **String** | The rule that defines how data is composed for a derived property. | [default to String]
**isFilterable** | **Boolean** | Bool indicating whether the values of this property are fitlerable, this is true for all non-derived property defintions.  For a derived definition this must be set true to enable filtering. | [default to Boolean]
**valueFormat** | **String** | The format in which values for this property definition should be represented. Available values: Text, Html. | [optional] [default to String]
**customEntityType** | **String** | The custom entity type that this derived property definition can be applied to. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.UpdateDerivedPropertyDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
ResourceId dataTypeId = new ResourceId();
@javax.annotation.Nullable String propertyDescription = "example propertyDescription";
String derivationFormula = "example derivationFormula";
Boolean isFilterable = true;
@javax.annotation.Nullable String valueFormat = "example valueFormat";
@javax.annotation.Nullable String customEntityType = "example customEntityType";


UpdateDerivedPropertyDefinitionRequest updateDerivedPropertyDefinitionRequestInstance = new UpdateDerivedPropertyDefinitionRequest()
    .displayName(displayName)
    .dataTypeId(dataTypeId)
    .propertyDescription(propertyDescription)
    .derivationFormula(derivationFormula)
    .isFilterable(isFilterable)
    .valueFormat(valueFormat)
    .customEntityType(customEntityType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)