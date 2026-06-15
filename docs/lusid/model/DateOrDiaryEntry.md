# com.finbourne.sdk.services.lusid.model.DateOrDiaryEntry
classname DateOrDiaryEntry

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | **String** | A date. If specified, DiaryEntry must not be specified. | [optional] [default to String]
**diaryEntry** | **String** | The code of a diary entry. If specified, Date must not be specified. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.DateOrDiaryEntry;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String date = "example date";
@javax.annotation.Nullable String diaryEntry = "example diaryEntry";


DateOrDiaryEntry dateOrDiaryEntryInstance = new DateOrDiaryEntry()
    .date(date)
    .diaryEntry(diaryEntry);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)