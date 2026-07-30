# com.finbourne.sdk.services.lusid.model.RecMatchCountByResultType
classname RecMatchCountByResultType
Match result counts broken down by result type.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**match** | **Integer** | The number of Match results. | [default to Integer]
**cross** | **Integer** | The number of Cross results. | [default to Integer]

```java
import com.finbourne.sdk.services.lusid.model.RecMatchCountByResultType;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer match = new Integer("100.00");
Integer cross = new Integer("100.00");


RecMatchCountByResultType recMatchCountByResultTypeInstance = new RecMatchCountByResultType()
    .match(match)
    .cross(cross);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)