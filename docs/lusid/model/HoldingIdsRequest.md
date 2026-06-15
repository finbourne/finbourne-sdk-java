# com.finbourne.sdk.services.lusid.model.HoldingIdsRequest
classname HoldingIdsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**holdingIds** | **List&lt;Long&gt;** | The array of unique holding identifiers | [default to List<Long>]

```java
import com.finbourne.sdk.services.lusid.model.HoldingIdsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<Long> holdingIds = new List<Long>();


HoldingIdsRequest holdingIdsRequestInstance = new HoldingIdsRequest()
    .holdingIds(holdingIds);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)