# com.finbourne.sdk.services.scheduler.model.ScanSummary
classname ScanSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fixable** | **Integer** | The number of vulnerabilities that have a known fix | [optional] [default to Integer]
**total** | **Integer** | The total number of vulnerabilities | [optional] [default to Integer]
**critical** | **Integer** | The number of Critical severity vulnerabilities | [optional] [default to Integer]
**high** | **Integer** | The number of High severity vulnerabilities | [optional] [default to Integer]
**medium** | **Integer** | The number of Medium severity vulnerabilities | [optional] [default to Integer]
**low** | **Integer** | The number of Low severity vulnerabilities | [optional] [default to Integer]
**negligible** | **Integer** | The number of Negligible severity vulnerabilities | [optional] [default to Integer]
**unknown** | **Integer** | The number of Unknown severity vulnerabilities | [optional] [default to Integer]

```java
import com.finbourne.sdk.services.scheduler.model.ScanSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Integer fixable = new Integer("100.00");
@javax.annotation.Nullable Integer total = new Integer("100.00");
@javax.annotation.Nullable Integer critical = new Integer("100.00");
@javax.annotation.Nullable Integer high = new Integer("100.00");
@javax.annotation.Nullable Integer medium = new Integer("100.00");
@javax.annotation.Nullable Integer low = new Integer("100.00");
@javax.annotation.Nullable Integer negligible = new Integer("100.00");
@javax.annotation.Nullable Integer unknown = new Integer("100.00");


ScanSummary scanSummaryInstance = new ScanSummary()
    .fixable(fixable)
    .total(total)
    .critical(critical)
    .high(high)
    .medium(medium)
    .low(low)
    .negligible(negligible)
    .unknown(unknown);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)