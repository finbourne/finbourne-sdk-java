# com.finbourne.sdk.services.lusid.model.RecLinkedBy
classname RecLinkedBy
The item keys a link between two rec results was established on, per side.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | [**List&lt;RecLinkKey&gt;**](RecLinkKey.md) | The keys shared by the two results&#39; left-side items. May be empty. | [default to List<RecLinkKey>]
**right** | [**List&lt;RecLinkKey&gt;**](RecLinkKey.md) | The keys shared by the two results&#39; right-side items. May be empty. | [default to List<RecLinkKey>]

```java
import com.finbourne.sdk.services.lusid.model.RecLinkedBy;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<RecLinkKey> left = new List<RecLinkKey>();
List<RecLinkKey> right = new List<RecLinkKey>();


RecLinkedBy recLinkedByInstance = new RecLinkedBy()
    .left(left)
    .right(right);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)