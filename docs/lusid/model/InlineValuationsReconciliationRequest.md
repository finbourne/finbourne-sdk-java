# com.finbourne.sdk.services.lusid.model.InlineValuationsReconciliationRequest
classname InlineValuationsReconciliationRequest
Specification for the reconciliation request. Left and Right hand sides are constructed. Each consists of a valuation of a inline set of instruments  using an inline aggregation request. The results of this can then be compared to each other. The difference, which is effectively a risk based  difference allows comparison of the effects of changing a recipe, valuation date, or (though it may or may not make logical sense) a set of instruments.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | [**InlineValuationRequest**](InlineValuationRequest.md) |  | [default to InlineValuationRequest]
**right** | [**InlineValuationRequest**](InlineValuationRequest.md) |  | [default to InlineValuationRequest]
**leftToRightMapping** | [**List&lt;ReconciliationLeftRightAddressKeyPair&gt;**](ReconciliationLeftRightAddressKeyPair.md) | The mapping from property keys requested by left aggregation to property keys on right hand side | [optional] [default to List<ReconciliationLeftRightAddressKeyPair>]
**preserveKeys** | **List&lt;String&gt;** | List of keys to preserve (from rhs) in the diff. Used in conjunction with filtering/grouping | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.InlineValuationsReconciliationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

InlineValuationRequest left = new InlineValuationRequest();
InlineValuationRequest right = new InlineValuationRequest();
@javax.annotation.Nullable List<ReconciliationLeftRightAddressKeyPair> leftToRightMapping = new List<ReconciliationLeftRightAddressKeyPair>();
@javax.annotation.Nullable List<String> preserveKeys = new List<String>();


InlineValuationsReconciliationRequest inlineValuationsReconciliationRequestInstance = new InlineValuationsReconciliationRequest()
    .left(left)
    .right(right)
    .leftToRightMapping(leftToRightMapping)
    .preserveKeys(preserveKeys);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)