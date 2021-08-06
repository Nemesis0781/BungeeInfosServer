package fr.nitram.bungeeinfosserver.communication.redis;

public class RedisCredentials {

    private String adress;
    private String password;
    private Integer port;
    private String client;

    public RedisCredentials(String adress, String password, Integer port) {
        this(adress, password, port, "bungee_access");
    }

    public RedisCredentials(String adress, String password, Integer port, String client) {
        this.adress = adress;
        this.password = password;
        this.port = port;
        this.client = client;
    }

    public String getAdress() {
        return adress;
    }

    public String getPassword() {
        return password;
    }

    public Integer getPort() {
        return port;
    }

    public String getClient() {
        return client;
    }

    public String toURL() {
        return "redis://" + adress + ":" + port;
    }
}