# com.finbourne.sdk.services.lusid.model.LockPeriodDiaryEntryRequest
classname LockPeriodDiaryEntryRequest
A definition for the period you wish to lock

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**diaryEntryCode** | **String** | Unique code assigned to a period. When left blank last closed period will be located. | [optional] [default to String]
**closingOptions** | **List&lt;String&gt;** | The options which will be executed once a period is closed or locked. Available values: ApplyClearDown. | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.LockPeriodDiaryEntryRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String diaryEntryCode = "example diaryEntryCode";
@javax.annotation.Nullable List<String> closingOptions = new List<String>();


LockPeriodDiaryEntryRequest lockPeriodDiaryEntryRequestInstance = new LockPeriodDiaryEntryRequest()
    .diaryEntryCode(diaryEntryCode)
    .closingOptions(closingOptions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)