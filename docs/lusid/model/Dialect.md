# com.finbourne.sdk.services.lusid.model.Dialect
classname Dialect
The language/format of a translatable entity. Entities can be LUSID native or external and the Dialect describes  1) the system that understands the entity and  2) applicable validation for the entity, in the form of a schema.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**DialectId**](DialectId.md) |  | [default to DialectId]
**schema** | [**DialectSchema**](DialectSchema.md) |  | [default to DialectSchema]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]

```java
import com.finbourne.sdk.services.lusid.model.Dialect;
import java.util.*;
import java.lang.System;
import java.net.URI;

DialectId id = new DialectId();
DialectSchema schema = new DialectSchema();
Version version = new Version();


Dialect dialectInstance = new Dialect()
    .id(id)
    .schema(schema)
    .version(version);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)