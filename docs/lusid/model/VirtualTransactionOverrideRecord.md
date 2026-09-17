# com.finbourne.sdk.services.lusid.model.VirtualTransactionOverrideRecord
classname VirtualTransactionOverrideRecord
The overrides and suppressions stored against a single instrument event in a single portfolio, together  with their statuses as resolved against the requested portfolio's currently generated virtual  transactions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentEventId** | **String** | The identifier of the instrument event this record is stored against. | [optional] [default to String]
**sourcePortfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**overrides** | [**Map&lt;String, OverrideEntryResponse&gt;**](OverrideEntryResponse.md) | The overrides stored in this record, keyed by the virtual transaction id being overridden as it appears in the portfolio holding the record. | [optional] [default to Map<String, OverrideEntryResponse>]
**suppressions** | [**Map&lt;String, SuppressionEntryResponse&gt;**](SuppressionEntryResponse.md) | The suppressions stored in this record, keyed by the virtual transaction id being suppressed as it appears in the portfolio holding the record. | [optional] [default to Map<String, SuppressionEntryResponse>]
**overrideMatchStatus** | **String** | Whether every override and suppression entry in this record still matches a virtual transaction the event currently generates. Available values: Matched, Orphaned. | [optional] [default to String]
**overrideApplicationStatus** | **String** | Whether all, some, or none of this record&#39;s override and suppression entries are currently applied. Available values: Full, Partial, Orphaned. | [optional] [default to String]
**cancelActive** | **Boolean** | True when an active event-level Cancel instruction also exists for this instrument event, taking precedence over the entries in this record. | [optional] [default to Boolean]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]

```java
import com.finbourne.sdk.services.lusid.model.VirtualTransactionOverrideRecord;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String instrumentEventId = "example instrumentEventId";
ResourceId sourcePortfolioId = new ResourceId();
@javax.annotation.Nullable Map<String, OverrideEntryResponse> overrides = new Map<String, OverrideEntryResponse>();
@javax.annotation.Nullable Map<String, SuppressionEntryResponse> suppressions = new Map<String, SuppressionEntryResponse>();
@javax.annotation.Nullable String overrideMatchStatus = "example overrideMatchStatus";
@javax.annotation.Nullable String overrideApplicationStatus = "example overrideApplicationStatus";
@javax.annotation.Nullable Boolean cancelActive = true;
Version version = new Version();


VirtualTransactionOverrideRecord virtualTransactionOverrideRecordInstance = new VirtualTransactionOverrideRecord()
    .instrumentEventId(instrumentEventId)
    .sourcePortfolioId(sourcePortfolioId)
    .overrides(overrides)
    .suppressions(suppressions)
    .overrideMatchStatus(overrideMatchStatus)
    .overrideApplicationStatus(overrideApplicationStatus)
    .cancelActive(cancelActive)
    .version(version);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)