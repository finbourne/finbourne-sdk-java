# com.finbourne.sdk.services.lusid.model.SetLegalEntityPropertiesRequest
classname SetLegalEntityPropertiesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Properties to set for a Legal Entity. All time-variant properties must have same EffectiveFrom date. Properties not included in the request will not be amended. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.sdk.services.lusid.model.SetLegalEntityPropertiesRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();


SetLegalEntityPropertiesRequest setLegalEntityPropertiesRequestInstance = new SetLegalEntityPropertiesRequest()
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)