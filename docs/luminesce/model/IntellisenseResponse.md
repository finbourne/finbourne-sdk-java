# com.finbourne.sdk.services.luminesce.model.IntellisenseResponse
classname IntellisenseResponse
Available intellisense response information

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoCompleteList** | [**List&lt;IntellisenseItem&gt;**](IntellisenseItem.md) | The available items at this point | [default to List<IntellisenseItem>]
**tryAgainSoonForMore** | **Boolean** | Should the caller try again soon? (true means a cache is being built and this is a preliminary response!) | [default to Boolean]
**sqlWithMarker** | **String** | The SQL this is for with characters indicating the location the pop-up is for | [default to String]
**startReplacementPosition** | [**CursorPosition**](CursorPosition.md) |  | [default to CursorPosition]
**endReplacementPosition** | [**CursorPosition**](CursorPosition.md) |  | [default to CursorPosition]

```java
import com.finbourne.sdk.services.luminesce.model.IntellisenseResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<IntellisenseItem> autoCompleteList = new List<IntellisenseItem>();
Boolean tryAgainSoonForMore = true;
String sqlWithMarker = "example sqlWithMarker";
CursorPosition startReplacementPosition = new CursorPosition();
CursorPosition endReplacementPosition = new CursorPosition();


IntellisenseResponse intellisenseResponseInstance = new IntellisenseResponse()
    .autoCompleteList(autoCompleteList)
    .tryAgainSoonForMore(tryAgainSoonForMore)
    .sqlWithMarker(sqlWithMarker)
    .startReplacementPosition(startReplacementPosition)
    .endReplacementPosition(endReplacementPosition);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)