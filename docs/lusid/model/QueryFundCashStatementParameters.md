# com.finbourne.sdk.services.lusid.model.QueryFundCashStatementParameters
classname QueryFundCashStatementParameters
Request body for querying a Fund Cash Statement.  Extends the diary entry query pattern with cash statement display mode.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | [**DateOrDiaryEntry**](DateOrDiaryEntry.md) |  | [optional] [default to DateOrDiaryEntry]
**end** | [**DateOrDiaryEntry**](DateOrDiaryEntry.md) |  | [default to DateOrDiaryEntry]
**variant** | **String** | Optional diary entry variant (e.g. for multi-estimate scenarios). | [optional] [default to String]
**displayMode** | **String** | Cash statement display mode: ShowReversal (default) shows full reversal/TrueUp detail; Consolidated collapses reversals into AvgRateCorrection rows. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.QueryFundCashStatementParameters;
import java.util.*;
import java.lang.System;
import java.net.URI;

DateOrDiaryEntry start = new DateOrDiaryEntry();
DateOrDiaryEntry end = new DateOrDiaryEntry();
@javax.annotation.Nullable String variant = "example variant";
@javax.annotation.Nullable String displayMode = "example displayMode";


QueryFundCashStatementParameters queryFundCashStatementParametersInstance = new QueryFundCashStatementParameters()
    .start(start)
    .end(end)
    .variant(variant)
    .displayMode(displayMode);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)