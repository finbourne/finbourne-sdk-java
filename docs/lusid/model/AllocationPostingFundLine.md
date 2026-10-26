# com.finbourne.sdk.services.lusid.model.AllocationPostingFundLine
classname AllocationPostingFundLine
One transaction a booking writes on the fund's own books.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The deterministic identifier of the posting: the booking reference, investor record, commitment line, component and side. | [optional] [default to String]
**portfolio** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**transactionType** | **String** | The transaction type the booking writes on the fund side, for instance PECall: the type the fund&#39;s configuration maps the partnership transaction type to. | [optional] [default to String]
**partnershipTransactionType** | **String** | The partnership transaction type the fund-side posting is classified as, for instance PA.ContributionCalled. | [optional] [default to String]
**amount** | **java.math.BigDecimal** | The amount posted, in the event currency. | [optional] [default to java.math.BigDecimal]
**component** | **String** | The component of the event the posting carries. | [optional] [default to String]
**investorRecordId** | **String** | The investor record the posting is for. | [optional] [default to String]
**viaVehicle** | **String** | The vehicle the investor&#39;s share reached the fund through, when it did not come direct. | [optional] [default to String]
**admissionVehicle** | **String** | The vehicle the investor was admitted to. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AllocationPostingFundLine;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String id = "example id";
ResourceId portfolio = new ResourceId();
@javax.annotation.Nullable String transactionType = "example transactionType";
@javax.annotation.Nullable String partnershipTransactionType = "example partnershipTransactionType";
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String component = "example component";
@javax.annotation.Nullable String investorRecordId = "example investorRecordId";
@javax.annotation.Nullable String viaVehicle = "example viaVehicle";
@javax.annotation.Nullable String admissionVehicle = "example admissionVehicle";


AllocationPostingFundLine allocationPostingFundLineInstance = new AllocationPostingFundLine()
    .id(id)
    .portfolio(portfolio)
    .transactionType(transactionType)
    .partnershipTransactionType(partnershipTransactionType)
    .amount(amount)
    .component(component)
    .investorRecordId(investorRecordId)
    .viaVehicle(viaVehicle)
    .admissionVehicle(admissionVehicle);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)