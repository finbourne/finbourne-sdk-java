# com.finbourne.sdk.services.lusid.model.RecResultSubStreak
classname RecResultSubStreak
The part of a streak, ending at this result, over which a stricter condition held: same difference, or open.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**age** | **String** | The ISO 8601 duration from the startResult&#39;s asAtFirstSeen to the runAsAt of this result&#39;s latest run. Zero when the predecessor does not extend the sub-streak. | [default to String]
**countInstances** | **Integer** | The number of instances in the sub-streak, including this one. Null when the predecessor does not extend the sub-streak; otherwise 2 or more. | [optional] [default to Integer]
**startResult** | [**RecAgedResult**](RecAgedResult.md) |  | [optional] [default to RecAgedResult]

```java
import com.finbourne.sdk.services.lusid.model.RecResultSubStreak;
import java.util.*;
import java.lang.System;
import java.net.URI;

String age = "example age";
@javax.annotation.Nullable Integer countInstances = new Integer("100.00");
RecAgedResult startResult = new RecAgedResult();


RecResultSubStreak recResultSubStreakInstance = new RecResultSubStreak()
    .age(age)
    .countInstances(countInstances)
    .startResult(startResult);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)