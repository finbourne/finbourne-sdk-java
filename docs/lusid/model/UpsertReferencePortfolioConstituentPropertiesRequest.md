# com.finbourne.sdk.services.lusid.model.UpsertReferencePortfolioConstituentPropertiesRequest
classname UpsertReferencePortfolioConstituentPropertiesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifiers** | **Map&lt;String, String&gt;** | A set of instrument identifiers that can resolve the constituent to a unique instrument. | [default to Map<String, String>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The updated collection of properties of the constituent. | [default to Map<String, PerpetualProperty>]

```java
import com.finbourne.sdk.services.lusid.model.UpsertReferencePortfolioConstituentPropertiesRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> identifiers = new Map<String, String>();
Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();


UpsertReferencePortfolioConstituentPropertiesRequest upsertReferencePortfolioConstituentPropertiesRequestInstance = new UpsertReferencePortfolioConstituentPropertiesRequest()
    .identifiers(identifiers)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)