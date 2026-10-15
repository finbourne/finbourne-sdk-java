# com.finbourne.sdk.services.lusid.model.ManagementFeeLine
classname ManagementFeeLine
One partner's management fee for the period.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record the fee belongs to. | [default to String]
**basisAmount** | **java.math.BigDecimal** | The capital the fee was charged on. | [default to java.math.BigDecimal]
**rate** | **java.math.BigDecimal** | The annual fee rate applied. | [default to java.math.BigDecimal]
**dayCountFraction** | **java.math.BigDecimal** | The fraction of a year the period covers, on an ACT/365 basis. | [default to java.math.BigDecimal]
**gross** | **java.math.BigDecimal** | The fee before offsets. | [default to java.math.BigDecimal]
**offset** | **java.math.BigDecimal** | The offset applied to the fee. | [default to java.math.BigDecimal]
**net** | **java.math.BigDecimal** | The fee after offsets. | [default to java.math.BigDecimal]
**carriedForward** | **java.math.BigDecimal** | Offset in excess of the fee, carried forward to the next period. | [default to java.math.BigDecimal]
**waived** | **Boolean** | Whether the partner is fee-exempt and the fee was waived. | [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.ManagementFeeLine;
import java.util.*;
import java.lang.System;
import java.net.URI;

String investorRecordId = "example investorRecordId";
java.math.BigDecimal basisAmount = new java.math.BigDecimal("100.00");
java.math.BigDecimal rate = new java.math.BigDecimal("100.00");
java.math.BigDecimal dayCountFraction = new java.math.BigDecimal("100.00");
java.math.BigDecimal gross = new java.math.BigDecimal("100.00");
java.math.BigDecimal offset = new java.math.BigDecimal("100.00");
java.math.BigDecimal net = new java.math.BigDecimal("100.00");
java.math.BigDecimal carriedForward = new java.math.BigDecimal("100.00");
Boolean waived = true;


ManagementFeeLine managementFeeLineInstance = new ManagementFeeLine()
    .investorRecordId(investorRecordId)
    .basisAmount(basisAmount)
    .rate(rate)
    .dayCountFraction(dayCountFraction)
    .gross(gross)
    .offset(offset)
    .net(net)
    .carriedForward(carriedForward)
    .waived(waived);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)