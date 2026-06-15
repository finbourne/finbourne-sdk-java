# com.finbourne.sdk.services.lusid.model.DialectId
classname DialectId
Unique identifier of a given Dialect

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The Scope of the dialect. | [default to String]
**vendor** | **String** | The vendor of the dialect, the entity that created it. e.g. ISDA, FINBOURNE. | [default to String]
**sourceSystem** | **String** | The source system of the dialect, the system that understands it. e.g. LUSID, QuantLib. | [default to String]
**version** | **String** | The semantic version of the dialect: MAJOR.MINOR.PATCH. | [default to String]
**serialisationFormat** | **String** | The serialisation format of a document in this dialect. Available values: Json, Xml. | [default to String]
**entityType** | **String** | The type of entity this dialect describes e.g. Instrument. Available values: Instrument. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.DialectId;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scope = "example scope";
String vendor = "example vendor";
String sourceSystem = "example sourceSystem";
String version = "example version";
String serialisationFormat = "example serialisationFormat";
String entityType = "example entityType";


DialectId dialectIdInstance = new DialectId()
    .scope(scope)
    .vendor(vendor)
    .sourceSystem(sourceSystem)
    .version(version)
    .serialisationFormat(serialisationFormat)
    .entityType(entityType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)