package org._5ibug;

import org._5ibug.utils.HttpUtil;

public class DeerPush {
    /* api地址 非必须，默认为官方地址*/
    private String url;
    /* key 必须*/
    private final String key;
    /* 类型 可选text,image,markdown*/
    private String type;

    private DeerPush(Builder builder) {
        this.key = builder.key;
        this.type = builder.type;
        this.url = builder.url;
    }

    public String send(String text) {
        return HttpUtil.sendGet(String.format("%s/message/push?pushkey=%s&type=%s&text=%s",this.url,this.key,this.type,text));
    }


    public static class Builder {
        private final String key;
        /* 类型 可选text,image,markdown*/
        private String type = "text";
        /* api地址 非必须，默认为官方地址*/
        private String url = "https://api2.pushdeer.com";

        public Builder(String key) {
            this.key = key;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public DeerPush build() {
            return new DeerPush(this);
        }
    }
}
