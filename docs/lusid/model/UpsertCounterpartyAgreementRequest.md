# com.finbourne.sdk.services.lusid.model.UpsertCounterpartyAgreementRequest
classname UpsertCounterpartyAgreementRequest
Counterparty Agreement that is to be stored in the convention data store.  There must be only one of these present.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**counterpartyAgreement** | [**CounterpartyAgreement**](CounterpartyAgreement.md) |  | [default to CounterpartyAgreement]

```java
import com.finbourne.sdk.services.lusid.model.UpsertCounterpartyAgreementRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

CounterpartyAgreement counterpartyAgreement = new CounterpartyAgreement();


UpsertCounterpartyAgreementRequest upsertCounterpartyAgreementRequestInstance = new UpsertCounterpartyAgreementRequest()
    .counterpartyAgreement(counterpartyAgreement);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)