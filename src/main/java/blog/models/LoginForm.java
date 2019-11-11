package blog.models;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginForm {
    private static final int MIN_USER_NAME_SIZE = 2;
    private static final int MAX_USER_NAME_SIZE = 50;
    private static final int MIN_PASSWORD_NAME_SIZE = 1;
    private static final int MAX_PASSWORD_NAME_SIZE = 50;

    @Size(min = MIN_USER_NAME_SIZE, max = MAX_USER_NAME_SIZE)
    @Setter
    @Getter
    private String userName;

    @NotNull
    @Size(min = MIN_PASSWORD_NAME_SIZE, max = MAX_PASSWORD_NAME_SIZE)
    @Setter
    @Getter
    private String passWord;
}
