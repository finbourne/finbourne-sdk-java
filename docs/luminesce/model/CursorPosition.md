# com.finbourne.sdk.services.luminesce.model.CursorPosition
classname CursorPosition
Represents a cursor location

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**row** | **Integer** | Row (0 based) of the user&#39;s cursor position | [default to Integer]
**column** | **Integer** | Column (0 based) of the user&#39;s cursor position | [default to Integer]

```java
import com.finbourne.sdk.services.luminesce.model.CursorPosition;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer row = new Integer("100.00");
Integer column = new Integer("100.00");


CursorPosition cursorPositionInstance = new CursorPosition()
    .row(row)
    .column(column);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)