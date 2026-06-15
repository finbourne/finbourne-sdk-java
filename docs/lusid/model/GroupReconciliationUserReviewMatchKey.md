# com.finbourne.sdk.services.lusid.model.GroupReconciliationUserReviewMatchKey
classname GroupReconciliationUserReviewMatchKey

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**matchKey** | **String** | The match key of the reconciliation result. | [default to String]
**userId** | **String** | Id of the user who made a User Review input. | [optional] [default to String]
**asAtAdded** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp of the added User Review input. | [optional] [default to OffsetDateTime]
**asAtInvalid** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp when User Review input became invalid e.g. because of the different attribute values within the new run. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.GroupReconciliationUserReviewMatchKey;
import java.util.*;
import java.lang.System;
import java.net.URI;

String matchKey = "example matchKey";
@javax.annotation.Nullable String userId = "example userId";
OffsetDateTime asAtAdded = OffsetDateTime.now();
OffsetDateTime asAtInvalid = OffsetDateTime.now();


GroupReconciliationUserReviewMatchKey groupReconciliationUserReviewMatchKeyInstance = new GroupReconciliationUserReviewMatchKey()
    .matchKey(matchKey)
    .userId(userId)
    .asAtAdded(asAtAdded)
    .asAtInvalid(asAtInvalid);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)