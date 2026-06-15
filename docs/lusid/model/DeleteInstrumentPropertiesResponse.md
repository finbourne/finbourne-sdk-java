# com.finbourne.sdk.services.lusid.model.DeleteInstrumentPropertiesResponse
classname DeleteInstrumentPropertiesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The as-at datetime at which properties were deleted. | [default to OffsetDateTime]
**stagedModifications** | [**StagedModificationsInfo**](StagedModificationsInfo.md) |  | [optional] [default to StagedModificationsInfo]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.DeleteInstrumentPropertiesResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime asAt = OffsetDateTime.now();
StagedModificationsInfo stagedModifications = new StagedModificationsInfo();
@javax.annotation.Nullable List<Link> links = new List<Link>();


DeleteInstrumentPropertiesResponse deleteInstrumentPropertiesResponseInstance = new DeleteInstrumentPropertiesResponse()
    .asAt(asAt)
    .stagedModifications(stagedModifications)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)