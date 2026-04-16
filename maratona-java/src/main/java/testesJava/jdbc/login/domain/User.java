package testesJava.jdbc.login.domain;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class User {
    private Integer id;
    private String name;
    private String password;
}
