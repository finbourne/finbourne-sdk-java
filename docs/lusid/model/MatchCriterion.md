# com.finbourne.sdk.services.lusid.model.MatchCriterion
classname MatchCriterion
A condition to be evaluated.  Each supported CriterionType has a corresponding schema.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**criterionType** | **String** | Available values: PropertyValueEquals, PropertyValueIn, SubHoldingKeyValueEquals. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.MatchCriterion;
import java.util.*;
import java.lang.System;
import java.net.URI;

String criterionType = "example criterionType";


MatchCriterion matchCriterionInstance = new MatchCriterion()
    .criterionType(criterionType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)