# com.finbourne.sdk.services.luminesce.model.ErrorHighlightRequest
classname ErrorHighlightRequest
Request for Error highlighting

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lines** | **List&lt;String&gt;** | The lines of text the user currently has in the editor | [default to List<String>]
**ensureSomeTextIsSelected** | **Boolean** | If an editor requires some selection of non-whitespace this can be set to true to force at least one visible character to be selected. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.luminesce.model.ErrorHighlightRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> lines = new List<String>();
Boolean ensureSomeTextIsSelected = true;


ErrorHighlightRequest errorHighlightRequestInstance = new ErrorHighlightRequest()
    .lines(lines)
    .ensureSomeTextIsSelected(ensureSomeTextIsSelected);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)