# com.finbourne.sdk.services.lusid.model.TaxReturnDisposalRow
classname TaxReturnDisposalRow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**holdingId** | **String** | The identifier of the holding. For a company this is the pooled LUSID instrument identifier, for a fund the portfolio code and instrument identifier. | [optional] [default to String]
**instrumentId** | **String** | The LUSID unique identifier of the instrument. | [optional] [default to String]
**instrumentName** | **String** | The name of the instrument. | [optional] [default to String]
**portfolioCode** | **String** | The code of the portfolio the holding sits in, or the pooled marker for a company. | [optional] [default to String]
**disposalDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the disposal. | [optional] [default to OffsetDateTime]
**units** | **java.math.BigDecimal** | The units disposed of. | [optional] [default to java.math.BigDecimal]
**cost** | **java.math.BigDecimal** | The allowable cost of the units disposed of. | [optional] [default to java.math.BigDecimal]
**indexationAllowanceTaken** | **java.math.BigDecimal** | The indexation allowance deducted when arriving at the chargeable gain. | [optional] [default to java.math.BigDecimal]
**chargeableGain** | **java.math.BigDecimal** | The chargeable gain or allowable loss on the disposal, negative for a loss. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.TaxReturnDisposalRow;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String holdingId = "example holdingId";
@javax.annotation.Nullable String instrumentId = "example instrumentId";
@javax.annotation.Nullable String instrumentName = "example instrumentName";
@javax.annotation.Nullable String portfolioCode = "example portfolioCode";
OffsetDateTime disposalDate = OffsetDateTime.now();
java.math.BigDecimal units = new java.math.BigDecimal("100.00");
java.math.BigDecimal cost = new java.math.BigDecimal("100.00");
java.math.BigDecimal indexationAllowanceTaken = new java.math.BigDecimal("100.00");
java.math.BigDecimal chargeableGain = new java.math.BigDecimal("100.00");


TaxReturnDisposalRow taxReturnDisposalRowInstance = new TaxReturnDisposalRow()
    .holdingId(holdingId)
    .instrumentId(instrumentId)
    .instrumentName(instrumentName)
    .portfolioCode(portfolioCode)
    .disposalDate(disposalDate)
    .units(units)
    .cost(cost)
    .indexationAllowanceTaken(indexationAllowanceTaken)
    .chargeableGain(chargeableGain);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)