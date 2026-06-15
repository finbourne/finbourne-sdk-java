# com.finbourne.sdk.services.lusid.model.SettlementProblem
classname SettlementProblem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**settlementInstructionId** | **String** | The id of the problematic settlement instruction. Combined with the portfolio id this uniquely identifies a settlement instruction | [default to String]
**category** | **String** | The category this instruction belongs to | [default to String]
**status** | **String** | The status of the settlement instruction. Available values: Invalid, Rejected, Applied, Orphan. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.SettlementProblem;
import java.util.*;
import java.lang.System;
import java.net.URI;

String settlementInstructionId = "example settlementInstructionId";
String category = "example category";
String status = "example status";


SettlementProblem settlementProblemInstance = new SettlementProblem()
    .settlementInstructionId(settlementInstructionId)
    .category(category)
    .status(status);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)