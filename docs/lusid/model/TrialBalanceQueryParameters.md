# com.finbourne.sdk.services.lusid.model.TrialBalanceQueryParameters
classname TrialBalanceQueryParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | [**DateOrDiaryEntry**](DateOrDiaryEntry.md) |  | [optional] [default to DateOrDiaryEntry]
**end** | [**DateOrDiaryEntry**](DateOrDiaryEntry.md) |  | [optional] [default to DateOrDiaryEntry]
**dateMode** | **String** | The mode of calculation of the trial balance. Available values: ActivityDate, AccountingDate. | [optional] [default to String]
**generalLedgerProfileCode** | **String** | The optional code of a general ledger profile used to decorate trial balance with levels. | [optional] [default to String]
**propertyKeys** | **List&lt;String&gt;** | A list of property keys from the &#39;Account&#39; domain to decorate onto the trial balance. | [optional] [default to List<String>]
**excludeCleardownModule** | **Boolean** | By deafult this flag is set to false, if this is set to true, no cleardown module will be applied to the trial balance. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.TrialBalanceQueryParameters;
import java.util.*;
import java.lang.System;
import java.net.URI;

DateOrDiaryEntry start = new DateOrDiaryEntry();
DateOrDiaryEntry end = new DateOrDiaryEntry();
@javax.annotation.Nullable String dateMode = "example dateMode";
@javax.annotation.Nullable String generalLedgerProfileCode = "example generalLedgerProfileCode";
@javax.annotation.Nullable List<String> propertyKeys = new List<String>();
Boolean excludeCleardownModule = true;


TrialBalanceQueryParameters trialBalanceQueryParametersInstance = new TrialBalanceQueryParameters()
    .start(start)
    .end(end)
    .dateMode(dateMode)
    .generalLedgerProfileCode(generalLedgerProfileCode)
    .propertyKeys(propertyKeys)
    .excludeCleardownModule(excludeCleardownModule);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)