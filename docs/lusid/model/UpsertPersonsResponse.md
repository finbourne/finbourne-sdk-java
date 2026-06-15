# com.finbourne.sdk.services.lusid.model.UpsertPersonsResponse
classname UpsertPersonsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, Person&gt;**](Person.md) | The Person(s) that have been successfully upserted | [default to Map<String, Person>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The Person(s) that could not be upserted along with a reason for their failure. | [default to Map<String, ErrorDetail>]
**asAtDate** | [**OffsetDateTime**](OffsetDateTime.md) | The as-at datetime at which Person(s) were created or updated. | [default to OffsetDateTime]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.UpsertPersonsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, Person> values = new Map<String, Person>();
Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
OffsetDateTime asAtDate = OffsetDateTime.now();
@javax.annotation.Nullable List<Link> links = new List<Link>();


UpsertPersonsResponse upsertPersonsResponseInstance = new UpsertPersonsResponse()
    .values(values)
    .failed(failed)
    .asAtDate(asAtDate)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)