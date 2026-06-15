# com.finbourne.sdk.services.lusid.model.ComplianceRule
classname ComplianceRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** |  | [default to String]
**code** | **String** |  | [default to String]
**displayName** | **String** |  | [default to String]
**type** | **String** | Available values: RangeNumberSecurities, RangePercentSecurityType, RangePercentCash, RangePercentPropertyKey. | [default to String]
**propertyKey** | **String** |  | [optional] [default to String]
**value** | **String** |  | [optional] [default to String]
**addressKey** | **String** |  | [optional] [default to String]
**lowerBound** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**upperBound** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**schedule** | **String** | Available values: PreTrade, PostTrade, PreAndPostTrade. | [default to String]
**hardRequirement** | **Boolean** |  | [default to Boolean]
**targetPortfolioIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [default to List<ResourceId>]
**description** | **String** |  | [optional] [default to String]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scope = "example scope";
String code = "example code";
String displayName = "example displayName";
String type = "example type";
@javax.annotation.Nullable String propertyKey = "example propertyKey";
@javax.annotation.Nullable String value = "example value";
@javax.annotation.Nullable String addressKey = "example addressKey";
java.math.BigDecimal lowerBound = new java.math.BigDecimal("100.00");
java.math.BigDecimal upperBound = new java.math.BigDecimal("100.00");
String schedule = "example schedule";
Boolean hardRequirement = true;
List<ResourceId> targetPortfolioIds = new List<ResourceId>();
@javax.annotation.Nullable String description = "example description";
Version version = new Version();


ComplianceRule complianceRuleInstance = new ComplianceRule()
    .scope(scope)
    .code(code)
    .displayName(displayName)
    .type(type)
    .propertyKey(propertyKey)
    .value(value)
    .addressKey(addressKey)
    .lowerBound(lowerBound)
    .upperBound(upperBound)
    .schedule(schedule)
    .hardRequirement(hardRequirement)
    .targetPortfolioIds(targetPortfolioIds)
    .description(description)
    .version(version);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)