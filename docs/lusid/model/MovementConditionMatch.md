# com.finbourne.sdk.services.lusid.model.MovementConditionMatch
classname MovementConditionMatch
The outcome of one movement's condition for a transaction. Reported per movement rather than keyed by  movement, because a transaction type may configure several movements that share a side and have no name.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**movementName** | **String** | The name of the movement, or null if the movement is unnamed. | [optional] [default to String]
**side** | **String** | The side the movement is configured against. | [default to String]
**conditionMatched** | **Boolean** | Whether the movement&#39;s condition was satisfied by this transaction. A movement with no condition always matches. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.MovementConditionMatch;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String movementName = "example movementName";
String side = "example side";
Boolean conditionMatched = true;


MovementConditionMatch movementConditionMatchInstance = new MovementConditionMatch()
    .movementName(movementName)
    .side(side)
    .conditionMatched(conditionMatched);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)