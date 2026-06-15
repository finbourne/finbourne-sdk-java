# com.finbourne.sdk.services.lusid.model.Investor
classname Investor
Representation of an Investor on the LUSID API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorType** | **String** | The type of the Investor | [optional] [default to String]
**identifiers** | **Map&lt;String, String&gt;** | The identifiers of the Investor | [optional] [default to Map<String, String>]
**entityUniqueId** | **String** | The unique Investor entity identifier | [optional] [default to String]
**person** | [**Person**](Person.md) |  | [optional] [default to Person]
**legalEntity** | [**LegalEntity**](LegalEntity.md) |  | [optional] [default to LegalEntity]

```java
import com.finbourne.sdk.services.lusid.model.Investor;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String investorType = "example investorType";
@javax.annotation.Nullable Map<String, String> identifiers = new Map<String, String>();
@javax.annotation.Nullable String entityUniqueId = "example entityUniqueId";
Person person = new Person();
LegalEntity legalEntity = new LegalEntity();


Investor investorInstance = new Investor()
    .investorType(investorType)
    .identifiers(identifiers)
    .entityUniqueId(entityUniqueId)
    .person(person)
    .legalEntity(legalEntity);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)