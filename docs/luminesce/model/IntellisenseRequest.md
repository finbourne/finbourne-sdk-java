# com.finbourne.sdk.services.luminesce.model.IntellisenseRequest
classname IntellisenseRequest
Representation of a request for IntellisenseItems

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lines** | **List&lt;String&gt;** | The lines of text the user currently has in the editor | [default to List<String>]
**position** | [**CursorPosition**](CursorPosition.md) |  | [default to CursorPosition]

```java
import com.finbourne.sdk.services.luminesce.model.IntellisenseRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> lines = new List<String>();
CursorPosition position = new CursorPosition();


IntellisenseRequest intellisenseRequestInstance = new IntellisenseRequest()
    .lines(lines)
    .position(position);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)