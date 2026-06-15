# com.finbourne.sdk.services.lusid.model.A2BCategory
classname A2BCategory
A2B Category - one of the five major categories in the A2BDataRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**holdingCurrency** | [**A2BBreakdown**](A2BBreakdown.md) |  | [optional] [default to A2BBreakdown]
**portfolioCurrency** | [**A2BBreakdown**](A2BBreakdown.md) |  | [optional] [default to A2BBreakdown]

```java
import com.finbourne.sdk.services.lusid.model.A2BCategory;
import java.util.*;
import java.lang.System;
import java.net.URI;

A2BBreakdown holdingCurrency = new A2BBreakdown();
A2BBreakdown portfolioCurrency = new A2BBreakdown();


A2BCategory a2BCategoryInstance = new A2BCategory()
    .holdingCurrency(holdingCurrency)
    .portfolioCurrency(portfolioCurrency);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)