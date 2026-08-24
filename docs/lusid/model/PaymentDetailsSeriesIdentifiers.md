# com.finbourne.sdk.services.lusid.model.PaymentDetailsSeriesIdentifiers
classname PaymentDetailsSeriesIdentifiers
The two hardcoded series identifier keys that uniquely identify a Payment Details data series.  The currency value must match the top-level currency field on the Payment Instruction.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentType** | **String** | The type of payment series. | [default to String]
**currency** | **String** | ISO 4217 currency code identifying the currency-specific series row. Must match the top-level currency field. | [default to String]
**custodianAccountScope** | **String** | Optional. The scope of the custodian account on the portfolio. Only permitted when the applicable entity is a Portfolio. | [optional] [default to String]
**custodianAccountCode** | **String** | Optional. The code of the custodian account on the portfolio. Only permitted when the applicable entity is a Portfolio. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PaymentDetailsSeriesIdentifiers;
import java.util.*;
import java.lang.System;
import java.net.URI;

String paymentType = "example paymentType";
String currency = "example currency";
@javax.annotation.Nullable String custodianAccountScope = "example custodianAccountScope";
@javax.annotation.Nullable String custodianAccountCode = "example custodianAccountCode";


PaymentDetailsSeriesIdentifiers paymentDetailsSeriesIdentifiersInstance = new PaymentDetailsSeriesIdentifiers()
    .paymentType(paymentType)
    .currency(currency)
    .custodianAccountScope(custodianAccountScope)
    .custodianAccountCode(custodianAccountCode);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)