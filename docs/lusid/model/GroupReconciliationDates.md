# com.finbourne.sdk.services.lusid.model.GroupReconciliationDates
classname GroupReconciliationDates

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | [**GroupReconciliationDatePair**](GroupReconciliationDatePair.md) |  | [optional] [default to GroupReconciliationDatePair]
**right** | [**GroupReconciliationDatePair**](GroupReconciliationDatePair.md) |  | [optional] [default to GroupReconciliationDatePair]

```java
import com.finbourne.sdk.services.lusid.model.GroupReconciliationDates;
import java.util.*;
import java.lang.System;
import java.net.URI;

GroupReconciliationDatePair left = new GroupReconciliationDatePair();
GroupReconciliationDatePair right = new GroupReconciliationDatePair();


GroupReconciliationDates groupReconciliationDatesInstance = new GroupReconciliationDates()
    .left(left)
    .right(right);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)