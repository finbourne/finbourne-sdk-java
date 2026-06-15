# com.finbourne.sdk.services.workflow.model.LuminesceViewResponse
classname LuminesceViewResponse
Readonly configuration for a Worker that calls a Luminesce view

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [optional] [default to String]
**name** | **String** | Name of the view in Luminesce | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.LuminesceViewResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String name = "example name";


LuminesceViewResponse luminesceViewResponseInstance = new LuminesceViewResponse()
    .type(type)
    .name(name);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)