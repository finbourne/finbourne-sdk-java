# com.finbourne.sdk.services.identity.model.SystemLog
classname SystemLog
A system log event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actor** | [**LogActor**](LogActor.md) |  | [optional] [default to LogActor]
**authenticationContext** | [**LogAuthenticationContext**](LogAuthenticationContext.md) |  | [optional] [default to LogAuthenticationContext]
**clientInfo** | [**LogClientInfo**](LogClientInfo.md) |  | [optional] [default to LogClientInfo]
**debugContext** | [**LogDebugContext**](LogDebugContext.md) |  | [optional] [default to LogDebugContext]
**displayMessage** | **String** | Represents a DisplayMessage resource in the Okta API | [optional] [default to String]
**eventType** | **String** | Represents a EventType resource in the Okta API | [optional] [default to String]
**legacyEventType** | **String** | Represents a LegacyEventType resource in the Okta API | [optional] [default to String]
**outcome** | [**LogOutcome**](LogOutcome.md) |  | [optional] [default to LogOutcome]
**published** | [**OffsetDateTime**](OffsetDateTime.md) | Represents when Published in the Okta API | [optional] [default to OffsetDateTime]
**request** | [**LogRequest**](LogRequest.md) |  | [optional] [default to LogRequest]
**securityContext** | [**LogSecurityContext**](LogSecurityContext.md) |  | [optional] [default to LogSecurityContext]
**severity** | [**LogSeverity**](LogSeverity.md) |  | [optional] [default to LogSeverity]
**target** | [**List&lt;LogTarget&gt;**](LogTarget.md) | Represents a LogTarget resource in the Okta API | [optional] [default to List<LogTarget>]
**transaction** | [**LogTransaction**](LogTransaction.md) |  | [optional] [default to LogTransaction]
**uuid** | **String** | Represents Uuid in the Okta API | [optional] [default to String]
**version** | **String** | Represents a Version in the Okta API | [optional] [default to String]

```java
import com.finbourne.sdk.services.identity.model.SystemLog;
import java.util.*;
import java.lang.System;
import java.net.URI;

LogActor actor = new LogActor();
LogAuthenticationContext authenticationContext = new LogAuthenticationContext();
LogClientInfo clientInfo = new LogClientInfo();
LogDebugContext debugContext = new LogDebugContext();
@javax.annotation.Nullable String displayMessage = "example displayMessage";
@javax.annotation.Nullable String eventType = "example eventType";
@javax.annotation.Nullable String legacyEventType = "example legacyEventType";
LogOutcome outcome = new LogOutcome();
@javax.annotation.Nullable OffsetDateTime published = OffsetDateTime.now();
LogRequest request = new LogRequest();
LogSecurityContext securityContext = new LogSecurityContext();
LogSeverity severity = new LogSeverity();
@javax.annotation.Nullable List<LogTarget> target = new List<LogTarget>();
LogTransaction transaction = new LogTransaction();
@javax.annotation.Nullable String uuid = "example uuid";
@javax.annotation.Nullable String version = "example version";


SystemLog systemLogInstance = new SystemLog()
    .actor(actor)
    .authenticationContext(authenticationContext)
    .clientInfo(clientInfo)
    .debugContext(debugContext)
    .displayMessage(displayMessage)
    .eventType(eventType)
    .legacyEventType(legacyEventType)
    .outcome(outcome)
    .published(published)
    .request(request)
    .securityContext(securityContext)
    .severity(severity)
    .target(target)
    .transaction(transaction)
    .uuid(uuid)
    .version(version);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)