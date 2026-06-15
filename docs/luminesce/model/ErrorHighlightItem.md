# com.finbourne.sdk.services.luminesce.model.ErrorHighlightItem
classname ErrorHighlightItem
Representation of a sql error

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | [**CursorPosition**](CursorPosition.md) |  | [default to CursorPosition]
**stop** | [**CursorPosition**](CursorPosition.md) |  | [default to CursorPosition]
**noViableAlternativeStart** | [**CursorPosition**](CursorPosition.md) |  | [optional] [default to CursorPosition]
**length** | **Integer** | The length of the error token counting line breaks if any | [default to Integer]
**message** | **String** | The error message | [default to String]

```java
import com.finbourne.sdk.services.luminesce.model.ErrorHighlightItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

CursorPosition start = new CursorPosition();
CursorPosition stop = new CursorPosition();
CursorPosition noViableAlternativeStart = new CursorPosition();
Integer length = new Integer("100.00");
String message = "example message";


ErrorHighlightItem errorHighlightItemInstance = new ErrorHighlightItem()
    .start(start)
    .stop(stop)
    .noViableAlternativeStart(noViableAlternativeStart)
    .length(length)
    .message(message);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)