# com.finbourne.sdk.services.lusid.model.BatchUpsertInstrumentPropertiesResponse
classname BatchUpsertInstrumentPropertiesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, List&lt;Property&gt;&gt;**](List.md) | The properties that have been successfully upserted | [default to Map<String, List<Property>>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The properties that could not be upserted along with a reason for their failure. | [default to Map<String, ErrorDetail>]
**asAtDate** | [**OffsetDateTime**](OffsetDateTime.md) | The as-at datetime at which properties were created or updated. | [default to OffsetDateTime]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.BatchUpsertInstrumentPropertiesResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, List<Property>> values = new Map<String, List<Property>>();
Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
OffsetDateTime asAtDate = OffsetDateTime.now();
@javax.annotation.Nullable List<Link> links = new List<Link>();


BatchUpsertInstrumentPropertiesResponse batchUpsertInstrumentPropertiesResponseInstance = new BatchUpsertInstrumentPropertiesResponse()
    .values(values)
    .failed(failed)
    .asAtDate(asAtDate)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)