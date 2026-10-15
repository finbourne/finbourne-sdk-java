# com.finbourne.sdk.services.lusid.model.CounterpartyIdentifier
classname CounterpartyIdentifier
The legal entity a collateral agreement is made with.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idTypeScope** | **String** | The scope of the identifier type, e.g. the scope of the LEI identifier. | [default to String]
**idTypeCode** | **String** | The code of the identifier type, e.g. LEI. | [default to String]
**code** | **String** | The value of the identifier. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CounterpartyIdentifier;
import java.util.*;
import java.lang.System;
import java.net.URI;

String idTypeScope = "example idTypeScope";
String idTypeCode = "example idTypeCode";
String code = "example code";


CounterpartyIdentifier counterpartyIdentifierInstance = new CounterpartyIdentifier()
    .idTypeScope(idTypeScope)
    .idTypeCode(idTypeCode)
    .code(code);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)