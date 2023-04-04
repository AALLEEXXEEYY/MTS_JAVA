package Api;

public class Reg_norm {
    private Integer id;
    private String token;

    public Reg_norm(Integer id, String token) {
        this.id = id;
        this.token = token;
    }

    public Integer getId() {
        return id;
    }

    public String getToken() {
        return token;
    }
}
