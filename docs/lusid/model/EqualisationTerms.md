# com.finbourne.sdk.services.lusid.model.EqualisationTerms
classname EqualisationTerms

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **Boolean** |  | [default to Boolean]
**interestRate** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**dayCountConvention** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.EqualisationTerms;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean enabled = true;
@javax.annotation.Nullable java.math.BigDecimal interestRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String dayCountConvention = "example dayCountConvention";


EqualisationTerms equalisationTermsInstance = new EqualisationTerms()
    .enabled(enabled)
    .interestRate(interestRate)
    .dayCountConvention(dayCountConvention);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)