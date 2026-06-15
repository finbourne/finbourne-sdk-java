# com.finbourne.sdk.services.lusid.model.EntityIdentifier
classname EntityIdentifier
Dto to expose mapped keys to new standardised format

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifierScope** | **String** | The scope of the identifier | [optional] [default to String]
**identifierType** | **String** | The type of the identifier | [default to String]
**identifierValue** | **String** | The value of the identifier | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.EntityIdentifier;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String identifierScope = "example identifierScope";
String identifierType = "example identifierType";
String identifierValue = "example identifierValue";


EntityIdentifier entityIdentifierInstance = new EntityIdentifier()
    .identifierScope(identifierScope)
    .identifierType(identifierType)
    .identifierValue(identifierValue);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)