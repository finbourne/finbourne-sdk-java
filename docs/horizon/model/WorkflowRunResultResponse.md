# com.finbourne.sdk.services.horizon.model.WorkflowRunResultResponse
classname WorkflowRunResultResponse
A single declared field and the value this run published for it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | [default to String]
**type** | **String** | One of the Workflow field types: String, Decimal, DateTime, Boolean, LusidUserId. | [default to String]
**value** | **String** | The published value, or null when the run published nothing for this field. | [optional] [default to String]
**displayName** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.horizon.model.WorkflowRunResultResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
String type = "example type";
@javax.annotation.Nullable String value = "example value";
@javax.annotation.Nullable String displayName = "example displayName";


WorkflowRunResultResponse workflowRunResultResponseInstance = new WorkflowRunResultResponse()
    .name(name)
    .type(type)
    .value(value)
    .displayName(displayName);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)