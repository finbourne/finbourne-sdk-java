# com.finbourne.sdk.services.lusid.model.SideDefinitionRequest
classname SideDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**security** | **String** | The field or property key defining the side&#39;s security, or instrument. | [default to String]
**currency** | **String** | The field or property key defining the side&#39;s currency. | [default to String]
**rate** | **String** | The field or property key defining the side&#39;s rate. | [default to String]
**units** | **String** | The value, field or property key defining the side&#39;s units. | [default to String]
**amount** | **String** | The value, field or property key defining the side&#39;s amount | [default to String]
**notionalAmount** | **String** | The value, field or property key defining the side&#39;s notional amount | [optional] [default to String]
**currentFace** | **String** | The value, field or property key defining the side&#39;s current face / outstanding notional. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.SideDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String security = "example security";
String currency = "example currency";
String rate = "example rate";
String units = "example units";
String amount = "example amount";
@javax.annotation.Nullable String notionalAmount = "example notionalAmount";
@javax.annotation.Nullable String currentFace = "example currentFace";


SideDefinitionRequest sideDefinitionRequestInstance = new SideDefinitionRequest()
    .security(security)
    .currency(currency)
    .rate(rate)
    .units(units)
    .amount(amount)
    .notionalAmount(notionalAmount)
    .currentFace(currentFace);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)