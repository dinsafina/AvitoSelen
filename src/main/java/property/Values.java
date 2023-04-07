package property;

public class Values {
    private String url;
    private long implicit_wait;
    private long explicit_wait;

    public Values(String url, long implicit_wait, long explicit_wait) {
        this.url = url;
        this.implicit_wait = implicit_wait;
        this.explicit_wait = explicit_wait;
    }

    public String getUrl() {
        return url;
    }

    public long getImplicit_wait() {
        return implicit_wait;
    }

    public long getExplicit_wait() {
        return explicit_wait;
    }
}
