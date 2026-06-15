# com.finbourne.sdk.services.lusid.model.CashFlowLineage
classname CashFlowLineage
Lineage for cash flow value

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | The instrument type of the instrument to which the cash flow belongs to. When upserting CashFlowValues, this  should be null. | [optional] [default to String]
**cashFlowType** | **String** | The cashflow type.When upserting CashFlowValues, this should be null, or one of [Unknown, Coupon, Notional,  Premium, Principal, Protection, Cash] | [optional] [default to String]
**instrumentId** | **String** | The LUID of the instrument to which the cash flow belongs to. When upserting this should be null. | [optional] [default to String]
**legId** | **String** | The leg id to which the cash flow belongs to. | [optional] [default to String]
**sourceTransactionId** | **String** | The source transaction of the instrument to which the cash flow belongs to. When upserting this should be null | [optional] [default to String]
**payReceive** | **String** | Does the cash flow belong to the Pay or Receive leg. When upserting this should either be null or one of [Pay, Receive, NotApplicable] | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CashFlowLineage;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String instrumentType = "example instrumentType";
@javax.annotation.Nullable String cashFlowType = "example cashFlowType";
@javax.annotation.Nullable String instrumentId = "example instrumentId";
@javax.annotation.Nullable String legId = "example legId";
@javax.annotation.Nullable String sourceTransactionId = "example sourceTransactionId";
@javax.annotation.Nullable String payReceive = "example payReceive";


CashFlowLineage cashFlowLineageInstance = new CashFlowLineage()
    .instrumentType(instrumentType)
    .cashFlowType(cashFlowType)
    .instrumentId(instrumentId)
    .legId(legId)
    .sourceTransactionId(sourceTransactionId)
    .payReceive(payReceive);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)