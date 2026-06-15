# com.finbourne.sdk.services.lusid.model.ValuationsReconciliationRequest
classname ValuationsReconciliationRequest
Specification for the reconciliation request. Left and Right hand sides are constructed. Each consists of a valuation of a portfolio  using an aggregation request. The results of this can then be compared to each other. The difference, which is effectively a risk based  difference allows comparison of the effects of changing a recipe, valuation date, or (though it may or may not make logical sense) a portfolio.  For instance, one might look at the difference in risk caused by the addition of transaction to a portfolio, or through changing the valuation  methodology or system.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | [**ValuationRequest**](ValuationRequest.md) |  | [default to ValuationRequest]
**right** | [**ValuationRequest**](ValuationRequest.md) |  | [default to ValuationRequest]
**leftToRightMapping** | [**List&lt;ReconciliationLeftRightAddressKeyPair&gt;**](ReconciliationLeftRightAddressKeyPair.md) | The mapping from property keys requested by left aggregation to property keys on right hand side | [optional] [default to List<ReconciliationLeftRightAddressKeyPair>]
**preserveKeys** | **List&lt;String&gt;** | List of keys to preserve (from rhs) in the diff. Used in conjunction with filtering/grouping.  If two values are equal, for a given key then the value is elided from the results. Setting it here  will preserve it (takes the values from the RHS and puts it into the line by line results). | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.ValuationsReconciliationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ValuationRequest left = new ValuationRequest();
ValuationRequest right = new ValuationRequest();
@javax.annotation.Nullable List<ReconciliationLeftRightAddressKeyPair> leftToRightMapping = new List<ReconciliationLeftRightAddressKeyPair>();
@javax.annotation.Nullable List<String> preserveKeys = new List<String>();


ValuationsReconciliationRequest valuationsReconciliationRequestInstance = new ValuationsReconciliationRequest()
    .left(left)
    .right(right)
    .leftToRightMapping(leftToRightMapping)
    .preserveKeys(preserveKeys);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)