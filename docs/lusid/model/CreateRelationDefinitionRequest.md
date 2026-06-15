# com.finbourne.sdk.services.lusid.model.CreateRelationDefinitionRequest
classname CreateRelationDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope that the relation exists in. | [default to String]
**code** | **String** | The code of the relation. Together with the scope this uniquely defines the relation. | [default to String]
**sourceEntityDomain** | **String** | The entity domain of the source entity object must be, allowed values are \&quot;Portfolio\&quot; and \&quot;Person\&quot; | [default to String]
**targetEntityDomain** | **String** | The entity domain of the target entity object must be, allowed values are \&quot;Portfolio\&quot; and \&quot;Person\&quot; | [default to String]
**displayName** | **String** | The display name of the relation. | [default to String]
**outwardDescription** | **String** | The description to relate source entity object and target entity object. | [default to String]
**inwardDescription** | **String** | The description to relate target entity object and source entity object. | [default to String]
**lifeTime** | **String** | Describes how the relations can change over time, allowed values are \&quot;Perpetual\&quot; and \&quot;TimeVariant\&quot; | [optional] [default to String]
**constraintStyle** | **String** | Describes the uniqueness and cardinality for relations with a specific source entity object and relations under this definition. Allowed values are \&quot;Property\&quot; and \&quot;Collection\&quot;, defaults to \&quot;Collection\&quot; if not specified. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CreateRelationDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scope = "example scope";
String code = "example code";
String sourceEntityDomain = "example sourceEntityDomain";
String targetEntityDomain = "example targetEntityDomain";
String displayName = "example displayName";
String outwardDescription = "example outwardDescription";
String inwardDescription = "example inwardDescription";
@javax.annotation.Nullable String lifeTime = "example lifeTime";
@javax.annotation.Nullable String constraintStyle = "example constraintStyle";


CreateRelationDefinitionRequest createRelationDefinitionRequestInstance = new CreateRelationDefinitionRequest()
    .scope(scope)
    .code(code)
    .sourceEntityDomain(sourceEntityDomain)
    .targetEntityDomain(targetEntityDomain)
    .displayName(displayName)
    .outwardDescription(outwardDescription)
    .inwardDescription(inwardDescription)
    .lifeTime(lifeTime)
    .constraintStyle(constraintStyle);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)