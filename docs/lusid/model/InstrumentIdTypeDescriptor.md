# com.finbourne.sdk.services.lusid.model.InstrumentIdTypeDescriptor
classname InstrumentIdTypeDescriptor
The description of an allowable instrument identifier.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifierType** | **String** | The name of the identifier type. | [default to String]
**propertyKey** | **String** | The property key that corresponds to the identifier type. | [default to String]
**isUniqueIdentifierType** | **Boolean** | Whether or not the identifier type is enforced to be unique. | [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.InstrumentIdTypeDescriptor;
import java.util.*;
import java.lang.System;
import java.net.URI;

String identifierType = "example identifierType";
String propertyKey = "example propertyKey";
Boolean isUniqueIdentifierType = true;


InstrumentIdTypeDescriptor instrumentIdTypeDescriptorInstance = new InstrumentIdTypeDescriptor()
    .identifierType(identifierType)
    .propertyKey(propertyKey)
    .isUniqueIdentifierType(isUniqueIdentifierType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)