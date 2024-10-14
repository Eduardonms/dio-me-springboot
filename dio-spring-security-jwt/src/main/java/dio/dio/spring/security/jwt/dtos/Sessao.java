package dio.dio.spring.security.jwt.dtos;

import lombok.Data;

@Data
public class Sessao {
    private String login;
    private String token;
}
