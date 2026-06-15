# com.finbourne.sdk.services.lusid.model.CategorySettlementStatus
classname CategorySettlementStatus

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | The Status of the settlement category. Available values: Unsettled, PartSettled, Settled, None. | [default to String]
**isOverdue** | **Boolean** | Whether the category has any overdue movements | [default to Boolean]
**problems** | [**List&lt;SettlementProblem&gt;**](SettlementProblem.md) | Instruction level detail of rejected or invalid settlement instructions | [default to List<SettlementProblem>]

```java
import com.finbourne.sdk.services.lusid.model.CategorySettlementStatus;
import java.util.*;
import java.lang.System;
import java.net.URI;

String status = "example status";
Boolean isOverdue = true;
List<SettlementProblem> problems = new List<SettlementProblem>();


CategorySettlementStatus categorySettlementStatusInstance = new CategorySettlementStatus()
    .status(status)
    .isOverdue(isOverdue)
    .problems(problems);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)