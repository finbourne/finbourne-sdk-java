# com.finbourne.sdk.services.lusid.model.WithholdingTaxRateSplit
classname WithholdingTaxRateSplit

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stopAtSourceRate** | **java.math.BigDecimal** | The rate withheld at source. | [default to java.math.BigDecimal]
**irrecoverableRate** | **java.math.BigDecimal** | The part of the country rate that cannot be recovered. | [default to java.math.BigDecimal]
**reliefAtSourceRate** | **java.math.BigDecimal** | The part of the country rate relieved at source. | [default to java.math.BigDecimal]
**reclaimableRate** | **java.math.BigDecimal** | The part of the rate withheld at source that can be reclaimed. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.WithholdingTaxRateSplit;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal stopAtSourceRate = new java.math.BigDecimal("100.00");
java.math.BigDecimal irrecoverableRate = new java.math.BigDecimal("100.00");
java.math.BigDecimal reliefAtSourceRate = new java.math.BigDecimal("100.00");
java.math.BigDecimal reclaimableRate = new java.math.BigDecimal("100.00");


WithholdingTaxRateSplit withholdingTaxRateSplitInstance = new WithholdingTaxRateSplit()
    .stopAtSourceRate(stopAtSourceRate)
    .irrecoverableRate(irrecoverableRate)
    .reliefAtSourceRate(reliefAtSourceRate)
    .reclaimableRate(reclaimableRate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)