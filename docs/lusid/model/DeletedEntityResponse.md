# com.finbourne.sdk.services.lusid.model.DeletedEntityResponse
classname DeletedEntityResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which the deletion became valid. May be null in the case where multiple date times are applicable. | [optional] [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the deletion was committed to LUSID. | [default to OffsetDateTime]
**entityType** | **String** | The type of the entity that the deleted response applies to. | [optional] [default to String]
**entityUniqueId** | **String** | The unique Id of the entity that the deleted response applies to. | [optional] [default to String]
**stagedModifications** | [**StagedModificationsInfo**](StagedModificationsInfo.md) |  | [optional] [default to StagedModificationsInfo]
**metadata** | [**Map&lt;String, List&lt;ResponseMetaData&gt;&gt;**](List.md) | Contains warnings or additional information related to the delete operation. | [optional] [default to Map<String, List<ResponseMetaData>>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.DeletedEntityResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable OffsetDateTime effectiveFrom = OffsetDateTime.now();
OffsetDateTime asAt = OffsetDateTime.now();
@javax.annotation.Nullable String entityType = "example entityType";
@javax.annotation.Nullable String entityUniqueId = "example entityUniqueId";
StagedModificationsInfo stagedModifications = new StagedModificationsInfo();
@javax.annotation.Nullable Map<String, List<ResponseMetaData>> metadata = new Map<String, List<ResponseMetaData>>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


DeletedEntityResponse deletedEntityResponseInstance = new DeletedEntityResponse()
    .href(href)
    .effectiveFrom(effectiveFrom)
    .asAt(asAt)
    .entityType(entityType)
    .entityUniqueId(entityUniqueId)
    .stagedModifications(stagedModifications)
    .metadata(metadata)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)