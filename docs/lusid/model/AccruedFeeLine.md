# com.finbourne.sdk.services.lusid.model.AccruedFeeLine
classname AccruedFeeLine
A management fee accrued to one partner that the run left to its accrual rather than pooling.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The partner the fee was accrued to, when the accrual names one. | [optional] [default to String]
**amount** | **java.math.BigDecimal** | The fee accrued to the partner, as the journal debits it. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.AccruedFeeLine;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String investorRecordId = "example investorRecordId";
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");


AccruedFeeLine accruedFeeLineInstance = new AccruedFeeLine()
    .investorRecordId(investorRecordId)
    .amount(amount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)