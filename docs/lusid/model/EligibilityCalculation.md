# com.finbourne.sdk.services.lusid.model.EligibilityCalculation
classname EligibilityCalculation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entitlementDate** | **String** |  | [default to String]
**eligibleUnits** | **String** | Available values: TotalUnits, SettledUnits, NotApplicable. | [default to String]
**dateModifiableByInstruction** | **Boolean** |  | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.EligibilityCalculation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String entitlementDate = "example entitlementDate";
String eligibleUnits = "example eligibleUnits";
Boolean dateModifiableByInstruction = true;


EligibilityCalculation eligibilityCalculationInstance = new EligibilityCalculation()
    .entitlementDate(entitlementDate)
    .eligibleUnits(eligibleUnits)
    .dateModifiableByInstruction(dateModifiableByInstruction);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)