# com.finbourne.sdk.services.lusid.model.ComplianceComparison
classname ComplianceComparison
A single leaf comparison the check criterion made, re-evaluated for this group. A result of null is a comparison the  group held no data for (the criterion short-circuited past it).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**predicate** | **String** |  | [default to String]
**left** | [**ComplianceComparisonOperand**](ComplianceComparisonOperand.md) |  | [default to ComplianceComparisonOperand]
**operator** | **String** |  | [default to String]
**right** | [**ComplianceComparisonOperand**](ComplianceComparisonOperand.md) |  | [default to ComplianceComparisonOperand]
**passed** | **Boolean** | Whether this leaf met its criterion for the group: true where it held, false for a breaching leaf. Absent for a  comparison the group carried no data for (the criterion short-circuited past it). | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceComparison;
import java.util.*;
import java.lang.System;
import java.net.URI;

String predicate = "example predicate";
ComplianceComparisonOperand left = new ComplianceComparisonOperand();
String operator = "example operator";
ComplianceComparisonOperand right = new ComplianceComparisonOperand();
@javax.annotation.Nullable Boolean passed = true;


ComplianceComparison complianceComparisonInstance = new ComplianceComparison()
    .predicate(predicate)
    .left(left)
    .operator(operator)
    .right(right)
    .passed(passed);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)