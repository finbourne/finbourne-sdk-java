# com.finbourne.sdk.services.lusid.model.Change
classname Change
The time an entity was modified (amendment and/or historical correction).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**entityId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**corrected** | **Boolean** |  | [default to Boolean]
**correctionEffectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**correctionAsAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**amended** | **Boolean** |  | [default to Boolean]
**amendmentEffectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**amendmentAsAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.Change;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
ResourceId entityId = new ResourceId();
Boolean corrected = true;
@javax.annotation.Nullable OffsetDateTime correctionEffectiveAt = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime correctionAsAt = OffsetDateTime.now();
Boolean amended = true;
@javax.annotation.Nullable OffsetDateTime amendmentEffectiveAt = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime amendmentAsAt = OffsetDateTime.now();
@javax.annotation.Nullable List<Link> links = new List<Link>();


Change changeInstance = new Change()
    .href(href)
    .entityId(entityId)
    .corrected(corrected)
    .correctionEffectiveAt(correctionEffectiveAt)
    .correctionAsAt(correctionAsAt)
    .amended(amended)
    .amendmentEffectiveAt(amendmentEffectiveAt)
    .amendmentAsAt(amendmentAsAt)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)