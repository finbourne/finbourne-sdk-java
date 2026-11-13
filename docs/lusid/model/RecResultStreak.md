# com.finbourne.sdk.services.lusid.model.RecResultStreak
classname RecResultStreak
The run of consecutive instances, ending at this result, in which the same result was produced, with its  difference and open sub-streaks.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**predecessor** | [**RecResultStreakPredecessor**](RecResultStreakPredecessor.md) |  | [default to RecResultStreakPredecessor]
**age** | **String** | The ISO 8601 duration from the startResult&#39;s asAtFirstSeen to the runAsAt of this result&#39;s latest run. Always positive. | [default to String]
**countInstances** | **Integer** | The number of instances in the streak, including this one. Always 2 or more. | [default to Integer]
**startResult** | [**RecAgedResult**](RecAgedResult.md) |  | [default to RecAgedResult]
**differenceStreak** | [**RecResultSubStreak**](RecResultSubStreak.md) |  | [default to RecResultSubStreak]
**openStreak** | [**RecResultSubStreak**](RecResultSubStreak.md) |  | [default to RecResultSubStreak]

```java
import com.finbourne.sdk.services.lusid.model.RecResultStreak;
import java.util.*;
import java.lang.System;
import java.net.URI;

RecResultStreakPredecessor predecessor = new RecResultStreakPredecessor();
String age = "example age";
Integer countInstances = new Integer("100.00");
RecAgedResult startResult = new RecAgedResult();
RecResultSubStreak differenceStreak = new RecResultSubStreak();
RecResultSubStreak openStreak = new RecResultSubStreak();


RecResultStreak recResultStreakInstance = new RecResultStreak()
    .predecessor(predecessor)
    .age(age)
    .countInstances(countInstances)
    .startResult(startResult)
    .differenceStreak(differenceStreak)
    .openStreak(openStreak);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)