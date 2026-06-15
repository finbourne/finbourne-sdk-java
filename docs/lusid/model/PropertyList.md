# com.finbourne.sdk.services.lusid.model.PropertyList
classname PropertyList

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceListType** | **String** | The reference list values. Available values: PortfolioGroupIdList, PortfolioIdList, AddressKeyList, StringList, InstrumentList, DecimalList, PropertyList, FundIdList, FilteredFundIdList. | [default to String]
**values** | [**List&lt;Property&gt;**](Property.md) |  | [default to List<Property>]

```java
import com.finbourne.sdk.services.lusid.model.PropertyList;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<Property> values = new List<Property>();


PropertyList propertyListInstance = new PropertyList()
    .values(values);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)