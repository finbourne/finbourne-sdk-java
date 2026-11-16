# com.finbourne.sdk.services.lusid.model.PartnerAllocationPoolSources
classname PartnerAllocationPoolSources
The amount reaching a pool by each route: its bucket's lines, lines tagged with its character and lines allocated  directly to one partner.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucket** | **java.math.BigDecimal** | The amount reaching the pool from the lines its bucket&#39;s rule placed. | [default to java.math.BigDecimal]
**lineTag** | **java.math.BigDecimal** | The amount reaching the pool from lines tagged with its character. | [default to java.math.BigDecimal]
**direct** | **java.math.BigDecimal** | The amount reaching the pool from lines allocated directly to one partner. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.PartnerAllocationPoolSources;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal bucket = new java.math.BigDecimal("100.00");
java.math.BigDecimal lineTag = new java.math.BigDecimal("100.00");
java.math.BigDecimal direct = new java.math.BigDecimal("100.00");


PartnerAllocationPoolSources partnerAllocationPoolSourcesInstance = new PartnerAllocationPoolSources()
    .bucket(bucket)
    .lineTag(lineTag)
    .direct(direct);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)