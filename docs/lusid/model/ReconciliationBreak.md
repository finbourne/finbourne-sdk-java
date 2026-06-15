# com.finbourne.sdk.services.lusid.model.ReconciliationBreak
classname ReconciliationBreak
A reconciliation break

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentScope** | **String** | The scope in which the instrument lies. | [optional] [default to String]
**instrumentUid** | **String** | Unique instrument identifier | [default to String]
**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Any other properties that comprise the Sub-Holding Key | [default to Map<String, PerpetualProperty>]
**leftUnits** | **java.math.BigDecimal** | Units from the left hand side | [default to java.math.BigDecimal]
**rightUnits** | **java.math.BigDecimal** | Units from the right hand side | [default to java.math.BigDecimal]
**differenceUnits** | **java.math.BigDecimal** | Difference in units | [default to java.math.BigDecimal]
**leftCost** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**rightCost** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**differenceCost** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**instrumentProperties** | [**List&lt;Property&gt;**](Property.md) | Additional features relating to the instrument | [default to List<Property>]

```java
import com.finbourne.sdk.services.lusid.model.ReconciliationBreak;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String instrumentScope = "example instrumentScope";
String instrumentUid = "example instrumentUid";
Map<String, PerpetualProperty> subHoldingKeys = new Map<String, PerpetualProperty>();
java.math.BigDecimal leftUnits = new java.math.BigDecimal("100.00");
java.math.BigDecimal rightUnits = new java.math.BigDecimal("100.00");
java.math.BigDecimal differenceUnits = new java.math.BigDecimal("100.00");
CurrencyAndAmount leftCost = new CurrencyAndAmount();
CurrencyAndAmount rightCost = new CurrencyAndAmount();
CurrencyAndAmount differenceCost = new CurrencyAndAmount();
List<Property> instrumentProperties = new List<Property>();


ReconciliationBreak reconciliationBreakInstance = new ReconciliationBreak()
    .instrumentScope(instrumentScope)
    .instrumentUid(instrumentUid)
    .subHoldingKeys(subHoldingKeys)
    .leftUnits(leftUnits)
    .rightUnits(rightUnits)
    .differenceUnits(differenceUnits)
    .leftCost(leftCost)
    .rightCost(rightCost)
    .differenceCost(differenceCost)
    .instrumentProperties(instrumentProperties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)