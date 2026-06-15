# com.finbourne.sdk.services.lusid.model.OtcConfirmation
classname OtcConfirmation
For the storage of any information pertinent to the confirmation of an OTC trade. e.g the Counterparty Agreement Code

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**counterpartyAgreementId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.sdk.services.lusid.model.OtcConfirmation;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId counterpartyAgreementId = new ResourceId();


OtcConfirmation otcConfirmationInstance = new OtcConfirmation()
    .counterpartyAgreementId(counterpartyAgreementId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)