package fr.nitram.commons;

import java.util.UUID;

public class RedisPubSub {

    private UUID uuid;
    private String message;
    private String value;

    public RedisPubSub() {
    }

    public RedisPubSub(UUID uuid, String message, String value) {
        this.uuid = uuid;
        this.message = message;
        this.value = value;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
