# com.finbourne.sdk.services.lusid.model.CutLabelDefinition
classname CutLabelDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** |  | [optional] [default to String]
**displayName** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]
**cutLocalTime** | [**CutLocalTime**](CutLocalTime.md) |  | [optional] [default to CutLocalTime]
**timeZone** | **String** |  | [optional] [default to String]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.CutLabelDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String code = "example code";
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
CutLocalTime cutLocalTime = new CutLocalTime();
@javax.annotation.Nullable String timeZone = "example timeZone";
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


CutLabelDefinition cutLabelDefinitionInstance = new CutLabelDefinition()
    .code(code)
    .displayName(displayName)
    .description(description)
    .cutLocalTime(cutLocalTime)
    .timeZone(timeZone)
    .href(href)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)