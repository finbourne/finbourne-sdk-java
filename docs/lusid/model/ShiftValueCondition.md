# com.finbourne.sdk.services.lusid.model.ShiftValueCondition
classname ShiftValueCondition
A condition on a curve point's own unshifted value gating whether a curve shift applies  there. A point that fails the condition is left exactly as it is. Kept open-ended: further  conditions (bounds other than zero, say) extend this enum rather than adding fields.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ShiftValueCondition** | [**String**](.md) | **A condition on a curve point&#39;s own unshifted value gating whether a curve shift applies  there. A point that fails the condition is left exactly as it is. Kept open-ended: further  conditions (bounds other than zero, say) extend this enum rather than adding fields.** | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ShiftValueCondition;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of ShiftValueCondition:
ShiftValueCondition method = ShiftValueCondition.ANY;
ShiftValueCondition method = ShiftValueCondition.POSITIVE;
ShiftValueCondition method = ShiftValueCondition.NEGATIVE;
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)