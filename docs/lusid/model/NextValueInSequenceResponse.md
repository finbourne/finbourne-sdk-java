# com.finbourne.sdk.services.lusid.model.NextValueInSequenceResponse
classname NextValueInSequenceResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | **List&lt;String&gt;** | The next set of values for the specified Sequence. | [default to List<String>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.NextValueInSequenceResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> values = new List<String>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


NextValueInSequenceResponse nextValueInSequenceResponseInstance = new NextValueInSequenceResponse()
    .values(values)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)