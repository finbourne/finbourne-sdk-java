# com.finbourne.sdk.services.identity.model.McpToolLuminescePayload
classname McpToolLuminescePayload
Payload data for a Luminesce query MCP tool

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**query** | **String** | The Luminesce query to execute | [default to String]

```java
import com.finbourne.sdk.services.identity.model.McpToolLuminescePayload;
import java.util.*;
import java.lang.System;
import java.net.URI;

String query = "example query";


McpToolLuminescePayload mcpToolLuminescePayloadInstance = new McpToolLuminescePayload()
    .query(query);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)