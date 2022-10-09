package org._5ibug;

public class test {
    public static void main(String[] args) {
        DeerPush deerPush = new DeerPush.Builder("PDU16651TCejf5mNQlAdqZXTAjiB1kBwmLI3cAQzD")
                .url("https://api2.pushdeer.com")
                .type("text")
                .build();
        System.out.printf(deerPush.send("测试推送111"));
    }
}
