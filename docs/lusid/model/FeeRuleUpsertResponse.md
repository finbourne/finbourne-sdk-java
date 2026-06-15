# com.finbourne.sdk.services.lusid.model.FeeRuleUpsertResponse
classname FeeRuleUpsertResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, FeeRule&gt;**](FeeRule.md) |  | [default to Map<String, FeeRule>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.FeeRuleUpsertResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, FeeRule> values = new Map<String, FeeRule>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


FeeRuleUpsertResponse feeRuleUpsertResponseInstance = new FeeRuleUpsertResponse()
    .values(values)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)