# com.finbourne.sdk.services.lusid.model.FundStructureEdge
classname FundStructureEdge
A link from one member of a Fund Structure to another, and how that link is held.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | **String** | The node code of the member that holds the link: the investor or the owner. | [default to String]
**to** | [**FundStructureEdgeTarget**](FundStructureEdgeTarget.md) |  | [default to FundStructureEdgeTarget]
**linkageType** | **String** | How the link is held. DedicatedShareClass (the default) means the source invests into a share class of the target; DirectEquityInstrument, GPInterest, LPInterest and CarryInterest mean the source holds that interest in the target through the instrument in viaInstrumentId. Available values: DedicatedShareClass, DirectEquityInstrument, GPInterest, LPInterest, CarryInterest. | [optional] [default to String]
**viaInstrumentId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.sdk.services.lusid.model.FundStructureEdge;
import java.util.*;
import java.lang.System;
import java.net.URI;

String from = "example from";
FundStructureEdgeTarget to = new FundStructureEdgeTarget();
@javax.annotation.Nullable String linkageType = "example linkageType";
ResourceId viaInstrumentId = new ResourceId();


FundStructureEdge fundStructureEdgeInstance = new FundStructureEdge()
    .from(from)
    .to(to)
    .linkageType(linkageType)
    .viaInstrumentId(viaInstrumentId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)