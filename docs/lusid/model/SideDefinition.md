# com.finbourne.sdk.services.lusid.model.SideDefinition
classname SideDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**side** | **String** | A unique label identifying the side definition. | [default to String]
**security** | **String** | The field or property key defining the side&#39;s security, or instrument. | [default to String]
**currency** | **String** | The field or property key defining the side&#39;s currency. | [default to String]
**rate** | **String** | The field or property key defining the side&#39;s rate. | [default to String]
**units** | **String** | The value, field or property key defining the side&#39;s units. | [default to String]
**amount** | **String** | The value, field or property key defining the side&#39;s amount | [default to String]
**notionalAmount** | **String** | The value, field or property key defining the side&#39;s notional amount | [optional] [default to String]
**currentFace** | **String** | The value, field or property key defining the side&#39;s current face / outstanding notional. | [optional] [default to String]
**scope** | **String** | The scope in which the side definition exists. | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.SideDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String side = "example side";
String security = "example security";
String currency = "example currency";
String rate = "example rate";
String units = "example units";
String amount = "example amount";
@javax.annotation.Nullable String notionalAmount = "example notionalAmount";
@javax.annotation.Nullable String currentFace = "example currentFace";
@javax.annotation.Nullable String scope = "example scope";
@javax.annotation.Nullable List<Link> links = new List<Link>();


SideDefinition sideDefinitionInstance = new SideDefinition()
    .side(side)
    .security(security)
    .currency(currency)
    .rate(rate)
    .units(units)
    .amount(amount)
    .notionalAmount(notionalAmount)
    .currentFace(currentFace)
    .scope(scope)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)