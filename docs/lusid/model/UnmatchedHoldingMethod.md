# com.finbourne.sdk.services.lusid.model.UnmatchedHoldingMethod
classname UnmatchedHoldingMethod
When holdings adjustments are specified for a single effective date,  any holdings for the portfolio not included in the adjustments are  adjusted according to this value.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UnmatchedHoldingMethod** | [**String**](.md) | **When holdings adjustments are specified for a single effective date,  any holdings for the portfolio not included in the adjustments are  adjusted according to this value.** | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.UnmatchedHoldingMethod;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of UnmatchedHoldingMethod:
UnmatchedHoldingMethod method = UnmatchedHoldingMethod.POSITION_TO_ZERO;
UnmatchedHoldingMethod method = UnmatchedHoldingMethod.KEEP_THE_SAME;
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)