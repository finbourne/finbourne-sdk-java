# com.finbourne.sdk.services.lusid.model.MarginRunIssue
classname MarginRunIssue
Something a margin run could not do for some of its agreements, and why.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agreements** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The collateral agreements the issue concerns. | [default to List<ResourceId>]
**detail** | **String** | What prevented the agreements from being valued. | [default to String]
**shardId** | **String** | The shard the issue arose in, when it arose while valuing. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.MarginRunIssue;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<ResourceId> agreements = new List<ResourceId>();
String detail = "example detail";
@javax.annotation.Nullable String shardId = "example shardId";


MarginRunIssue marginRunIssueInstance = new MarginRunIssue()
    .agreements(agreements)
    .detail(detail)
    .shardId(shardId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)