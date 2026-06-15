# com.finbourne.sdk.services.lusid.model.GroupReconciliationUserReviewRemove
classname GroupReconciliationUserReviewRemove

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**breakCodeAsAtAdded** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp of the added User Review input. | [optional] [default to OffsetDateTime]
**matchKeyAsAtAdded** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp of the added User Review input. | [optional] [default to OffsetDateTime]
**commentTextAsAtAdded** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp of the added User Review input. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.GroupReconciliationUserReviewRemove;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable OffsetDateTime breakCodeAsAtAdded = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime matchKeyAsAtAdded = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime commentTextAsAtAdded = OffsetDateTime.now();


GroupReconciliationUserReviewRemove groupReconciliationUserReviewRemoveInstance = new GroupReconciliationUserReviewRemove()
    .breakCodeAsAtAdded(breakCodeAsAtAdded)
    .matchKeyAsAtAdded(matchKeyAsAtAdded)
    .commentTextAsAtAdded(commentTextAsAtAdded);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)