# com.finbourne.sdk.services.lusid.model.UpsertLegalEntityRequest
classname UpsertLegalEntityRequest
Request to create or update an legal entity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifiers** | [**Map&lt;String, Property&gt;**](Property.md) | The identifiers the legal entity will be upserted with.The provided keys should be idTypeScope, idTypeCode, code | [default to Map<String, Property>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties associated to the Legal Entity. | [optional] [default to Map<String, Property>]
**displayName** | **String** | The display name of the Legal Entity | [default to String]
**description** | **String** | The description of the Legal Entity | [optional] [default to String]
**counterpartyRiskInformation** | [**CounterpartyRiskInformation**](CounterpartyRiskInformation.md) |  | [optional] [default to CounterpartyRiskInformation]

```java
import com.finbourne.sdk.services.lusid.model.UpsertLegalEntityRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, Property> identifiers = new Map<String, Property>();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
CounterpartyRiskInformation counterpartyRiskInformation = new CounterpartyRiskInformation();


UpsertLegalEntityRequest upsertLegalEntityRequestInstance = new UpsertLegalEntityRequest()
    .identifiers(identifiers)
    .properties(properties)
    .displayName(displayName)
    .description(description)
    .counterpartyRiskInformation(counterpartyRiskInformation);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)