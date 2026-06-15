# com.finbourne.sdk.services.lusid.model.AddressKeyList
classname AddressKeyList

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceListType** | **String** | The reference list values. Available values: PortfolioGroupIdList, PortfolioIdList, AddressKeyList, StringList, InstrumentList, DecimalList, PropertyList, FundIdList, FilteredFundIdList. | [default to String]
**values** | **List&lt;String&gt;** |  | [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.AddressKeyList;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> values = new List<String>();


AddressKeyList addressKeyListInstance = new AddressKeyList()
    .values(values);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)