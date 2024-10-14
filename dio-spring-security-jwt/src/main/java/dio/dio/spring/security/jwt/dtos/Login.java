package dio.dio.spring.security.jwt.dtos;

import lombok.Data;

@Data
public class Login {
    private String username;
    private String password;    
}
