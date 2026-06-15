# com.finbourne.sdk.services.lusid.model.FeeRuleUpsertRequest
classname FeeRuleUpsertRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** |  | [optional] [default to String]
**transactionPropertyKey** | **String** |  | [default to String]
**transactionType** | **String** |  | [default to String]
**country** | **String** |  | [default to String]
**counterparty** | **String** |  | [default to String]
**transactionCurrency** | **String** |  | [default to String]
**settlementCurrency** | **String** |  | [default to String]
**executionBroker** | **String** |  | [default to String]
**custodian** | **String** |  | [default to String]
**exchange** | **String** |  | [default to String]
**fee** | [**CalculationInfo**](CalculationInfo.md) |  | [default to CalculationInfo]
**minFee** | [**CalculationInfo**](CalculationInfo.md) |  | [optional] [default to CalculationInfo]
**maxFee** | [**CalculationInfo**](CalculationInfo.md) |  | [optional] [default to CalculationInfo]
**additionalKeys** | **Map&lt;String, String&gt;** |  | [optional] [default to Map<String, String>]
**description** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.FeeRuleUpsertRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String code = "example code";
String transactionPropertyKey = "example transactionPropertyKey";
String transactionType = "example transactionType";
String country = "example country";
String counterparty = "example counterparty";
String transactionCurrency = "example transactionCurrency";
String settlementCurrency = "example settlementCurrency";
String executionBroker = "example executionBroker";
String custodian = "example custodian";
String exchange = "example exchange";
CalculationInfo fee = new CalculationInfo();
CalculationInfo minFee = new CalculationInfo();
CalculationInfo maxFee = new CalculationInfo();
@javax.annotation.Nullable Map<String, String> additionalKeys = new Map<String, String>();
@javax.annotation.Nullable String description = "example description";


FeeRuleUpsertRequest feeRuleUpsertRequestInstance = new FeeRuleUpsertRequest()
    .code(code)
    .transactionPropertyKey(transactionPropertyKey)
    .transactionType(transactionType)
    .country(country)
    .counterparty(counterparty)
    .transactionCurrency(transactionCurrency)
    .settlementCurrency(settlementCurrency)
    .executionBroker(executionBroker)
    .custodian(custodian)
    .exchange(exchange)
    .fee(fee)
    .minFee(minFee)
    .maxFee(maxFee)
    .additionalKeys(additionalKeys)
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)