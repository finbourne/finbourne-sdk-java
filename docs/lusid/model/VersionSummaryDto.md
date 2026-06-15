# com.finbourne.sdk.services.lusid.model.VersionSummaryDto
classname VersionSummaryDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** |  | [optional] [default to String]
**buildVersion** | **String** |  | [optional] [default to String]
**excelVersion** | **String** |  | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.VersionSummaryDto;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String apiVersion = "example apiVersion";
@javax.annotation.Nullable String buildVersion = "example buildVersion";
@javax.annotation.Nullable String excelVersion = "example excelVersion";
@javax.annotation.Nullable List<Link> links = new List<Link>();


VersionSummaryDto versionSummaryDtoInstance = new VersionSummaryDto()
    .apiVersion(apiVersion)
    .buildVersion(buildVersion)
    .excelVersion(excelVersion)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)