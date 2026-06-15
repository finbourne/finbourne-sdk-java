# com.finbourne.sdk.services.lusid.model.UpsertDialectRequest
classname UpsertDialectRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**DialectId**](DialectId.md) |  | [default to DialectId]
**schema** | [**DialectSchema**](DialectSchema.md) |  | [default to DialectSchema]

```java
import com.finbourne.sdk.services.lusid.model.UpsertDialectRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

DialectId id = new DialectId();
DialectSchema schema = new DialectSchema();


UpsertDialectRequest upsertDialectRequestInstance = new UpsertDialectRequest()
    .id(id)
    .schema(schema);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)