# com.finbourne.sdk.services.lusid.model.JournalEntryLineShareClassBreakdown
classname JournalEntryLineShareClassBreakdown
The apportionment from overall fund level journal entry Line to the share class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shortCode** | **String** | The share class identifier. | [optional] [default to String]
**apportionmentFactor** | **java.math.BigDecimal** | The share class apportionment factor (capital ratio). | [optional] [default to java.math.BigDecimal]
**localValue** | **java.math.BigDecimal** | This journal entry line&#39;s local value amount after apportionment is applied. | [optional] [default to java.math.BigDecimal]
**baseValue** | **java.math.BigDecimal** | This journal entry line&#39;s base value amount after apportionment is applied | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.JournalEntryLineShareClassBreakdown;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String shortCode = "example shortCode";
java.math.BigDecimal apportionmentFactor = new java.math.BigDecimal("100.00");
java.math.BigDecimal localValue = new java.math.BigDecimal("100.00");
java.math.BigDecimal baseValue = new java.math.BigDecimal("100.00");


JournalEntryLineShareClassBreakdown journalEntryLineShareClassBreakdownInstance = new JournalEntryLineShareClassBreakdown()
    .shortCode(shortCode)
    .apportionmentFactor(apportionmentFactor)
    .localValue(localValue)
    .baseValue(baseValue);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)