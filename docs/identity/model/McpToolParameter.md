# com.finbourne.sdk.services.identity.model.McpToolParameter
classname McpToolParameter
A parameter definition for an MCP tool

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the parameter (identifier format) | [default to String]
**dataType** | **String** | The data type of the parameter | [default to String]
**description** | **String** | A description of what the parameter is used for | [optional] [default to String]

```java
import com.finbourne.sdk.services.identity.model.McpToolParameter;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
String dataType = "example dataType";
@javax.annotation.Nullable String description = "example description";


McpToolParameter mcpToolParameterInstance = new McpToolParameter()
    .name(name)
    .dataType(dataType)
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)