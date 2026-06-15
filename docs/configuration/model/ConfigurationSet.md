# com.finbourne.sdk.services.configuration.model.ConfigurationSet
classname ConfigurationSet
The full version of the configuration set

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date referring to the creation date of the configuration set | [default to OffsetDateTime]
**createdBy** | **String** | Who created the configuration set | [default to String]
**lastModifiedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date referring to the date when the configuration set was last modified | [default to OffsetDateTime]
**lastModifiedBy** | **String** | Who modified the configuration set most recently | [default to String]
**description** | **String** | Describes the configuration set | [optional] [default to String]
**items** | [**List&lt;ConfigurationItemSummary&gt;**](ConfigurationItemSummary.md) | The collection of the configuration items that this set contains. | [optional] [default to List<ConfigurationItemSummary>]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**type** | **String** | The type (personal or shared) of the configuration set | [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.configuration.model.ConfigurationSet;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime createdAt = OffsetDateTime.now();
String createdBy = "example createdBy";
OffsetDateTime lastModifiedAt = OffsetDateTime.now();
String lastModifiedBy = "example lastModifiedBy";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable List<ConfigurationItemSummary> items = new List<ConfigurationItemSummary>();
ResourceId id = new ResourceId();
String type = "example type";
@javax.annotation.Nullable List<Link> links = new List<Link>();


ConfigurationSet configurationSetInstance = new ConfigurationSet()
    .createdAt(createdAt)
    .createdBy(createdBy)
    .lastModifiedAt(lastModifiedAt)
    .lastModifiedBy(lastModifiedBy)
    .description(description)
    .items(items)
    .id(id)
    .type(type)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)