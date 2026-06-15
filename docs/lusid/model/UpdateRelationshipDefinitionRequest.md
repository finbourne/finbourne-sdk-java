# com.finbourne.sdk.services.lusid.model.UpdateRelationshipDefinitionRequest
classname UpdateRelationshipDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The display name of the relation. | [default to String]
**outwardDescription** | **String** | The description to relate source entity object and target entity object. | [default to String]
**inwardDescription** | **String** | The description to relate target entity object and source entity object. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.UpdateRelationshipDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
String outwardDescription = "example outwardDescription";
String inwardDescription = "example inwardDescription";


UpdateRelationshipDefinitionRequest updateRelationshipDefinitionRequestInstance = new UpdateRelationshipDefinitionRequest()
    .displayName(displayName)
    .outwardDescription(outwardDescription)
    .inwardDescription(inwardDescription);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)