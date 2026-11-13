# com.finbourne.sdk.services.lusid.model.RecResultStreakPredecessor
classname RecResultStreakPredecessor
The same result in the previous instance, and which streaks it extends.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | [**RecAgedResult**](RecAgedResult.md) |  | [default to RecAgedResult]
**streakTypes** | **List&lt;String&gt;** | Which streaks the predecessor extends: always Core, and Difference if the aggregate rule differences are unchanged. Open is not set yet. Available values: Core, Difference, Open. | [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.RecResultStreakPredecessor;
import java.util.*;
import java.lang.System;
import java.net.URI;

RecAgedResult result = new RecAgedResult();
List<String> streakTypes = new List<String>();


RecResultStreakPredecessor recResultStreakPredecessorInstance = new RecResultStreakPredecessor()
    .result(result)
    .streakTypes(streakTypes);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)