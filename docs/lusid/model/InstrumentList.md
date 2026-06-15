# com.finbourne.sdk.services.lusid.model.InstrumentList
classname InstrumentList

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceListType** | **String** | The reference list values. Available values: PortfolioGroupIdList, PortfolioIdList, AddressKeyList, StringList, InstrumentList, DecimalList, PropertyList, FundIdList, FilteredFundIdList. | [default to String]
**values** | **List&lt;String&gt;** |  | [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.InstrumentList;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> values = new List<String>();


InstrumentList instrumentListInstance = new InstrumentList()
    .values(values);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)