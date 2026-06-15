# com.finbourne.sdk.services.lusid.model.UpsertInstrumentPropertiesResponse
classname UpsertInstrumentPropertiesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAtDate** | [**OffsetDateTime**](OffsetDateTime.md) | The as-at datetime at which properties were created or updated. | [default to OffsetDateTime]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.UpsertInstrumentPropertiesResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime asAtDate = OffsetDateTime.now();
@javax.annotation.Nullable List<Link> links = new List<Link>();


UpsertInstrumentPropertiesResponse upsertInstrumentPropertiesResponseInstance = new UpsertInstrumentPropertiesResponse()
    .asAtDate(asAtDate)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)