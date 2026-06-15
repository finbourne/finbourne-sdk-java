# com.finbourne.sdk.services.horizon.model.OpenFigiData
classname OpenFigiData
OpenFIGI data structure

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**figi** | **String** | FIGI assigned to the instrument. | [default to String]
**name** | **String** | Various attributes of the instrument | [optional] [default to String]
**ticker** | **String** | Various attributes of the instrument | [optional] [default to String]
**exchangeCode** | **String** | Exchange code of the desired instrument(s) | [optional] [default to String]
**mic** | **String** | ISO market identification code(MIC) of the desired instrument(s) | [optional] [default to String]
**exchangeName** | **String** | Exchange name of the desired instrument(s) | [optional] [default to String]
**marketSector** | **String** | Market sector description of the desired instrument(s) | [optional] [default to String]
**generalSecurityType** | **String** | Enum-like attributes of the instrument | [optional] [default to String]
**securityType** | **String** | Enum-like attributes of the instrument | [optional] [default to String]
**securityDescription** | **String** | Various attributes of the instrument | [optional] [default to String]
**compositeFigi** | **String** | Various attributes of the instrument | [optional] [default to String]
**shareClassFigi** | **String** | Various attributes of the instrument | [optional] [default to String]
**matchType** | **String** | Type that the instrument matched against | [optional] [default to String]
**searchInput** | **String** | Search input used to generate this response | [optional] [default to String]
**lusidInstrumentId** | **String** | If an instrument with this FIGI exists, the LUID of that instrument in LUSID | [optional] [default to String]
**lusidInstrumentScope** | **String** | If an instrument with this FIGI exists, the Scope of that instrument in LUSID | [optional] [default to String]

```java
import com.finbourne.sdk.services.horizon.model.OpenFigiData;
import java.util.*;
import java.lang.System;
import java.net.URI;

String figi = "example figi";
@javax.annotation.Nullable String name = "example name";
@javax.annotation.Nullable String ticker = "example ticker";
@javax.annotation.Nullable String exchangeCode = "example exchangeCode";
@javax.annotation.Nullable String mic = "example mic";
@javax.annotation.Nullable String exchangeName = "example exchangeName";
@javax.annotation.Nullable String marketSector = "example marketSector";
@javax.annotation.Nullable String generalSecurityType = "example generalSecurityType";
@javax.annotation.Nullable String securityType = "example securityType";
@javax.annotation.Nullable String securityDescription = "example securityDescription";
@javax.annotation.Nullable String compositeFigi = "example compositeFigi";
@javax.annotation.Nullable String shareClassFigi = "example shareClassFigi";
@javax.annotation.Nullable String matchType = "example matchType";
@javax.annotation.Nullable String searchInput = "example searchInput";
@javax.annotation.Nullable String lusidInstrumentId = "example lusidInstrumentId";
@javax.annotation.Nullable String lusidInstrumentScope = "example lusidInstrumentScope";


OpenFigiData openFigiDataInstance = new OpenFigiData()
    .figi(figi)
    .name(name)
    .ticker(ticker)
    .exchangeCode(exchangeCode)
    .mic(mic)
    .exchangeName(exchangeName)
    .marketSector(marketSector)
    .generalSecurityType(generalSecurityType)
    .securityType(securityType)
    .securityDescription(securityDescription)
    .compositeFigi(compositeFigi)
    .shareClassFigi(shareClassFigi)
    .matchType(matchType)
    .searchInput(searchInput)
    .lusidInstrumentId(lusidInstrumentId)
    .lusidInstrumentScope(lusidInstrumentScope);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)