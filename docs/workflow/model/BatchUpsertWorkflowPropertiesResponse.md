# com.finbourne.sdk.services.workflow.model.BatchUpsertWorkflowPropertiesResponse
classname BatchUpsertWorkflowPropertiesResponse
The result of a batch upsert of properties on a Workflow.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The properties that were successfully upserted or deleted, keyed by property key. | [optional] [default to Map<String, PerpetualProperty>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The properties that could not be upserted or deleted, keyed by property key. | [optional] [default to Map<String, ErrorDetail>]
**asAtDate** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the properties were updated or created. | [optional] [default to OffsetDateTime]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.workflow.model.BatchUpsertWorkflowPropertiesResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, PerpetualProperty> values = new Map<String, PerpetualProperty>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
OffsetDateTime asAtDate = OffsetDateTime.now();
@javax.annotation.Nullable List<Link> links = new List<Link>();


BatchUpsertWorkflowPropertiesResponse batchUpsertWorkflowPropertiesResponseInstance = new BatchUpsertWorkflowPropertiesResponse()
    .values(values)
    .failed(failed)
    .asAtDate(asAtDate)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)