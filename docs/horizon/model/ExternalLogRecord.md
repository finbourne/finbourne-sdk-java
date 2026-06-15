# com.finbourne.sdk.services.horizon.model.ExternalLogRecord
classname ExternalLogRecord
Represents an external log record.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**logid** | **Long** | The unique log identifier. | [default to Long]
**parentlogid** | **Long** | The parent log identifier (null is allowed). | [optional] [default to Long]
**loglevel** | **String** | The log level. | [default to String]
**logstatus** | **String** | The log status. | [default to String]
**sourcerecordtype** | **String** | The source record type. | [optional] [default to String]
**sourceprimaryidtype** | **String** | The source primary ID type. | [optional] [default to String]
**sourceprimaryidvalue** | **String** | The source primary ID value. | [optional] [default to String]
**targetrecordtype** | **String** | The target record type. | [optional] [default to String]
**targetrecordaction** | **String** | The target record action. | [optional] [default to String]
**targetprimaryidtype** | **String** | The target primary ID type. | [optional] [default to String]
**targetprimaryidvalue** | **String** | The target primary ID value. | [optional] [default to String]
**message** | **String** | The log message. | [optional] [default to String]
**messagetype** | **String** | The message type. | [optional] [default to String]
**timestamp** | **String** | The timestamp of the log record. | [default to String]

```java
import com.finbourne.sdk.services.horizon.model.ExternalLogRecord;
import java.util.*;
import java.lang.System;
import java.net.URI;

Long logid = new Long("100.00");
@javax.annotation.Nullable Long parentlogid = new Long("100.00");
String loglevel = "example loglevel";
String logstatus = "example logstatus";
@javax.annotation.Nullable String sourcerecordtype = "example sourcerecordtype";
@javax.annotation.Nullable String sourceprimaryidtype = "example sourceprimaryidtype";
@javax.annotation.Nullable String sourceprimaryidvalue = "example sourceprimaryidvalue";
@javax.annotation.Nullable String targetrecordtype = "example targetrecordtype";
@javax.annotation.Nullable String targetrecordaction = "example targetrecordaction";
@javax.annotation.Nullable String targetprimaryidtype = "example targetprimaryidtype";
@javax.annotation.Nullable String targetprimaryidvalue = "example targetprimaryidvalue";
@javax.annotation.Nullable String message = "example message";
@javax.annotation.Nullable String messagetype = "example messagetype";
String timestamp = "example timestamp";


ExternalLogRecord externalLogRecordInstance = new ExternalLogRecord()
    .logid(logid)
    .parentlogid(parentlogid)
    .loglevel(loglevel)
    .logstatus(logstatus)
    .sourcerecordtype(sourcerecordtype)
    .sourceprimaryidtype(sourceprimaryidtype)
    .sourceprimaryidvalue(sourceprimaryidvalue)
    .targetrecordtype(targetrecordtype)
    .targetrecordaction(targetrecordaction)
    .targetprimaryidtype(targetprimaryidtype)
    .targetprimaryidvalue(targetprimaryidvalue)
    .message(message)
    .messagetype(messagetype)
    .timestamp(timestamp);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)