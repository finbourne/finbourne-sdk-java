# com.finbourne.sdk.services.scheduler.model.Repository
classname Repository
An object representation of a repository

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The identifier of the repository | [optional] [default to String]
**creationTime** | [**OffsetDateTime**](OffsetDateTime.md) | Date of  repository creation | [optional] [default to OffsetDateTime]
**lastUpdate** | [**OffsetDateTime**](OffsetDateTime.md) | The last update of the repository | [optional] [default to OffsetDateTime]
**description** | **String** | Description of the repository | [optional] [default to String]
**pullCount** | **Long** | Number of times images were pulled from this repository | [optional] [default to Long]
**imageCount** | **Long** | The number of versions of this image | [optional] [default to Long]
**images** | [**Link**](Link.md) |  | [optional] [default to Link]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.scheduler.model.Repository;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String name = "example name";
OffsetDateTime creationTime = OffsetDateTime.now();
OffsetDateTime lastUpdate = OffsetDateTime.now();
@javax.annotation.Nullable String description = "example description";
Long pullCount = new Long("100.00");
Long imageCount = new Long("100.00");
Link images = new Link();
@javax.annotation.Nullable List<Link> links = new List<Link>();


Repository repositoryInstance = new Repository()
    .name(name)
    .creationTime(creationTime)
    .lastUpdate(lastUpdate)
    .description(description)
    .pullCount(pullCount)
    .imageCount(imageCount)
    .images(images)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)