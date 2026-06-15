# com.finbourne.sdk.services.lusid.model.GroupReconciliationFilters
classname GroupReconciliationFilters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | **String** | The filters for the left-side portfolio or portfolio group related data. | [optional] [default to String]
**right** | **String** | The filters for the right-side portfolio or portfolio group related data. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.GroupReconciliationFilters;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String left = "example left";
@javax.annotation.Nullable String right = "example right";


GroupReconciliationFilters groupReconciliationFiltersInstance = new GroupReconciliationFilters()
    .left(left)
    .right(right);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)