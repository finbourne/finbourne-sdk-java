# com.finbourne.sdk.services.lusid.model.ExternalRecType
classname ExternalRecType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name for this external reconciliation describing source data. | [default to String]
**temporality** | **String** | How the reconciliation reads its data: PointInTime (the latest state as at the instance&#39;s effectiveAt, the default) or Activity (everything effective across the instance&#39;s activity window). Available values: PointInTime, Activity. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ExternalRecType;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
@javax.annotation.Nullable String temporality = "example temporality";


ExternalRecType externalRecTypeInstance = new ExternalRecType()
    .name(name)
    .temporality(temporality);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)