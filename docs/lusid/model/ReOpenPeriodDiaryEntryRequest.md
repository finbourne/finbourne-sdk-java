# com.finbourne.sdk.services.lusid.model.ReOpenPeriodDiaryEntryRequest
classname ReOpenPeriodDiaryEntryRequest
A definition for the period you wish to re open

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**diaryEntryCode** | **String** | Unique code assigned to a period. When left blank last period will be used. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ReOpenPeriodDiaryEntryRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String diaryEntryCode = "example diaryEntryCode";


ReOpenPeriodDiaryEntryRequest reOpenPeriodDiaryEntryRequestInstance = new ReOpenPeriodDiaryEntryRequest()
    .diaryEntryCode(diaryEntryCode);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)