# com.finbourne.sdk.services.horizon.model.ProcessorSchemaResponse
classname ProcessorSchemaResponse
DTO ProcessorSchemaResponse fields with JObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**processorName** | **String** |  | [default to String]
**version** | **String** |  | [default to String]
**configurationSchema** | **Object** |  | [default to Object]

```java
import com.finbourne.sdk.services.horizon.model.ProcessorSchemaResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String processorName = "example processorName";
String version = "example version";
@javax.annotation.Nullable Object 

ProcessorSchemaResponse processorSchemaResponseInstance = new ProcessorSchemaResponse()
    .processorName(processorName)
    .version(version)
    .configurationSchema(configurationSchema);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)