# com.finbourne.sdk.services.lusid.model.ComponentTransaction
classname ComponentTransaction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** |  | [default to String]
**condition** | **String** |  | [optional] [default to String]
**transactionFieldMap** | [**TransactionFieldMap**](TransactionFieldMap.md) |  | [default to TransactionFieldMap]
**transactionPropertyMap** | [**List&lt;TransactionPropertyMap&gt;**](TransactionPropertyMap.md) |  | [default to List<TransactionPropertyMap>]
**preserveTaxLotStructure** | **Boolean** | Controls if tax lot structure should be preserved when cost base is transferred to a new holding. For example in Spin Off instrument events. | [optional] [default to Boolean]
**marketOpenTimeAdjustments** | **List&lt;String&gt;** |  | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.ComponentTransaction;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
@javax.annotation.Nullable String condition = "example condition";
TransactionFieldMap transactionFieldMap = new TransactionFieldMap();
List<TransactionPropertyMap> transactionPropertyMap = new List<TransactionPropertyMap>();
@javax.annotation.Nullable Boolean preserveTaxLotStructure = true;
@javax.annotation.Nullable List<String> marketOpenTimeAdjustments = new List<String>();


ComponentTransaction componentTransactionInstance = new ComponentTransaction()
    .displayName(displayName)
    .condition(condition)
    .transactionFieldMap(transactionFieldMap)
    .transactionPropertyMap(transactionPropertyMap)
    .preserveTaxLotStructure(preserveTaxLotStructure)
    .marketOpenTimeAdjustments(marketOpenTimeAdjustments);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)