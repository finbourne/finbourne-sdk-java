# com.finbourne.sdk.services.lusid.model.AllocationEventNoticeWire
classname AllocationEventNoticeWire
Wire instructions for the payment a notice asks for or announces, from the investor record's payment  instructions. Absent when the investor record holds none.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankName** | **String** | The name of the bank. | [optional] [default to String]
**accountName** | **String** | The name on the account. | [optional] [default to String]
**accountNumber** | **String** | The account number or IBAN. | [optional] [default to String]
**bic** | **String** | The bank identifier code. | [optional] [default to String]
**reference** | **String** | The payment reference. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEventNoticeWire;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String bankName = "example bankName";
@javax.annotation.Nullable String accountName = "example accountName";
@javax.annotation.Nullable String accountNumber = "example accountNumber";
@javax.annotation.Nullable String bic = "example bic";
@javax.annotation.Nullable String reference = "example reference";


AllocationEventNoticeWire allocationEventNoticeWireInstance = new AllocationEventNoticeWire()
    .bankName(bankName)
    .accountName(accountName)
    .accountNumber(accountNumber)
    .bic(bic)
    .reference(reference);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)