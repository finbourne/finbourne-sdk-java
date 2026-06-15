# com.finbourne.sdk.services.access.model.RequestedActionKey
classname RequestedActionKey
A fully qualified action identifier

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityCode** | **String** | The type of the resource on which the activity would be performed | [default to String]
**scope** | **String** | The scope/provider/vendor of the activity | [default to String]
**activity** | **String** | The identifier of the action to be performed on the resource | [default to String]

```java
import com.finbourne.sdk.services.access.model.RequestedActionKey;
import java.util.*;
import java.lang.System;
import java.net.URI;

String entityCode = "example entityCode";
String scope = "example scope";
String activity = "example activity";


RequestedActionKey requestedActionKeyInstance = new RequestedActionKey()
    .entityCode(entityCode)
    .scope(scope)
    .activity(activity);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)