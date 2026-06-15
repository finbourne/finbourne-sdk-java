# com.finbourne.sdk.services.lusid.model.SetPersonPropertiesRequest
classname SetPersonPropertiesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Properties to set for a Person. All time-variant properties must have same EffectiveFrom date. Properties not included in the request will not be amended. | [default to Map<String, Property>]

```java
import com.finbourne.sdk.services.lusid.model.SetPersonPropertiesRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, Property> properties = new Map<String, Property>();


SetPersonPropertiesRequest setPersonPropertiesRequestInstance = new SetPersonPropertiesRequest()
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)