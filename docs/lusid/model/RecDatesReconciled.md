# com.finbourne.sdk.services.lusid.model.RecDatesReconciled
classname RecDatesReconciled
The left and right effective and asAt dates of the data reconciled in a run.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**leftEffectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime of the data reconciled on the left side. | [default to OffsetDateTime]
**leftAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime of the data reconciled on the left side. | [default to OffsetDateTime]
**rightEffectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime of the data reconciled on the right side. | [default to OffsetDateTime]
**rightAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime of the data reconciled on the right side. | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.RecDatesReconciled;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime leftEffectiveAt = OffsetDateTime.now();
OffsetDateTime leftAsAt = OffsetDateTime.now();
OffsetDateTime rightEffectiveAt = OffsetDateTime.now();
OffsetDateTime rightAsAt = OffsetDateTime.now();


RecDatesReconciled recDatesReconciledInstance = new RecDatesReconciled()
    .leftEffectiveAt(leftEffectiveAt)
    .leftAsAt(leftAsAt)
    .rightEffectiveAt(rightEffectiveAt)
    .rightAsAt(rightAsAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)