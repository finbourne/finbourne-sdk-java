# com.finbourne.sdk.services.lusid.model.SuppressionEntryResponse
classname SuppressionEntryResponse
A single suppressions entry on a virtual transaction override record: the status of the suppression.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | Whether this entry&#39;s target virtual transaction id still matches one the event currently generates. Available values: Applied, Orphaned, Superseded. | [optional] [default to String]
**virtualTransactionId** | **String** | The id of the virtual transaction this entry targets, as it appears in the requested portfolio. Null when the entry targets no virtual transaction the requested portfolio currently generates. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.SuppressionEntryResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String status = "example status";
@javax.annotation.Nullable String virtualTransactionId = "example virtualTransactionId";


SuppressionEntryResponse suppressionEntryResponseInstance = new SuppressionEntryResponse()
    .status(status)
    .virtualTransactionId(virtualTransactionId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)