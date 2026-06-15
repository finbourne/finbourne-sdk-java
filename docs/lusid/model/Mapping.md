# com.finbourne.sdk.services.lusid.model.Mapping
classname Mapping
Defines the rule set to be used to determine if entries should be considered as a match.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope for this mapping. | [default to String]
**code** | **String** | The code for this mapping. | [default to String]
**name** | **String** | The mapping name | [default to String]
**reconciliationType** | **String** | What type of reconciliation this mapping is for. Available values: Transaction, Holding, Valuation, Cash, CashHolding. | [default to String]
**rules** | [**List&lt;MappingRule&gt;**](MappingRule.md) | The rules in this mapping, keyed by the left field/property name | [optional] [default to List<MappingRule>]

```java
import com.finbourne.sdk.services.lusid.model.Mapping;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scope = "example scope";
String code = "example code";
String name = "example name";
String reconciliationType = "example reconciliationType";
@javax.annotation.Nullable List<MappingRule> rules = new List<MappingRule>();


Mapping mappingInstance = new Mapping()
    .scope(scope)
    .code(code)
    .name(name)
    .reconciliationType(reconciliationType)
    .rules(rules);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)