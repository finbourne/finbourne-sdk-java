# com.finbourne.sdk.services.lusid.model.VolSurfaceShiftDefinition
classname VolSurfaceShiftDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scenarioShiftType** | **String** | Available values: RateCurveShiftDefinition, FxShiftDefinition, PriceShiftDefinition, VolSurfaceShiftDefinition, MdkrGroupShiftDefinition. | [default to String]
**instrument** | **String** |  | [default to String]
**amount** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**strike** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**expiry** | **String** |  | [optional] [default to String]
**shiftType** | **String** | Available values: Absolute, Relative. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.VolSurfaceShiftDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String instrument = "example instrument";
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal strike = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String expiry = "example expiry";
String shiftType = "example shiftType";


VolSurfaceShiftDefinition volSurfaceShiftDefinitionInstance = new VolSurfaceShiftDefinition()
    .instrument(instrument)
    .amount(amount)
    .strike(strike)
    .expiry(expiry)
    .shiftType(shiftType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)