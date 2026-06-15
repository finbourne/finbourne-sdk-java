# com.finbourne.sdk.services.lusid.model.GroupReconciliationCoreAttributeValues
classname GroupReconciliationCoreAttributeValues

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**leftCoreAttributes** | [**List&lt;ComparisonAttributeValuePair&gt;**](ComparisonAttributeValuePair.md) | Core attribute names and values for the left hand entity being reconciled. | [default to List<ComparisonAttributeValuePair>]
**rightCoreAttributes** | [**List&lt;ComparisonAttributeValuePair&gt;**](ComparisonAttributeValuePair.md) | Core attribute names and values for the right hand entity being reconciled. | [default to List<ComparisonAttributeValuePair>]

```java
import com.finbourne.sdk.services.lusid.model.GroupReconciliationCoreAttributeValues;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<ComparisonAttributeValuePair> leftCoreAttributes = new List<ComparisonAttributeValuePair>();
List<ComparisonAttributeValuePair> rightCoreAttributes = new List<ComparisonAttributeValuePair>();


GroupReconciliationCoreAttributeValues groupReconciliationCoreAttributeValuesInstance = new GroupReconciliationCoreAttributeValues()
    .leftCoreAttributes(leftCoreAttributes)
    .rightCoreAttributes(rightCoreAttributes);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)