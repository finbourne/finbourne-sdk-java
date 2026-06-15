# com.finbourne.sdk.services.horizon.model.PermIdData
classname PermIdData
PermId Data Structure

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**figi** | **String** | FIGI assigned to the instrument. | [default to String]
**ticker** | **String** | Ticker assigned to the instrument | [default to String]
**mic** | **String** | ISO market identification code(MIC) of the desired instrument(s) | [default to String]
**quotePermId** | **String** | QuotePermId of the instrument | [default to String]
**isPrimaryQuote** | **Boolean** | If the quote is primary | [default to Boolean]
**legalEntityIdentifier** | **String** | LEI assigned to the instrument | [optional] [default to String]

```java
import com.finbourne.sdk.services.horizon.model.PermIdData;
import java.util.*;
import java.lang.System;
import java.net.URI;

String figi = "example figi";
String ticker = "example ticker";
String mic = "example mic";
String quotePermId = "example quotePermId";
Boolean isPrimaryQuote = true;
@javax.annotation.Nullable String legalEntityIdentifier = "example legalEntityIdentifier";


PermIdData permIdDataInstance = new PermIdData()
    .figi(figi)
    .ticker(ticker)
    .mic(mic)
    .quotePermId(quotePermId)
    .isPrimaryQuote(isPrimaryQuote)
    .legalEntityIdentifier(legalEntityIdentifier);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)