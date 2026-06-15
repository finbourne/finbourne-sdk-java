# com.finbourne.sdk.services.lusid.model.PartialClosureConstituent
classname PartialClosureConstituent
A single constituent of a partial closure event for a Flexible Repo. Contains details of the collateral  being exchanged in the Instrument field, represented as a NewInstrument object,  as well as the amount being exchanged and the type of that amount (Units or Percentage of current units).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **java.math.BigDecimal** | If AmountType is set to Units, this field represents the number of units of the instrument being exchanged.  If AmountType is set to Percentage, this field represents the percentage of the total repoed units of the instrument being exchanged.  When defining a FlexibleRepoPartialClosureEvent the AmountType can be set to either Units or Percentage,  where Units represents the number of units of the instrument being exchanged, and Percentage represents the  percentage of the total repoed units of the instrument being exchanged in the context of the FlexibleRepo. | [default to java.math.BigDecimal]
**amountType** | **String** | The type of amount represented by the Amount field.  I.e., does it represent a number of units or a percentage of the total repoed units of the instrument?  When defining a FlexibleRepoPartialClosureEvent AmountType can be set to either Units or Percentage. Available values: Percentage, Units. | [default to String]
**instrument** | [**NewInstrument**](NewInstrument.md) |  | [default to NewInstrument]

```java
import com.finbourne.sdk.services.lusid.model.PartialClosureConstituent;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
String amountType = "example amountType";
NewInstrument instrument = new NewInstrument();


PartialClosureConstituent partialClosureConstituentInstance = new PartialClosureConstituent()
    .amount(amount)
    .amountType(amountType)
    .instrument(instrument);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)