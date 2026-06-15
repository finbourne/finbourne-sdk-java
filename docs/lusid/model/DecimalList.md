# com.finbourne.sdk.services.lusid.model.DecimalList
classname DecimalList

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceListType** | **String** | The reference list values. Available values: PortfolioGroupIdList, PortfolioIdList, AddressKeyList, StringList, InstrumentList, DecimalList, PropertyList, FundIdList, FilteredFundIdList. | [default to String]
**values** | **List&lt;java.math.BigDecimal&gt;** |  | [default to List<java.math.BigDecimal>]

```java
import com.finbourne.sdk.services.lusid.model.DecimalList;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<java.math.BigDecimal> values = new List<java.math.BigDecimal>();


DecimalList decimalListInstance = new DecimalList()
    .values(values);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)