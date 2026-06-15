# com.finbourne.sdk.services.luminesce.model.ConvertToViewData
classname ConvertToViewData
Representation of view data where will template the data into a 'create view' sql

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**query** | **String** | view query | [default to String]
**name** | **String** | Name of view | [default to String]
**description** | **String** | Description of view | [optional] [default to String]
**documentationLink** | **String** | Documentation link | [optional] [default to String]
**viewParameters** | [**List&lt;ViewParameter&gt;**](ViewParameter.md) | View parameters | [optional] [default to List<ViewParameter>]
**otherParameters** | **Map&lt;String, String&gt;** | Other parameters not explicitly handled by the ConvertToView generation. These will be populated by the \&quot;From SQL\&quot; and should simply be returned by the web GUI should the user edit / update / regenerate | [optional] [default to Map<String, String>]
**startingVariableName** | **String** | Which variable the this start with, null if not started from a full Create View Sql Statement. | [optional] [default to String]

```java
import com.finbourne.sdk.services.luminesce.model.ConvertToViewData;
import java.util.*;
import java.lang.System;
import java.net.URI;

String query = "example query";
String name = "example name";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable String documentationLink = "example documentationLink";
@javax.annotation.Nullable List<ViewParameter> viewParameters = new List<ViewParameter>();
@javax.annotation.Nullable Map<String, String> otherParameters = new Map<String, String>();
@javax.annotation.Nullable String startingVariableName = "example startingVariableName";


ConvertToViewData convertToViewDataInstance = new ConvertToViewData()
    .query(query)
    .name(name)
    .description(description)
    .documentationLink(documentationLink)
    .viewParameters(viewParameters)
    .otherParameters(otherParameters)
    .startingVariableName(startingVariableName);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)