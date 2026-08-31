# com.finbourne.sdk.services.lusid.model.UnconfirmClosedPeriodRequest
classname UnconfirmClosedPeriodRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deleteSubsequentPeriods** | **Boolean** | Whether to delete every Closed Period that comes after the requested Closed Period on the Timeline. When false (the default) only the latest confirmed Closed Period may be unconfirmed. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.UnconfirmClosedPeriodRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean deleteSubsequentPeriods = true;


UnconfirmClosedPeriodRequest unconfirmClosedPeriodRequestInstance = new UnconfirmClosedPeriodRequest()
    .deleteSubsequentPeriods(deleteSubsequentPeriods);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)