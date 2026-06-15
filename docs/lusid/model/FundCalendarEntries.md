# com.finbourne.sdk.services.lusid.model.FundCalendarEntries
classname FundCalendarEntries

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundCalendarEntriesType** | **String** | The type of the Calendar Entry. Available values: FinalisedValuationPoint, FundEstimateValuationPoint, FundBookmark. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.FundCalendarEntries;
import java.util.*;
import java.lang.System;
import java.net.URI;

String fundCalendarEntriesType = "example fundCalendarEntriesType";


FundCalendarEntries fundCalendarEntriesInstance = new FundCalendarEntries()
    .fundCalendarEntriesType(fundCalendarEntriesType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)