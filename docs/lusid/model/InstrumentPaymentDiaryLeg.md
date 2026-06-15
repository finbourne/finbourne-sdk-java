# com.finbourne.sdk.services.lusid.model.InstrumentPaymentDiaryLeg
classname InstrumentPaymentDiaryLeg
A leg containing a set of cashflows.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**legIndex** | **Integer** | Index (integer) for the leg of a payment diary. | [optional] [default to Integer]
**legId** | **String** | Identifier string for the leg of a payment diary. | [optional] [default to String]
**rows** | [**List&lt;InstrumentPaymentDiaryRow&gt;**](InstrumentPaymentDiaryRow.md) | List of individual cashflows within the payment diary. | [optional] [default to List<InstrumentPaymentDiaryRow>]

```java
import com.finbourne.sdk.services.lusid.model.InstrumentPaymentDiaryLeg;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer legIndex = new Integer("100.00");
@javax.annotation.Nullable String legId = "example legId";
@javax.annotation.Nullable List<InstrumentPaymentDiaryRow> rows = new List<InstrumentPaymentDiaryRow>();


InstrumentPaymentDiaryLeg instrumentPaymentDiaryLegInstance = new InstrumentPaymentDiaryLeg()
    .legIndex(legIndex)
    .legId(legId)
    .rows(rows);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)