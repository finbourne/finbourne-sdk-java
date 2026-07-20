# com.finbourne.sdk.services.lusid.model.FundStructureEdge
classname FundStructureEdge
A directed edge in a Fund Structure, defining a relationship from a feeder node to a master node share class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | **String** | The node code of the feeder node that is the source of this relationship. | [default to String]
**to** | [**FundStructureEdgeTarget**](FundStructureEdgeTarget.md) |  | [default to FundStructureEdgeTarget]

```java
import com.finbourne.sdk.services.lusid.model.FundStructureEdge;
import java.util.*;
import java.lang.System;
import java.net.URI;

String from = "example from";
FundStructureEdgeTarget to = new FundStructureEdgeTarget();


FundStructureEdge fundStructureEdgeInstance = new FundStructureEdge()
    .from(from)
    .to(to);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)