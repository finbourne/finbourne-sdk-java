# com.finbourne.sdk.services.lusid.model.GroupReconciliationDatePair
classname GroupReconciliationDatePair

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective at date for the reconciliation | [optional] [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The as at date for the reconciliation | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.GroupReconciliationDatePair;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable OffsetDateTime effectiveAt = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime asAt = OffsetDateTime.now();


GroupReconciliationDatePair groupReconciliationDatePairInstance = new GroupReconciliationDatePair()
    .effectiveAt(effectiveAt)
    .asAt(asAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)