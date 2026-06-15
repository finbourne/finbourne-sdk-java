# com.finbourne.sdk.services.workflow.model.TriggerSchema
classname TriggerSchema
Triggers can operate in response to different stimuli

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of Trigger; available value(s): External | [default to String]

```java
import com.finbourne.sdk.services.workflow.model.TriggerSchema;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";


TriggerSchema triggerSchemaInstance = new TriggerSchema()
    .type(type);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)