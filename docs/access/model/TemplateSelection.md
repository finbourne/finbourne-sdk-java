# com.finbourne.sdk.services.access.model.TemplateSelection
classname TemplateSelection
A template selection, identifying a policy template to use for generation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | Scope identifying policy template to use for generation | [default to String]
**code** | **String** | Code identifying policy template to use for generation | [default to String]
**selectorTags** | **List&lt;String&gt;** | List of selector tags to optionally filter in the template generation  (Eg: Feature, Data, etc) | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.access.model.TemplateSelection;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scope = "example scope";
String code = "example code";
@javax.annotation.Nullable List<String> selectorTags = new List<String>();


TemplateSelection templateSelectionInstance = new TemplateSelection()
    .scope(scope)
    .code(code)
    .selectorTags(selectorTags);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)