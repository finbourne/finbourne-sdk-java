# com.finbourne.sdk.services.lusid.model.CalculateOrderDatesRequest
classname CalculateOrderDatesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentIdentifierType** | **String** |  | [default to String]
**instrumentIdentifier** | **String** |  | [default to String]
**instrumentScope** | **String** |  | [optional] [default to String]
**receivedDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**priceDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**transactionCategory** | **String** | Available values: Subscription, Redemption, SwitchOut, SwitchIn, TransferOut, TransferIn. | [optional] [default to String]
**liquidatingShareClassIdentifier** | **String** |  | [optional] [default to String]
**liquidatingShareClassIdentifierType** | **String** |  | [optional] [default to String]
**liquidatingShareClassInstrumentScope** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CalculateOrderDatesRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String instrumentIdentifierType = "example instrumentIdentifierType";
String instrumentIdentifier = "example instrumentIdentifier";
@javax.annotation.Nullable String instrumentScope = "example instrumentScope";
@javax.annotation.Nullable OffsetDateTime receivedDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime priceDate = OffsetDateTime.now();
@javax.annotation.Nullable String transactionCategory = "example transactionCategory";
@javax.annotation.Nullable String liquidatingShareClassIdentifier = "example liquidatingShareClassIdentifier";
@javax.annotation.Nullable String liquidatingShareClassIdentifierType = "example liquidatingShareClassIdentifierType";
@javax.annotation.Nullable String liquidatingShareClassInstrumentScope = "example liquidatingShareClassInstrumentScope";


CalculateOrderDatesRequest calculateOrderDatesRequestInstance = new CalculateOrderDatesRequest()
    .instrumentIdentifierType(instrumentIdentifierType)
    .instrumentIdentifier(instrumentIdentifier)
    .instrumentScope(instrumentScope)
    .receivedDate(receivedDate)
    .priceDate(priceDate)
    .transactionCategory(transactionCategory)
    .liquidatingShareClassIdentifier(liquidatingShareClassIdentifier)
    .liquidatingShareClassIdentifierType(liquidatingShareClassIdentifierType)
    .liquidatingShareClassInstrumentScope(liquidatingShareClassInstrumentScope);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)