# com.finbourne.sdk.services.insights.model.AuditDataSummary
classname AuditDataSummary

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **Integer** |  | [optional] [readonly] [default to Integer]
**categories** | **Map&lt;String, Integer&gt;** |  | [optional] [default to Map<String, Integer>]

```java
import com.finbourne.sdk.services.insights.model.AuditDataSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer count = new Integer("100.00");
@javax.annotation.Nullable Map<String, Integer> categories = new Map<String, Integer>();


AuditDataSummary auditDataSummaryInstance = new AuditDataSummary()
    .count(count)
    .categories(categories);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)