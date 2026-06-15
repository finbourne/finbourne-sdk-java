# com.finbourne.sdk.services.configuration.model.ConfigurationItem
classname ConfigurationItem
The full version of the configuration item

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date referring to the creation date of the configuration item | [default to OffsetDateTime]
**createdBy** | **String** | Who created the configuration item | [default to String]
**lastModifiedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date referring to the date when the configuration item was last modified | [default to OffsetDateTime]
**lastModifiedBy** | **String** | Who modified the configuration item most recently | [default to String]
**description** | **String** | Describes the configuration item | [optional] [default to String]
**key** | **String** | The key which identifies the configuration item | [default to String]
**value** | **String** | The value of the configuration item | [default to String]
**valueType** | **String** | The type of the configuration item&#39;s value | [default to String]
**isSecret** | **Boolean** | Defines whether or not the value is a secret. | [default to Boolean]
**ref** | **String** | The reference to the configuration item | [readonly] [default to String]
**blockReveal** | **Boolean** | Defines whether the value is blocked with non-internal request. | [default to Boolean]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.configuration.model.ConfigurationItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime createdAt = OffsetDateTime.now();
String createdBy = "example createdBy";
OffsetDateTime lastModifiedAt = OffsetDateTime.now();
String lastModifiedBy = "example lastModifiedBy";
@javax.annotation.Nullable String description = "example description";
String key = "example key";
String value = "example value";
String valueType = "example valueType";
Boolean isSecret = true;
String ref = "example ref";
Boolean blockReveal = true;
@javax.annotation.Nullable List<Link> links = new List<Link>();


ConfigurationItem configurationItemInstance = new ConfigurationItem()
    .createdAt(createdAt)
    .createdBy(createdBy)
    .lastModifiedAt(lastModifiedAt)
    .lastModifiedBy(lastModifiedBy)
    .description(description)
    .key(key)
    .value(value)
    .valueType(valueType)
    .isSecret(isSecret)
    .ref(ref)
    .blockReveal(blockReveal)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)