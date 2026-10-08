# com.finbourne.sdk.services.workflow.model.InstantiateRec
classname InstantiateRec
Configuration for a Worker that requests the instantiation of a rec definition in LUSID

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [default to String]

```java
import com.finbourne.sdk.services.workflow.model.InstantiateRec;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";


InstantiateRec instantiateRecInstance = new InstantiateRec()
    .type(type);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)