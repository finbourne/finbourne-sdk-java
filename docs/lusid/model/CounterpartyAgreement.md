# com.finbourne.sdk.services.lusid.model.CounterpartyAgreement
classname CounterpartyAgreement
Represents the legal agreement between two parties engaged in an OTC transaction.  A typical example would be a 2002 ISDA Master Agreement, signed by two legal entities on a given date.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | A user-defined display label for the Counterparty Agreement. | [default to String]
**agreementType** | **String** | A user-defined field to capture the type of agreement this represents. Examples might be \&quot;ISDA 2002 Master Agreement\&quot; or \&quot;ISDA 1992 Master Agreement\&quot;. | [default to String]
**counterpartySignatory** | [**CounterpartySignatory**](CounterpartySignatory.md) |  | [default to CounterpartySignatory]
**datedAsOf** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the CounterpartyAgreement was signed by both parties. | [default to OffsetDateTime]
**creditSupportAnnexId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]

```java
import com.finbourne.sdk.services.lusid.model.CounterpartyAgreement;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
String agreementType = "example agreementType";
CounterpartySignatory counterpartySignatory = new CounterpartySignatory();
OffsetDateTime datedAsOf = OffsetDateTime.now();
ResourceId creditSupportAnnexId = new ResourceId();
ResourceId id = new ResourceId();


CounterpartyAgreement counterpartyAgreementInstance = new CounterpartyAgreement()
    .displayName(displayName)
    .agreementType(agreementType)
    .counterpartySignatory(counterpartySignatory)
    .datedAsOf(datedAsOf)
    .creditSupportAnnexId(creditSupportAnnexId)
    .id(id);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)