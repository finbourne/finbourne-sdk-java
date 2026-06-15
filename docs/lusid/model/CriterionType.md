# com.finbourne.sdk.services.lusid.model.CriterionType
classname CriterionType
Discriminator for MatchCriterion.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CriterionType** | [**String**](.md) | **Discriminator for MatchCriterion.** | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CriterionType;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of CriterionType:
CriterionType method = CriterionType.PROPERTY_VALUE_EQUALS;
CriterionType method = CriterionType.PROPERTY_VALUE_IN;
CriterionType method = CriterionType.SUB_HOLDING_KEY_VALUE_EQUALS;
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)