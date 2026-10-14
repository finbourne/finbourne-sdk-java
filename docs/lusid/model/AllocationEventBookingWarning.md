# com.finbourne.sdk.services.lusid.model.AllocationEventBookingWarning
classname AllocationEventBookingWarning
One validation rule a booking was allowed to proceed through under the map's policy.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The rule that was allowed through, for instance OverCall. | [optional] [default to String]
**detail** | **String** | What the rule found. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEventBookingWarning;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String code = "example code";
@javax.annotation.Nullable String detail = "example detail";


AllocationEventBookingWarning allocationEventBookingWarningInstance = new AllocationEventBookingWarning()
    .code(code)
    .detail(detail);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)