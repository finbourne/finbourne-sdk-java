# com.finbourne.sdk.services.lusid.model.EquityAllOfIdentifiers
classname EquityAllOfIdentifiers
External market codes and identifiers for the equity, e.g. IBM

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lusidInstrumentId** | **String** |  | [optional] [default to String]
**isin** | **String** |  | [optional] [default to String]
**sedol** | **String** |  | [optional] [default to String]
**cusip** | **String** |  | [optional] [default to String]
**clientInternal** | **String** |  | [optional] [default to String]
**figi** | **String** |  | [optional] [default to String]
**RIC** | **String** |  | [optional] [default to String]
**quotePermId** | **String** |  | [optional] [default to String]
**reDCode** | **String** |  | [optional] [default to String]
**bbGId** | **String** |  | [optional] [default to String]
**icECode** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.EquityAllOfIdentifiers;
import java.util.*;
import java.lang.System;
import java.net.URI;

String lusidInstrumentId = "example lusidInstrumentId";
String isin = "example isin";
String sedol = "example sedol";
String cusip = "example cusip";
String clientInternal = "example clientInternal";
String figi = "example figi";
String rIC = "example rIC";
String quotePermId = "example quotePermId";
String reDCode = "example reDCode";
String bbGId = "example bbGId";
String icECode = "example icECode";


EquityAllOfIdentifiers equityAllOfIdentifiersInstance = new EquityAllOfIdentifiers()
    .lusidInstrumentId(lusidInstrumentId)
    .isin(isin)
    .sedol(sedol)
    .cusip(cusip)
    .clientInternal(clientInternal)
    .figi(figi)
    .rIC(rIC)
    .quotePermId(quotePermId)
    .reDCode(reDCode)
    .bbGId(bbGId)
    .icECode(icECode);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)