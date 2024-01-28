package com.sr.basic.boot.spring.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Greet {
    @JsonProperty
    private String userName;
    @JsonProperty
    private String message;

    public Greet(GreetBuilder builder) {
        this.userName = builder.userName;;
        this.message = builder.message;
    }

    public static class GreetBuilder {
        private String userName;
        private String message;

        public GreetBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public GreetBuilder setMessage(String message) {
            this.message = message;
            return this;
        }
        public Greet build() {
            return new Greet(this);
        }
    }
}
