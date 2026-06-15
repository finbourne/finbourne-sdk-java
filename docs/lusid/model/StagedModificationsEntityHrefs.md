# com.finbourne.sdk.services.lusid.model.StagedModificationsEntityHrefs
classname StagedModificationsEntityHrefs

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**whenStaged** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for the staged modification change at the time when the change was requested. | [optional] [default to URI]
**preview** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for the preview of staged modification change once applied. | [optional] [default to URI]
**latest** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for the staged modification at latest time. | [optional] [default to URI]
**whenClosed** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for the staged modification after it has been applied. | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.StagedModificationsEntityHrefs;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI whenStaged = URI.create("http://example.com/whenStaged");
@javax.annotation.Nullable URI preview = URI.create("http://example.com/preview");
@javax.annotation.Nullable URI latest = URI.create("http://example.com/latest");
@javax.annotation.Nullable URI whenClosed = URI.create("http://example.com/whenClosed");
@javax.annotation.Nullable List<Link> links = new List<Link>();


StagedModificationsEntityHrefs stagedModificationsEntityHrefsInstance = new StagedModificationsEntityHrefs()
    .whenStaged(whenStaged)
    .preview(preview)
    .latest(latest)
    .whenClosed(whenClosed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)