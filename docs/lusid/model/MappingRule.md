# com.finbourne.sdk.services.lusid.model.MappingRule
classname MappingRule
An individual mapping rule, for mapping between a left and right field/property.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | **String** | The name of the field/property in the left resource (e.g. a transaction) | [optional] [default to String]
**right** | **String** | The name of the field/property in the right resource (e.g. a transaction) | [optional] [default to String]
**comparisonType** | **String** | The type of comparison to be performed | [optional] [default to String]
**comparisonValue** | **java.math.BigDecimal** | The (optional) value used with ComparisonType. | [optional] [default to java.math.BigDecimal]
**weight** | **java.math.BigDecimal** | A factor used to influence the importance of this item. | [optional] [default to java.math.BigDecimal]
**mappedStrings** | [**List&lt;MappedString&gt;**](MappedString.md) | The (optional) value used to map string values. | [optional] [default to List<MappedString>]
**isCaseSensitive** | **Boolean** | Should string comparisons take case into account, defaults to &#x60;false&#x60;. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.MappingRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String left = "example left";
@javax.annotation.Nullable String right = "example right";
@javax.annotation.Nullable String comparisonType = "example comparisonType";
@javax.annotation.Nullable java.math.BigDecimal comparisonValue = new java.math.BigDecimal("100.00");
java.math.BigDecimal weight = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable List<MappedString> mappedStrings = new List<MappedString>();
Boolean isCaseSensitive = true;


MappingRule mappingRuleInstance = new MappingRule()
    .left(left)
    .right(right)
    .comparisonType(comparisonType)
    .comparisonValue(comparisonValue)
    .weight(weight)
    .mappedStrings(mappedStrings)
    .isCaseSensitive(isCaseSensitive);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)