# com.finbourne.sdk.services.lusid.model.CustomDataModelCriteria
classname CustomDataModelCriteria

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conditions** | **List&lt;String&gt;** | The conditions that the bound entity must meet to be valid. | [optional] [default to List<String>]
**properties** | [**List&lt;CustomDataModelPropertySpecificationWithDisplayName&gt;**](CustomDataModelPropertySpecificationWithDisplayName.md) | The properties that are required or allowed on the bound entity. | [optional] [default to List<CustomDataModelPropertySpecificationWithDisplayName>]
**identifierTypes** | [**List&lt;CustomDataModelIdentifierTypeSpecificationWithDisplayName&gt;**](CustomDataModelIdentifierTypeSpecificationWithDisplayName.md) | The identifier types that are required or allowed on the bound entity. | [optional] [default to List<CustomDataModelIdentifierTypeSpecificationWithDisplayName>]
**attributeAliases** | [**List&lt;Alias&gt;**](Alias.md) | The aliases for property keys, identifier types, and fields on the bound entity. | [optional] [default to List<Alias>]
**recommendedSortBy** | [**List&lt;RecommendedSortBy&gt;**](RecommendedSortBy.md) | The preferred default sorting instructions. | [optional] [default to List<RecommendedSortBy>]
**supplementalPropertyKeys** | **List&lt;String&gt;** | Additional property keys that should be decorated on the bound entity. | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.CustomDataModelCriteria;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<String> conditions = new List<String>();
@javax.annotation.Nullable List<CustomDataModelPropertySpecificationWithDisplayName> properties = new List<CustomDataModelPropertySpecificationWithDisplayName>();
@javax.annotation.Nullable List<CustomDataModelIdentifierTypeSpecificationWithDisplayName> identifierTypes = new List<CustomDataModelIdentifierTypeSpecificationWithDisplayName>();
@javax.annotation.Nullable List<Alias> attributeAliases = new List<Alias>();
@javax.annotation.Nullable List<RecommendedSortBy> recommendedSortBy = new List<RecommendedSortBy>();
@javax.annotation.Nullable List<String> supplementalPropertyKeys = new List<String>();


CustomDataModelCriteria customDataModelCriteriaInstance = new CustomDataModelCriteria()
    .conditions(conditions)
    .properties(properties)
    .identifierTypes(identifierTypes)
    .attributeAliases(attributeAliases)
    .recommendedSortBy(recommendedSortBy)
    .supplementalPropertyKeys(supplementalPropertyKeys);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)