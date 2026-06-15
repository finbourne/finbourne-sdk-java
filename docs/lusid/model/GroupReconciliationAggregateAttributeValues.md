# com.finbourne.sdk.services.lusid.model.GroupReconciliationAggregateAttributeValues
classname GroupReconciliationAggregateAttributeValues

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**leftAggregateAttributes** | [**List&lt;ComparisonAttributeValuePair&gt;**](ComparisonAttributeValuePair.md) | Aggregate attribute names and values for the left hand entity being reconciled. | [default to List<ComparisonAttributeValuePair>]
**rightAggregateAttributes** | [**List&lt;ComparisonAttributeValuePair&gt;**](ComparisonAttributeValuePair.md) | Aggregate attribute names and values for the right hand entity being reconciled. | [default to List<ComparisonAttributeValuePair>]

```java
import com.finbourne.sdk.services.lusid.model.GroupReconciliationAggregateAttributeValues;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<ComparisonAttributeValuePair> leftAggregateAttributes = new List<ComparisonAttributeValuePair>();
List<ComparisonAttributeValuePair> rightAggregateAttributes = new List<ComparisonAttributeValuePair>();


GroupReconciliationAggregateAttributeValues groupReconciliationAggregateAttributeValuesInstance = new GroupReconciliationAggregateAttributeValues()
    .leftAggregateAttributes(leftAggregateAttributes)
    .rightAggregateAttributes(rightAggregateAttributes);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)