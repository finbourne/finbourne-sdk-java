# com.finbourne.sdk.services.lusid.model.AccountedQuote
classname AccountedQuote
The Valuation Point quote response for a Fund, including the origin of the quote relative to the Valuation Point period.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quote** | [**Quote**](Quote.md) |  | [optional] [default to Quote]
**valuationPointOrigin** | **String** | Designates if the quote was originally part of the Valuation Point or if it was added as part of a Complex Close action. Available values: None, Original, Added, OriginalAndAdded. | [optional] [default to String]
**addedOriginValuationPointCode** | **String** | The Valuation Point code, only for quotes added as part of a Complex Close action. | [optional] [default to String]
**addedOriginValuationPointVariantCode** | **String** | The Valuation Point variant code, only for quotes added as part of a Complex Close action. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AccountedQuote;
import java.util.*;
import java.lang.System;
import java.net.URI;

Quote quote = new Quote();
@javax.annotation.Nullable String valuationPointOrigin = "example valuationPointOrigin";
@javax.annotation.Nullable String addedOriginValuationPointCode = "example addedOriginValuationPointCode";
@javax.annotation.Nullable String addedOriginValuationPointVariantCode = "example addedOriginValuationPointVariantCode";


AccountedQuote accountedQuoteInstance = new AccountedQuote()
    .quote(quote)
    .valuationPointOrigin(valuationPointOrigin)
    .addedOriginValuationPointCode(addedOriginValuationPointCode)
    .addedOriginValuationPointVariantCode(addedOriginValuationPointVariantCode);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)