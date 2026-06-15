# com.finbourne.sdk.services.lusid.model.DerivationFormulaExplainRequest
classname DerivationFormulaExplainRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | **String** | The type of the entity for which the derived property or partial formula is to be resolved against. | [default to String]
**scope** | **String** | (Optional) The scope that entity exists in. If no scope is provided, the default scope for the entity type will be used. | [optional] [default to String]
**code** | **String** | (Optional) The code of the entity, to be provided for entities that support scope/code retrieval. If no code or identifier is provided, the logical evaluation tree without resolved values is returned. | [optional] [default to String]
**subentityId** | **String** | (Optional) The id of the sub-entity to explain the derived property for. This must be provided along with the scope/code of the parent entity. | [optional] [default to String]
**identifier** | **Map&lt;String, String&gt;** | (Optional). An identifier key/value pair that uniquely identifies the entity to explain the derived property for. This can be either an instrument identifier, or an identifier property. If no code or identifier is provided, the logical evaluation tree without resolved values is returned. | [optional] [default to Map<String, String>]
**propertyKey** | **String** | (Optional) The key of the derived property to get an explanation for. This takes the format {domain}/{scope}/{code}. One of either property key or partial formula must be provided. | [optional] [default to String]
**partialFormula** | **String** | (Optional) A partial derivation formula to get an explanation for. Can be provided in lieu of a property key. One of either property key or partial formula must be provided. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.DerivationFormulaExplainRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String entityType = "example entityType";
@javax.annotation.Nullable String scope = "example scope";
@javax.annotation.Nullable String code = "example code";
@javax.annotation.Nullable String subentityId = "example subentityId";
@javax.annotation.Nullable Map<String, String> identifier = new Map<String, String>();
@javax.annotation.Nullable String propertyKey = "example propertyKey";
@javax.annotation.Nullable String partialFormula = "example partialFormula";


DerivationFormulaExplainRequest derivationFormulaExplainRequestInstance = new DerivationFormulaExplainRequest()
    .entityType(entityType)
    .scope(scope)
    .code(code)
    .subentityId(subentityId)
    .identifier(identifier)
    .propertyKey(propertyKey)
    .partialFormula(partialFormula);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)