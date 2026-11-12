# com.finbourne.sdk.services.lusid.model.AdjustmentEntryResponse
classname AdjustmentEntryResponse
A single adjustments entry on a virtual transaction override record: the fields it changes and its status.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adjustment** | [**AdjustmentDefinitionResponse**](AdjustmentDefinitionResponse.md) |  | [optional] [default to AdjustmentDefinitionResponse]
**status** | **String** | Whether this entry&#39;s target virtual transaction id still matches one the event currently generates. Available values: Applied, Orphaned, Superseded. | [optional] [default to String]
**virtualTransactionId** | **String** | The id of the virtual transaction this entry targets, as it appears in the requested portfolio. Null when the entry targets no virtual transaction the requested portfolio currently generates. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AdjustmentEntryResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

AdjustmentDefinitionResponse adjustment = new AdjustmentDefinitionResponse();
@javax.annotation.Nullable String status = "example status";
@javax.annotation.Nullable String virtualTransactionId = "example virtualTransactionId";


AdjustmentEntryResponse adjustmentEntryResponseInstance = new AdjustmentEntryResponse()
    .adjustment(adjustment)
    .status(status)
    .virtualTransactionId(virtualTransactionId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)