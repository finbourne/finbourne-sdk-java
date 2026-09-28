# com.finbourne.sdk.services.lusid.model.FundStructureEdgeTarget
classname FundStructureEdgeTarget
The member a link points at, and for a dedicated share class link the share class on that member.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**node** | **String** | The node code of the member the link points at. | [default to String]
**shareClassShortCode** | **String** | The short code of the share class on the target member that the source invests into. Required for a DedicatedShareClass link and not allowed on any other. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.FundStructureEdgeTarget;
import java.util.*;
import java.lang.System;
import java.net.URI;

String node = "example node";
@javax.annotation.Nullable String shareClassShortCode = "example shareClassShortCode";


FundStructureEdgeTarget fundStructureEdgeTargetInstance = new FundStructureEdgeTarget()
    .node(node)
    .shareClassShortCode(shareClassShortCode);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)