# com.finbourne.sdk.services.lusid.model.RecLinkedBy
classname RecLinkedBy
The item pairings a link between two rec results was established on, per side.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | [**List&lt;RecResultLinkKey&gt;**](RecResultLinkKey.md) | The pairings between the two results&#39; left-side items, one entry per pairing. May be empty. | [default to List<RecResultLinkKey>]
**right** | [**List&lt;RecResultLinkKey&gt;**](RecResultLinkKey.md) | The pairings between the two results&#39; right-side items, one entry per pairing. May be empty. | [default to List<RecResultLinkKey>]

```java
import com.finbourne.sdk.services.lusid.model.RecLinkedBy;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<RecResultLinkKey> left = new List<RecResultLinkKey>();
List<RecResultLinkKey> right = new List<RecResultLinkKey>();


RecLinkedBy recLinkedByInstance = new RecLinkedBy()
    .left(left)
    .right(right);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)