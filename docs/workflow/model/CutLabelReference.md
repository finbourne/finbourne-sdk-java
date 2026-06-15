# com.finbourne.sdk.services.workflow.model.CutLabelReference
classname CutLabelReference
A reference to a Cut Label in LUSID. The time zone of the Cut Label will be used

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | Code of the Cut Label | [default to String]
**type** | **String** | The type of Time of Day | [default to String]

```java
import com.finbourne.sdk.services.workflow.model.CutLabelReference;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
String type = "example type";


CutLabelReference cutLabelReferenceInstance = new CutLabelReference()
    .code(code)
    .type(type);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)