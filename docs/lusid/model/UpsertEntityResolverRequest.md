# com.finbourne.sdk.services.lusid.model.UpsertEntityResolverRequest
classname UpsertEntityResolverRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | **String** | The entity type that a specific resolution configuration is applicable to (e.g. Instrument). | [default to String]
**description** | **String** | Describes what this specific identifier order is used for. | [optional] [default to String]
**identifierMatchingOrder** | [**List&lt;IdentifierForResolution&gt;**](IdentifierForResolution.md) | Ordered collection of related identifier keys that are used to define which identifier takes priority in resolving an entity. | [default to List<IdentifierForResolution>]

```java
import com.finbourne.sdk.services.lusid.model.UpsertEntityResolverRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String entityType = "example entityType";
@javax.annotation.Nullable String description = "example description";
List<IdentifierForResolution> identifierMatchingOrder = new List<IdentifierForResolution>();


UpsertEntityResolverRequest upsertEntityResolverRequestInstance = new UpsertEntityResolverRequest()
    .entityType(entityType)
    .description(description)
    .identifierMatchingOrder(identifierMatchingOrder);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)