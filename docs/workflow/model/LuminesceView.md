# com.finbourne.sdk.services.workflow.model.LuminesceView
classname LuminesceView
Configuration for a Worker that calls a Luminesce view

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [default to String]
**name** | **String** | Name of the view in Luminesce | [default to String]

```java
import com.finbourne.sdk.services.workflow.model.LuminesceView;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
String name = "example name";


LuminesceView luminesceViewInstance = new LuminesceView()
    .type(type)
    .name(name);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)