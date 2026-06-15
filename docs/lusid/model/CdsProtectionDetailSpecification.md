# com.finbourne.sdk.services.lusid.model.CdsProtectionDetailSpecification
classname CdsProtectionDetailSpecification
CDSs generally conform to fairly standard definitions, but can be tweaked in a number of different ways.  This class gathers a number of common features which may deviate. These will default to the market standard when  no overrides are provided.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**seniority** | **String** | The seniority level of the CDS. Default value: SUB. Available values: Unknown, SNR, SUB, JRSUBUT2, PREFT1, SECDOM, SNRFOR, SUBLT2. | [optional] [default to String]
**restructuringType** | **String** | The restructuring clause. Default value: MM. Available values: Unknown, CR, MR, MM, XR, XR14, CR14, MR14, MM14. | [optional] [default to String]
**protectStartDay** | **Boolean** | Does the protection leg pay out in the case of default on the start date. Defaults to true if not set. | [optional] [default to Boolean]
**payAccruedInterestOnDefault** | **Boolean** | Should accrued interest on the premium leg be paid if a credit event occurs. Defaults to true if not set. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.CdsProtectionDetailSpecification;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String seniority = "example seniority";
@javax.annotation.Nullable String restructuringType = "example restructuringType";
Boolean protectStartDay = true;
Boolean payAccruedInterestOnDefault = true;


CdsProtectionDetailSpecification cdsProtectionDetailSpecificationInstance = new CdsProtectionDetailSpecification()
    .seniority(seniority)
    .restructuringType(restructuringType)
    .protectStartDay(protectStartDay)
    .payAccruedInterestOnDefault(payAccruedInterestOnDefault);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)