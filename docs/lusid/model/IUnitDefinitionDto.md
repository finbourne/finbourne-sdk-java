# com.finbourne.sdk.services.lusid.model.IUnitDefinitionDto
classname IUnitDefinitionDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schema** | **String** | Available values: NoUnits, Basic, Iso4217Currency. | [optional] [default to String]
**code** | **String** |  | [optional] [readonly] [default to String]
**displayName** | **String** |  | [optional] [readonly] [default to String]
**description** | **String** |  | [optional] [readonly] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.IUnitDefinitionDto;
import java.util.*;
import java.lang.System;
import java.net.URI;

String schema = "example schema";
@javax.annotation.Nullable String code = "example code";
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";


IUnitDefinitionDto iUnitDefinitionDtoInstance = new IUnitDefinitionDto()
    .schema(schema)
    .code(code)
    .displayName(displayName)
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)