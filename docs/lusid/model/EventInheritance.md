# com.finbourne.sdk.services.lusid.model.EventInheritance
classname EventInheritance
The information that determines the rules for instrument event inheritance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parentCorporateActionSourceId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]

```java
import com.finbourne.sdk.services.lusid.model.EventInheritance;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId parentCorporateActionSourceId = new ResourceId();


EventInheritance eventInheritanceInstance = new EventInheritance()
    .parentCorporateActionSourceId(parentCorporateActionSourceId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)