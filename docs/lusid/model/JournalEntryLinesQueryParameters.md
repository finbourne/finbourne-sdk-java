# com.finbourne.sdk.services.lusid.model.JournalEntryLinesQueryParameters
classname JournalEntryLinesQueryParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | [**DateOrDiaryEntry**](DateOrDiaryEntry.md) |  | [optional] [default to DateOrDiaryEntry]
**end** | [**DateOrDiaryEntry**](DateOrDiaryEntry.md) |  | [optional] [default to DateOrDiaryEntry]
**variant** | **String** | Unique Variant for the given Valuation points. If not provided, defaults to empty string. | [optional] [default to String]
**dateMode** | **String** | The mode of calculation of the journal entry lines. Available values: ActivityDate, AccountingDate. | [optional] [default to String]
**generalLedgerProfileCode** | **String** | The optional code of a general ledger profile used to decorate journal entry lines with levels. | [optional] [default to String]
**propertyKeys** | **List&lt;String&gt;** | A list of property keys from the &#39;Instrument&#39;, &#39;Transaction&#39;, &#39;Portfolio&#39;, &#39;Account&#39;, &#39;LegalEntity&#39; or &#39;CustodianAccount&#39; domain to decorate onto the journal entry lines. | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.JournalEntryLinesQueryParameters;
import java.util.*;
import java.lang.System;
import java.net.URI;

DateOrDiaryEntry start = new DateOrDiaryEntry();
DateOrDiaryEntry end = new DateOrDiaryEntry();
@javax.annotation.Nullable String variant = "example variant";
@javax.annotation.Nullable String dateMode = "example dateMode";
@javax.annotation.Nullable String generalLedgerProfileCode = "example generalLedgerProfileCode";
@javax.annotation.Nullable List<String> propertyKeys = new List<String>();


JournalEntryLinesQueryParameters journalEntryLinesQueryParametersInstance = new JournalEntryLinesQueryParameters()
    .start(start)
    .end(end)
    .variant(variant)
    .dateMode(dateMode)
    .generalLedgerProfileCode(generalLedgerProfileCode)
    .propertyKeys(propertyKeys);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)