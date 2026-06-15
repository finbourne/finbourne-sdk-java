# com.finbourne.sdk.services.luminesce.model.ErrorHighlightResponse
classname ErrorHighlightResponse
Response for error highlighting

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List&lt;ErrorHighlightItem&gt;**](ErrorHighlightItem.md) | The errors within the Sql | [default to List<ErrorHighlightItem>]
**sqlWithMarker** | **String** | The SQL this is for, with characters indicating the error locations | [default to String]

```java
import com.finbourne.sdk.services.luminesce.model.ErrorHighlightResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<ErrorHighlightItem> errors = new List<ErrorHighlightItem>();
String sqlWithMarker = "example sqlWithMarker";


ErrorHighlightResponse errorHighlightResponseInstance = new ErrorHighlightResponse()
    .errors(errors)
    .sqlWithMarker(sqlWithMarker);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)