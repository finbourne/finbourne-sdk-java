# com.finbourne.sdk.services.lusid.model.ContractDetails
classname ContractDetails
Set of identifiers of an existing FlexibleLoan contract.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifiers** | **Map&lt;String, String&gt;** | Unique instrument identifiers. | [default to Map<String, String>]
**lusidInstrumentId** | **String** | LUSID&#39;s internal unique instrument identifier - readonly field, resolved from the instrument identifiers. | [optional] [readonly] [default to String]
**instrumentScope** | **String** | The scope in which the FlexibleLoan instrument lies - readonly field, resolved from the instrument identifiers. | [optional] [readonly] [default to String]
**instrumentName** | **String** | The name of the FlexibleLoan instrument - readonly field, resolved from the instrument identifiers. | [optional] [readonly] [default to String]
**domCcy** | **String** | The domestic currency of the instrument - readonly field, resolved from the instrument identifiers. | [optional] [readonly] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ContractDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> identifiers = new Map<String, String>();
@javax.annotation.Nullable String lusidInstrumentId = "example lusidInstrumentId";
@javax.annotation.Nullable String instrumentScope = "example instrumentScope";
@javax.annotation.Nullable String instrumentName = "example instrumentName";
@javax.annotation.Nullable String domCcy = "example domCcy";


ContractDetails contractDetailsInstance = new ContractDetails()
    .identifiers(identifiers)
    .lusidInstrumentId(lusidInstrumentId)
    .instrumentScope(instrumentScope)
    .instrumentName(instrumentName)
    .domCcy(domCcy);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)