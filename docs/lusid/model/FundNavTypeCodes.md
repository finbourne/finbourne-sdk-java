# com.finbourne.sdk.services.lusid.model.FundNavTypeCodes
classname FundNavTypeCodes
A fund resolved by a filtered fund list, with the NAV type codes matched by the list's hint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**navTypeCodes** | **List&lt;String&gt;** |  | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.FundNavTypeCodes;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId fundId = new ResourceId();
@javax.annotation.Nullable List<String> navTypeCodes = new List<String>();


FundNavTypeCodes fundNavTypeCodesInstance = new FundNavTypeCodes()
    .fundId(fundId)
    .navTypeCodes(navTypeCodes);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)