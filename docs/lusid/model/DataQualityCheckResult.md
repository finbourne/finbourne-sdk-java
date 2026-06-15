# com.finbourne.sdk.services.lusid.model.DataQualityCheckResult
classname DataQualityCheckResult
Represents the result of a data quality check operation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**checkDefinitionScope** | **String** | The scope of the check definition | [optional] [default to String]
**checkDefinitionCode** | **String** | The code of the check definition | [optional] [default to String]
**checkDefinitionDisplayName** | **String** | The display name of the check definition | [optional] [default to String]
**checkRunAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp when the check was run | [optional] [default to OffsetDateTime]
**resultType** | **String** | The type of result from the check | [optional] [default to String]
**ruleSetKey** | **String** | The key identifying the ruleset | [optional] [default to String]
**ruleSetDisplayName** | **String** | The display name of the ruleset | [optional] [default to String]
**ruleKey** | **String** | The key identifying the rule (for RuleInvalid, RuleBreached, RuleBreachesOverLimit) | [optional] [default to String]
**ruleDisplayName** | **String** | The display name of the rule (for RuleInvalid, RuleBreached, RuleBreachesOverLimit) | [optional] [default to String]
**ruleDescription** | **String** | The description of the rule (for RuleInvalid, RuleBreached, RuleBreachesOverLimit) | [optional] [default to String]
**ruleFormula** | **String** | The formula of the rule (for RuleInvalid, RuleBreached, RuleBreachesOverLimit) | [optional] [default to String]
**severity** | **Integer** | The severity level | [optional] [default to Integer]
**lusidEntity** | [**LusidEntityResult**](LusidEntityResult.md) |  | [optional] [default to LusidEntityResult]
**countRuleBreaches** | **Integer** | The count of rule breaches (1 for RuleBreached, multiple for RuleBreachesOverLimit) | [optional] [default to Integer]
**errorDetail** | **String** | Error details (for RulesetInvalid, RuleInvalid) | [optional] [default to String]
**resultId** | **String** | Unique identifier for the result in format: {{GUID of Check Definition}}-{{resultType}}-{{rulesetKey}}-{{ruleKey}}-{{entity GUID}} | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.DataQualityCheckResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String checkDefinitionScope = "example checkDefinitionScope";
@javax.annotation.Nullable String checkDefinitionCode = "example checkDefinitionCode";
@javax.annotation.Nullable String checkDefinitionDisplayName = "example checkDefinitionDisplayName";
OffsetDateTime checkRunAsAt = OffsetDateTime.now();
@javax.annotation.Nullable String resultType = "example resultType";
@javax.annotation.Nullable String ruleSetKey = "example ruleSetKey";
@javax.annotation.Nullable String ruleSetDisplayName = "example ruleSetDisplayName";
@javax.annotation.Nullable String ruleKey = "example ruleKey";
@javax.annotation.Nullable String ruleDisplayName = "example ruleDisplayName";
@javax.annotation.Nullable String ruleDescription = "example ruleDescription";
@javax.annotation.Nullable String ruleFormula = "example ruleFormula";
@javax.annotation.Nullable Integer severity = new Integer("100.00");
LusidEntityResult lusidEntity = new LusidEntityResult();
@javax.annotation.Nullable Integer countRuleBreaches = new Integer("100.00");
@javax.annotation.Nullable String errorDetail = "example errorDetail";
@javax.annotation.Nullable String resultId = "example resultId";


DataQualityCheckResult dataQualityCheckResultInstance = new DataQualityCheckResult()
    .checkDefinitionScope(checkDefinitionScope)
    .checkDefinitionCode(checkDefinitionCode)
    .checkDefinitionDisplayName(checkDefinitionDisplayName)
    .checkRunAsAt(checkRunAsAt)
    .resultType(resultType)
    .ruleSetKey(ruleSetKey)
    .ruleSetDisplayName(ruleSetDisplayName)
    .ruleKey(ruleKey)
    .ruleDisplayName(ruleDisplayName)
    .ruleDescription(ruleDescription)
    .ruleFormula(ruleFormula)
    .severity(severity)
    .lusidEntity(lusidEntity)
    .countRuleBreaches(countRuleBreaches)
    .errorDetail(errorDetail)
    .resultId(resultId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)