# com.finbourne.sdk.services.access.model.AsAtRangeForSpec
classname AsAtRangeForSpec

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | [**AsAtPredicateContract**](AsAtPredicateContract.md) |  | [default to AsAtPredicateContract]
**to** | [**AsAtPredicateContract**](AsAtPredicateContract.md) |  | [default to AsAtPredicateContract]

```java
import com.finbourne.sdk.services.access.model.AsAtRangeForSpec;
import java.util.*;
import java.lang.System;
import java.net.URI;

AsAtPredicateContract from = new AsAtPredicateContract();
AsAtPredicateContract to = new AsAtPredicateContract();


AsAtRangeForSpec asAtRangeForSpecInstance = new AsAtRangeForSpec()
    .from(from)
    .to(to);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)