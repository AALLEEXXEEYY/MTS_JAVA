package api.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
@Getter
public class RegisterSuccess {
    private String email;

    private String password;
}
