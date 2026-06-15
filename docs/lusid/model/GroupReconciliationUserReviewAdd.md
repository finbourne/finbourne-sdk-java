# com.finbourne.sdk.services.lusid.model.GroupReconciliationUserReviewAdd
classname GroupReconciliationUserReviewAdd

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**breakCode** | **String** | The break code of the reconciliation result. | [optional] [default to String]
**matchKey** | **String** | The match key of the reconciliation result. | [optional] [default to String]
**commentText** | **String** | User&#39;s comment regarding the reconciliation result. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.GroupReconciliationUserReviewAdd;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String breakCode = "example breakCode";
@javax.annotation.Nullable String matchKey = "example matchKey";
@javax.annotation.Nullable String commentText = "example commentText";


GroupReconciliationUserReviewAdd groupReconciliationUserReviewAddInstance = new GroupReconciliationUserReviewAdd()
    .breakCode(breakCode)
    .matchKey(matchKey)
    .commentText(commentText);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)