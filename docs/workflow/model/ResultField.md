# com.finbourne.sdk.services.workflow.model.ResultField
classname ResultField
Defines a Worker Result Field

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name | [default to String]
**type** | **String** | The type of this Parameter | [default to String]
**displayName** | **String** | DisplayName | [optional] [default to String]
**description** | **String** | Description | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.ResultField;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
String type = "example type";
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";


ResultField resultFieldInstance = new ResultField()
    .name(name)
    .type(type)
    .displayName(displayName)
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)