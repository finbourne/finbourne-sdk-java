# com.finbourne.sdk.services.lusid.model.RecClosedPeriods
classname RecClosedPeriods
References to the closed periods created on the left and right timelines when a Closed Period  instance is locked.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | [**RecClosedPeriodReference**](RecClosedPeriodReference.md) |  | [default to RecClosedPeriodReference]
**right** | [**RecClosedPeriodReference**](RecClosedPeriodReference.md) |  | [default to RecClosedPeriodReference]

```java
import com.finbourne.sdk.services.lusid.model.RecClosedPeriods;
import java.util.*;
import java.lang.System;
import java.net.URI;

RecClosedPeriodReference left = new RecClosedPeriodReference();
RecClosedPeriodReference right = new RecClosedPeriodReference();


RecClosedPeriods recClosedPeriodsInstance = new RecClosedPeriods()
    .left(left)
    .right(right);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)