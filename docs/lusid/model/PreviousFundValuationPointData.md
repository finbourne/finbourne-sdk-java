# com.finbourne.sdk.services.lusid.model.PreviousFundValuationPointData
classname PreviousFundValuationPointData
The data for a Fund at the previous valuation point.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nav** | [**FundPreviousNAV**](FundPreviousNAV.md) |  | [default to FundPreviousNAV]

```java
import com.finbourne.sdk.services.lusid.model.PreviousFundValuationPointData;
import java.util.*;
import java.lang.System;
import java.net.URI;

FundPreviousNAV nav = new FundPreviousNAV();


PreviousFundValuationPointData previousFundValuationPointDataInstance = new PreviousFundValuationPointData()
    .nav(nav);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)