# com.finbourne.sdk.services.horizon.model.WorkflowExecuteParameterResponse
classname WorkflowExecuteParameterResponse
A single execute parameter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | [default to String]
**type** | **String** | One of the Workflow field types: String, Decimal, DateTime, Boolean. | [default to String]
**required** | **Boolean** | Whether every run must supply the parameter, whatever its stage. | [default to Boolean]
**displayName** | **String** |  | [default to String]
**description** | **String** |  | [default to String]
**format** | **String** | The shape a String value must take, e.g. YYYY-MM, when it has one. | [optional] [default to String]
**allowedValues** | **List&lt;String&gt;** | The closed set of accepted values, when there is one. | [optional] [default to List<String>]
**requiredForStages** | **List&lt;String&gt;** | The stages for which the parameter is mandatory. | [default to List<String>]

```java
import com.finbourne.sdk.services.horizon.model.WorkflowExecuteParameterResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
String type = "example type";
Boolean required = true;
String displayName = "example displayName";
String description = "example description";
@javax.annotation.Nullable String format = "example format";
@javax.annotation.Nullable List<String> allowedValues = new List<String>();
List<String> requiredForStages = new List<String>();


WorkflowExecuteParameterResponse workflowExecuteParameterResponseInstance = new WorkflowExecuteParameterResponse()
    .name(name)
    .type(type)
    .required(required)
    .displayName(displayName)
    .description(description)
    .format(format)
    .allowedValues(allowedValues)
    .requiredForStages(requiredForStages);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)