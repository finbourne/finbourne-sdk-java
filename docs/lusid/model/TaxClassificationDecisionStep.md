# com.finbourne.sdk.services.lusid.model.TaxClassificationDecisionStep
classname TaxClassificationDecisionStep
One question the decision tree asked on the way to the leaf.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**order** | **Integer** | The position of the step in the decision trace, starting at 1. | [default to Integer]
**rule** | **String** | The decision-tree rule the step evaluated. | [default to String]
**question** | **String** | The question the rule asked of the inputs. | [default to String]
**answer** | **String** | The answer the rule took. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TaxClassificationDecisionStep;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer order = new Integer("100.00");
String rule = "example rule";
String question = "example question";
String answer = "example answer";


TaxClassificationDecisionStep taxClassificationDecisionStepInstance = new TaxClassificationDecisionStep()
    .order(order)
    .rule(rule)
    .question(question)
    .answer(answer);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)