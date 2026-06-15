# com.finbourne.sdk.services.lusid.model.QuoteId
classname QuoteId
The unique identifier of the quote.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quoteSeriesId** | [**QuoteSeriesId**](QuoteSeriesId.md) |  | [default to QuoteSeriesId]
**effectiveAt** | **String** | The effective datetime or cut label at which the quote is valid from. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.QuoteId;
import java.util.*;
import java.lang.System;
import java.net.URI;

QuoteSeriesId quoteSeriesId = new QuoteSeriesId();
String effectiveAt = "example effectiveAt";


QuoteId quoteIdInstance = new QuoteId()
    .quoteSeriesId(quoteSeriesId)
    .effectiveAt(effectiveAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)