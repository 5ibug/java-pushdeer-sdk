# java-pushdeer-sdk
## 使用方法
```
DeerPush deerPush = new DeerPush.Builder("PDU16651TCejf5mNQlAdqZXTAjiB1kBwmLI3cAQzD")
                .url("https://api2.pushdeer.com")
                .type("text")
                .build();
deerPush.send("测试推送111");
```
url和type为非必填项,默认url为https://api2.pushdeer.com 默认type为text