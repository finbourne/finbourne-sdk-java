# com.finbourne.sdk.services.lusid.model.FundStructureEdgeTarget
classname FundStructureEdgeTarget
The target of a Fund Structure edge, identifying the master node and share class the feeder invests into.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**node** | **String** | The node code of the master node that is the target of this relationship. | [default to String]
**shareClassShortCode** | **String** | The short code of the share class on the master fund that the feeder invests into. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.FundStructureEdgeTarget;
import java.util.*;
import java.lang.System;
import java.net.URI;

String node = "example node";
String shareClassShortCode = "example shareClassShortCode";


FundStructureEdgeTarget fundStructureEdgeTargetInstance = new FundStructureEdgeTarget()
    .node(node)
    .shareClassShortCode(shareClassShortCode);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)