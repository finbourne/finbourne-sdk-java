# com.finbourne.sdk.services.workflow.model.InitialState
classname InitialState
Defines the Initial State of the Task

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The Initial State of the Task | [default to String]
**requiredFields** | **List&lt;String&gt;** | Required input Fields for the Initial State | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.workflow.model.InitialState;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
@javax.annotation.Nullable List<String> requiredFields = new List<String>();


InitialState initialStateInstance = new InitialState()
    .name(name)
    .requiredFields(requiredFields);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)