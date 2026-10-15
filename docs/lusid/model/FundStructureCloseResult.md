# com.finbourne.sdk.services.lusid.model.FundStructureCloseResult
classname FundStructureCloseResult
The outcome of closing a fund structure: one step per member in the order they were closed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**structureId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**valuationPointCode** | **String** | The code of the valuation point to finalise on every member fund. | [default to String]
**steps** | [**List&lt;FundStructureCloseStep&gt;**](FundStructureCloseStep.md) | The finalisation of each member, in the order attempted. | [default to List<FundStructureCloseStep>]
**completed** | **Boolean** | Whether every member finalised. | [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.FundStructureCloseResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId structureId = new ResourceId();
String valuationPointCode = "example valuationPointCode";
List<FundStructureCloseStep> steps = new List<FundStructureCloseStep>();
Boolean completed = true;


FundStructureCloseResult fundStructureCloseResultInstance = new FundStructureCloseResult()
    .structureId(structureId)
    .valuationPointCode(valuationPointCode)
    .steps(steps)
    .completed(completed);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)