# com.finbourne.sdk.services.lusid.model.ReferenceList
classname ReferenceList

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceListType** | **String** | The reference list values. Available values: PortfolioGroupIdList, PortfolioIdList, AddressKeyList, StringList, InstrumentList, DecimalList, PropertyList, FundIdList, FilteredFundIdList. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ReferenceList;
import java.util.*;
import java.lang.System;
import java.net.URI;

String referenceListType = "example referenceListType";


ReferenceList referenceListInstance = new ReferenceList()
    .referenceListType(referenceListType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)