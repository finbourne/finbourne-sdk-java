# com.finbourne.sdk.services.lusid.model.ComplianceRuleV3GroupResult
classname ComplianceRuleV3GroupResult
The result of one rule for a single evaluated group: its status, the group key identifying it, the  measured value, the unit the value and limits are expressed in, the limits it was checked against, the  portfolios and orders it affects, and, when it could not be assessed, the missing-data details.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | Available values: Passed, Failed, Warning, MissingData. | [optional] [default to String]
**groupKey** | **String** |  | [optional] [default to String]
**measuredValue** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**hardLimit** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**softLimit** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**unit** | **String** | Available values: Absolute, Percentage. | [optional] [default to String]
**affectedPortfolioIds** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**affectedOrderIds** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**missingDataDetails** | **List&lt;String&gt;** |  | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceRuleV3GroupResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String status = "example status";
@javax.annotation.Nullable String groupKey = "example groupKey";
@javax.annotation.Nullable java.math.BigDecimal measuredValue = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal hardLimit = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal softLimit = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String unit = "example unit";
@javax.annotation.Nullable List<String> affectedPortfolioIds = new List<String>();
@javax.annotation.Nullable List<String> affectedOrderIds = new List<String>();
@javax.annotation.Nullable List<String> missingDataDetails = new List<String>();


ComplianceRuleV3GroupResult complianceRuleV3GroupResultInstance = new ComplianceRuleV3GroupResult()
    .status(status)
    .groupKey(groupKey)
    .measuredValue(measuredValue)
    .hardLimit(hardLimit)
    .softLimit(softLimit)
    .unit(unit)
    .affectedPortfolioIds(affectedPortfolioIds)
    .affectedOrderIds(affectedOrderIds)
    .missingDataDetails(missingDataDetails);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)