# com.finbourne.sdk.services.lusid.model.FundStructureNode
classname FundStructureNode
A node in a Fund Structure, representing a Fund and its role within the structure.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodeCode** | **String** | A unique identifier for this node within the Fund Structure. | [default to String]
**fundScope** | **String** | The scope of the Fund referenced by this node. | [default to String]
**fundCode** | **String** | The code of the Fund referenced by this node. | [default to String]
**role** | **String** | The role of this node within the structure. Available values: Master, Feeder. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.FundStructureNode;
import java.util.*;
import java.lang.System;
import java.net.URI;

String nodeCode = "example nodeCode";
String fundScope = "example fundScope";
String fundCode = "example fundCode";
String role = "example role";


FundStructureNode fundStructureNodeInstance = new FundStructureNode()
    .nodeCode(nodeCode)
    .fundScope(fundScope)
    .fundCode(fundCode)
    .role(role);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)