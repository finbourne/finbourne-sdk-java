# com.finbourne.sdk.services.horizon.model.ProcessorDescription
classname ProcessorDescription
Represents a processor in the Horizon integration system.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | [default to String]
**displayName** | **String** |  | [default to String]
**description** | **String** |  | [default to String]
**category** | **String** |  | [default to String]
**isActive** | **Boolean** |  | [default to Boolean]

```java
import com.finbourne.sdk.services.horizon.model.ProcessorDescription;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
String displayName = "example displayName";
String description = "example description";
String category = "example category";
Boolean isActive = true;


ProcessorDescription processorDescriptionInstance = new ProcessorDescription()
    .name(name)
    .displayName(displayName)
    .description(description)
    .category(category)
    .isActive(isActive);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)