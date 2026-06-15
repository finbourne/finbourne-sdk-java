# com.finbourne.sdk.services.lusid.model.FxConventions
classname FxConventions
The conventions for the calculation of FX fixings, where the fixing rate is expected to be the amount of  DomCcy per unit of FgnCcy.  As an example, assume the required fixing is the WM/R 4pm mid closing rate for the USD amount per 1 EUR.  This is published with RIC EURUSDFIXM=WM, which would be the FixingReference, with FgnCcy EUR and DomCcy USD.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fgnCcy** | **String** | The foreign currency | [default to String]
**domCcy** | **String** | The domestic currency | [default to String]
**fixingReference** | **String** | The reference name used to find the desired quote | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.FxConventions;
import java.util.*;
import java.lang.System;
import java.net.URI;

String fgnCcy = "example fgnCcy";
String domCcy = "example domCcy";
String fixingReference = "example fixingReference";


FxConventions fxConventionsInstance = new FxConventions()
    .fgnCcy(fgnCcy)
    .domCcy(domCcy)
    .fixingReference(fixingReference);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)