# com.finbourne.sdk.services.lusid.model.TypedResourceId
classname TypedResourceId
Represents the user-defined identifier for a Legal Entity.  Users can define their own, scoped identifiers for Legal Entities using identifier properties.  For example,  when used to identify a Legal Entity, the identifier defined by LegalEntity/myScope/1234ABC0000000000063 would be represented as   {     \"idTypeScope\": \"myScope\",     \"idTypeCode\": \"1234ABC0000000000063\",     \"code\": \"ACME_CO\"   }

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idTypeScope** | **String** | The scope of the identifier&#39;s (property) definition. | [default to String]
**idTypeCode** | **String** | The code of identifier&#39;s (property) definition. This describes what the identifier represents.  For a Legal Entity, this might be a registeredCompanyNumber or LEI. | [default to String]
**code** | **String** | The value of the user-defined identifier in respect of the entity. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TypedResourceId;
import java.util.*;
import java.lang.System;
import java.net.URI;

String idTypeScope = "example idTypeScope";
String idTypeCode = "example idTypeCode";
String code = "example code";


TypedResourceId typedResourceIdInstance = new TypedResourceId()
    .idTypeScope(idTypeScope)
    .idTypeCode(idTypeCode)
    .code(code);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)