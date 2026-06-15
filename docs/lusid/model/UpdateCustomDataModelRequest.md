# com.finbourne.sdk.services.lusid.model.UpdateCustomDataModelRequest
classname UpdateCustomDataModelRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the Custom Data Model. | [default to String]
**description** | **String** | A description for the Custom Data Model. | [optional] [default to String]
**parentDataModel** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**conditions** | **String** | The conditions that the bound entity must meet to be valid. | [optional] [default to String]
**properties** | [**List&lt;CustomDataModelPropertySpecification&gt;**](CustomDataModelPropertySpecification.md) | The properties that are required or allowed on the bound entity. | [optional] [default to List<CustomDataModelPropertySpecification>]
**identifierTypes** | [**List&lt;CustomDataModelIdentifierTypeSpecification&gt;**](CustomDataModelIdentifierTypeSpecification.md) | The identifier types that are required or allowed on the bound entity. | [optional] [default to List<CustomDataModelIdentifierTypeSpecification>]
**attributeAliases** | [**List&lt;Alias&gt;**](Alias.md) | The aliases for property keys, identifier types, and fields on the bound entity. | [optional] [default to List<Alias>]
**recommendedSortBy** | [**List&lt;RecommendedSortBy&gt;**](RecommendedSortBy.md) | The preferred default sorting instructions. | [optional] [default to List<RecommendedSortBy>]
**supplementalPropertyKeys** | **List&lt;String&gt;** | Additional property keys that should be decorated on the bound entity. | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.UpdateCustomDataModelRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
ResourceId parentDataModel = new ResourceId();
@javax.annotation.Nullable String conditions = "example conditions";
@javax.annotation.Nullable List<CustomDataModelPropertySpecification> properties = new List<CustomDataModelPropertySpecification>();
@javax.annotation.Nullable List<CustomDataModelIdentifierTypeSpecification> identifierTypes = new List<CustomDataModelIdentifierTypeSpecification>();
@javax.annotation.Nullable List<Alias> attributeAliases = new List<Alias>();
@javax.annotation.Nullable List<RecommendedSortBy> recommendedSortBy = new List<RecommendedSortBy>();
@javax.annotation.Nullable List<String> supplementalPropertyKeys = new List<String>();


UpdateCustomDataModelRequest updateCustomDataModelRequestInstance = new UpdateCustomDataModelRequest()
    .displayName(displayName)
    .description(description)
    .parentDataModel(parentDataModel)
    .conditions(conditions)
    .properties(properties)
    .identifierTypes(identifierTypes)
    .attributeAliases(attributeAliases)
    .recommendedSortBy(recommendedSortBy)
    .supplementalPropertyKeys(supplementalPropertyKeys);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)