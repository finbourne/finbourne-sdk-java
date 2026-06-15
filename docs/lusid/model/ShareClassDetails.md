# com.finbourne.sdk.services.lusid.model.ShareClassDetails
classname ShareClassDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lusidInstrumentId** | **String** | LUSID&#39;s internal unique instrument identifier, resolved from the share class&#39; instrument identifiers | [optional] [default to String]
**instrumentScope** | **String** | The scope in which the share class instrument lies. | [optional] [default to String]
**shortCode** | **String** | The unique code within the fund for the share class instrument. | [optional] [default to String]
**domCurrency** | **String** | The domestic currency of the share class instrument | [optional] [default to String]
**instrumentActive** | **Boolean** | If the instrument of the share class is active. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.ShareClassDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String lusidInstrumentId = "example lusidInstrumentId";
@javax.annotation.Nullable String instrumentScope = "example instrumentScope";
@javax.annotation.Nullable String shortCode = "example shortCode";
@javax.annotation.Nullable String domCurrency = "example domCurrency";
Boolean instrumentActive = true;


ShareClassDetails shareClassDetailsInstance = new ShareClassDetails()
    .lusidInstrumentId(lusidInstrumentId)
    .instrumentScope(instrumentScope)
    .shortCode(shortCode)
    .domCurrency(domCurrency)
    .instrumentActive(instrumentActive);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)