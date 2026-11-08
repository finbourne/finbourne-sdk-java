# com.finbourne.sdk.services.luminesce.model.ExportConditionalRule
classname ExportConditionalRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operator** | [**ExportRuleOperator**](ExportRuleOperator.md) |  | [default to ExportRuleOperator]
**value** | **String** |  | [optional] [default to String]
**valueTo** | **String** |  | [optional] [default to String]
**valueColumn** | **String** |  | [optional] [default to String]
**valueToColumn** | **String** |  | [optional] [default to String]
**sourceColumn** | **String** |  | [optional] [default to String]
**effect** | [**ExportRuleEffect**](ExportRuleEffect.md) |  | [default to ExportRuleEffect]
**color** | [**ExportRuleColor**](ExportRuleColor.md) |  | [optional] [default to ExportRuleColor]
**hex** | **String** |  | [optional] [default to String]
**text** | **String** |  | [optional] [default to String]
**format** | **String** |  | [optional] [default to String]
**includeAggregates** | **Boolean** |  | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.luminesce.model.ExportConditionalRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

ExportRuleOperator @javax.annotation.Nullable String value = "example value";
@javax.annotation.Nullable String valueTo = "example valueTo";
@javax.annotation.Nullable String valueColumn = "example valueColumn";
@javax.annotation.Nullable String valueToColumn = "example valueToColumn";
@javax.annotation.Nullable String sourceColumn = "example sourceColumn";
ExportRuleEffect ExportRuleColor @javax.annotation.Nullable String hex = "example hex";
@javax.annotation.Nullable String text = "example text";
@javax.annotation.Nullable String format = "example format";
Boolean includeAggregates = true;


ExportConditionalRule exportConditionalRuleInstance = new ExportConditionalRule()
    .operator(operator)
    .value(value)
    .valueTo(valueTo)
    .valueColumn(valueColumn)
    .valueToColumn(valueToColumn)
    .sourceColumn(sourceColumn)
    .effect(effect)
    .color(color)
    .hex(hex)
    .text(text)
    .format(format)
    .includeAggregates(includeAggregates);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)