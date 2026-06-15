# com.finbourne.sdk.services.access.model.SelectorDefinition
classname SelectorDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metadataSelectorDefinition** | [**MetadataSelectorDefinition**](MetadataSelectorDefinition.md) |  | [optional] [default to MetadataSelectorDefinition]
**idSelectorDefinition** | [**IdSelectorDefinition**](IdSelectorDefinition.md) |  | [optional] [default to IdSelectorDefinition]
**matchAllSelectorDefinition** | [**MatchAllSelectorDefinition**](MatchAllSelectorDefinition.md) |  | [optional] [default to MatchAllSelectorDefinition]
**policySelectorDefinition** | [**PolicySelectorDefinition**](PolicySelectorDefinition.md) |  | [optional] [default to PolicySelectorDefinition]

```java
import com.finbourne.sdk.services.access.model.SelectorDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

MetadataSelectorDefinition metadataSelectorDefinition = new MetadataSelectorDefinition();
IdSelectorDefinition idSelectorDefinition = new IdSelectorDefinition();
MatchAllSelectorDefinition matchAllSelectorDefinition = new MatchAllSelectorDefinition();
PolicySelectorDefinition policySelectorDefinition = new PolicySelectorDefinition();


SelectorDefinition selectorDefinitionInstance = new SelectorDefinition()
    .metadataSelectorDefinition(metadataSelectorDefinition)
    .idSelectorDefinition(idSelectorDefinition)
    .matchAllSelectorDefinition(matchAllSelectorDefinition)
    .policySelectorDefinition(policySelectorDefinition);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)