# com.finbourne.sdk.services.lusid.model.UpsertPersonRequest
classname UpsertPersonRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifiers** | [**Map&lt;String, Property&gt;**](Property.md) | The identifiers the person will be upserted with.The provided keys should be idTypeScope, idTypeCode, code | [default to Map<String, Property>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties associated to the Person. There can be multiple properties associated with a property key. | [optional] [default to Map<String, Property>]
**displayName** | **String** | The display name of the Person | [default to String]
**description** | **String** | The description of the Person | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.UpsertPersonRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, Property> identifiers = new Map<String, Property>();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";


UpsertPersonRequest upsertPersonRequestInstance = new UpsertPersonRequest()
    .identifiers(identifiers)
    .properties(properties)
    .displayName(displayName)
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)