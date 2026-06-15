# com.finbourne.sdk.services.lusid.model.MarketContextSuppliers
classname MarketContextSuppliers
It is possible to control which supplier is used for a given asset class.  This field is deprecated in favour of market data rules, which subsumes its functionality.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commodity** | **String** |  | [optional] [default to String]
**credit** | **String** |  | [optional] [default to String]
**equity** | **String** |  | [optional] [default to String]
**fx** | **String** |  | [optional] [default to String]
**rates** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.MarketContextSuppliers;
import java.util.*;
import java.lang.System;
import java.net.URI;

String commodity = "example commodity";
String credit = "example credit";
String equity = "example equity";
String fx = "example fx";
String rates = "example rates";


MarketContextSuppliers marketContextSuppliersInstance = new MarketContextSuppliers()
    .commodity(commodity)
    .credit(credit)
    .equity(equity)
    .fx(fx)
    .rates(rates);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)