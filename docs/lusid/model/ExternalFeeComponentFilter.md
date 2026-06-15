# com.finbourne.sdk.services.lusid.model.ExternalFeeComponentFilter
classname ExternalFeeComponentFilter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filterId** | **String** |  | [default to String]
**filter** | **String** |  | [default to String]
**appliesTo** | **String** | Available values: Undefined, PnLBucket, Fees. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ExternalFeeComponentFilter;
import java.util.*;
import java.lang.System;
import java.net.URI;

String filterId = "example filterId";
String filter = "example filter";
String appliesTo = "example appliesTo";


ExternalFeeComponentFilter externalFeeComponentFilterInstance = new ExternalFeeComponentFilter()
    .filterId(filterId)
    .filter(filter)
    .appliesTo(appliesTo);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)