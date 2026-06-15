# com.finbourne.sdk.services.lusid.model.ComplianceTemplateParameter
classname ComplianceTemplateParameter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name for the required Compliance Template Parameter | [default to String]
**description** | **String** | The description for the required Compliance Template Parameter | [default to String]
**type** | **String** | The type for the required Compliance Template Parameter | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceTemplateParameter;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
String description = "example description";
String type = "example type";


ComplianceTemplateParameter complianceTemplateParameterInstance = new ComplianceTemplateParameter()
    .name(name)
    .description(description)
    .type(type);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)