# com.finbourne.sdk.services.lusid.model.FundStructureCloseStep
classname FundStructureCloseStep
One member's step in a fund structure close.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**memberShortCode** | **String** | The node code of the member in the structure. | [default to String]
**fund** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**step** | **Integer** | The position of the member in the close order. | [default to Integer]
**status** | **String** | What happened to the member. Available values: Finalised, AlreadyFinal, Failed, Skipped. | [default to String]
**failure** | **String** | The failure that stopped the member finalising, if any. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.FundStructureCloseStep;
import java.util.*;
import java.lang.System;
import java.net.URI;

String memberShortCode = "example memberShortCode";
ResourceId fund = new ResourceId();
Integer step = new Integer("100.00");
String status = "example status";
@javax.annotation.Nullable String failure = "example failure";


FundStructureCloseStep fundStructureCloseStepInstance = new FundStructureCloseStep()
    .memberShortCode(memberShortCode)
    .fund(fund)
    .step(step)
    .status(status)
    .failure(failure);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)