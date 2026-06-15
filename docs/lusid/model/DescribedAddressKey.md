# com.finbourne.sdk.services.lusid.model.DescribedAddressKey
classname DescribedAddressKey
An address key with additional data describing what this key is for.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addressKey** | **String** | Address key of some underlying object e.g. Valuation/PV, Instrument/Features | [optional] [default to String]
**description** | **String** | Description of the address key. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.DescribedAddressKey;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String addressKey = "example addressKey";
@javax.annotation.Nullable String description = "example description";


DescribedAddressKey describedAddressKeyInstance = new DescribedAddressKey()
    .addressKey(addressKey)
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)