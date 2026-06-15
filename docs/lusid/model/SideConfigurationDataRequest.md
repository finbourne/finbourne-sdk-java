# com.finbourne.sdk.services.lusid.model.SideConfigurationDataRequest
classname SideConfigurationDataRequest
Configuration needed to define a side. Sides are referenced by Label. Beyond that, other properties  can be used to reference either transaction fields, or transaction properties.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**side** | **String** | The side&#39;s label. | [default to String]
**security** | **String** | The security, or instrument. | [default to String]
**currency** | **String** | The currency. | [default to String]
**rate** | **String** | The rate. | [default to String]
**units** | **String** | The units. | [default to String]
**amount** | **String** | The amount. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.SideConfigurationDataRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String side = "example side";
String security = "example security";
String currency = "example currency";
String rate = "example rate";
String units = "example units";
String amount = "example amount";


SideConfigurationDataRequest sideConfigurationDataRequestInstance = new SideConfigurationDataRequest()
    .side(side)
    .security(security)
    .currency(currency)
    .rate(rate)
    .units(units)
    .amount(amount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)