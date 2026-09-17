# com.finbourne.sdk.services.lusid.model.OverrideEntryResponse
classname OverrideEntryResponse
A single overrides entry on a virtual transaction override record: the replacement transaction(s) that  stand in for the overridden virtual transaction, plus its status and diagnostics.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**replacements** | [**List&lt;OverrideDefinitionResponse&gt;**](OverrideDefinitionResponse.md) | The replacement transactions that stand in for the overridden virtual transaction. | [optional] [default to List<OverrideDefinitionResponse>]
**status** | **String** | Whether this entry&#39;s target virtual transaction id still matches one the event currently generates. Available values: Applied, Orphaned, Superseded. | [optional] [default to String]
**virtualTransactionId** | **String** | The id of the virtual transaction this entry targets, as it appears in the requested portfolio. Null when the entry targets no virtual transaction the requested portfolio currently generates. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.OverrideEntryResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<OverrideDefinitionResponse> replacements = new List<OverrideDefinitionResponse>();
@javax.annotation.Nullable String status = "example status";
@javax.annotation.Nullable String virtualTransactionId = "example virtualTransactionId";


OverrideEntryResponse overrideEntryResponseInstance = new OverrideEntryResponse()
    .replacements(replacements)
    .status(status)
    .virtualTransactionId(virtualTransactionId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)