# com.finbourne.sdk.services.lusid.model.FundDetails
classname FundDetails
The details of a Fund.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | The currency of the fund which is the same as the base currency of all the portfolios of the fund&#39;s Abor. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.FundDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String currency = "example currency";


FundDetails fundDetailsInstance = new FundDetails()
    .currency(currency);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)