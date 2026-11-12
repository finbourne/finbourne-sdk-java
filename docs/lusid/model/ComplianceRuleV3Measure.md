# com.finbourne.sdk.services.lusid.model.ComplianceRuleV3Measure
classname ComplianceRuleV3Measure
How a rule reduces its filtered (and optionally grouped) subject rows to the single number a check is  applied to: a metric field, the aggregate combining its values, and what it is expressed relative to.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metric** | **String** |  | [optional] [default to String]
**aggregate** | **String** | Available values: Sum, Min, Max, Average, Count, CountDistinct, WeightedSum, SumAbsolute. | [default to String]
**denominator** | **String** | Available values: None, PortfolioValue, GrossValue, NetValue, FilteredSubsetTotal, GroupNav, GroupGrossExposure, GroupFilteredSubsetTotal. | [optional] [default to String]
**denominatorMetric** | **String** |  | [optional] [default to String]
**weightMetric** | **String** |  | [optional] [default to String]
**denominatorProperty** | **String** |  | [optional] [default to String]
**filter** | [**ComplianceRuleV3FilterNode**](ComplianceRuleV3FilterNode.md) |  | [optional] [default to ComplianceRuleV3FilterNode]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceRuleV3Measure;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String metric = "example metric";
String aggregate = "example aggregate";
@javax.annotation.Nullable String denominator = "example denominator";
@javax.annotation.Nullable String denominatorMetric = "example denominatorMetric";
@javax.annotation.Nullable String weightMetric = "example weightMetric";
@javax.annotation.Nullable String denominatorProperty = "example denominatorProperty";
ComplianceRuleV3FilterNode filter = new ComplianceRuleV3FilterNode();


ComplianceRuleV3Measure complianceRuleV3MeasureInstance = new ComplianceRuleV3Measure()
    .metric(metric)
    .aggregate(aggregate)
    .denominator(denominator)
    .denominatorMetric(denominatorMetric)
    .weightMetric(weightMetric)
    .denominatorProperty(denominatorProperty)
    .filter(filter);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)