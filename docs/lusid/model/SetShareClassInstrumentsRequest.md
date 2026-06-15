# com.finbourne.sdk.services.lusid.model.SetShareClassInstrumentsRequest
classname SetShareClassInstrumentsRequest
The request used to create a Fund.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shareClassInstrumentScopes** | **List&lt;String&gt;** | The scopes in which the instruments lie, currently limited to one. | [default to List<String>]
**shareClassInstruments** | [**List&lt;InstrumentResolutionDetail&gt;**](InstrumentResolutionDetail.md) | Details the user-provided instrument identifiers and the instrument resolved from them. These would be decommissioned in favour of the new AllocationGroups and ShareClasses structures. | [default to List<InstrumentResolutionDetail>]

```java
import com.finbourne.sdk.services.lusid.model.SetShareClassInstrumentsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> shareClassInstrumentScopes = new List<String>();
List<InstrumentResolutionDetail> shareClassInstruments = new List<InstrumentResolutionDetail>();


SetShareClassInstrumentsRequest setShareClassInstrumentsRequestInstance = new SetShareClassInstrumentsRequest()
    .shareClassInstrumentScopes(shareClassInstrumentScopes)
    .shareClassInstruments(shareClassInstruments);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)