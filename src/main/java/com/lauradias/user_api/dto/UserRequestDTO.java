package com.lauradias.user_api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public class UserRequestDTO {

    @NotBlank(message = "Informe o nome do usuário.")
    private String name;

    @NotBlank(message = "Informe o e-mail do usuário.")
    @Email(message = "Informe um e-mail válido.")
    private String email;

    @Min(value = 18, message = "A idade mínima aceita é 18 anos.")
    @NotNull(message = "Informe a idade do usuário.")
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
