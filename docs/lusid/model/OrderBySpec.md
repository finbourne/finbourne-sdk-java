# com.finbourne.sdk.services.lusid.model.OrderBySpec
classname OrderBySpec

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The key that uniquely identifies a queryable address in Lusid. | [default to String]
**sortOrder** | **String** | Available values: Ascending, Descending. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.OrderBySpec;
import java.util.*;
import java.lang.System;
import java.net.URI;

String key = "example key";
String sortOrder = "example sortOrder";


OrderBySpec orderBySpecInstance = new OrderBySpec()
    .key(key)
    .sortOrder(sortOrder);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)