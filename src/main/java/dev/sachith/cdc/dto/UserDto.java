package dev.sachith.cdc.dto;

import dev.sachith.cdc.domain.enums.UserType;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    @NotEmpty(message = "User name cannot be blank")
    private String name;

    @NotNull(message = "User Type must be present")
    private UserType type;

    @NotNull(message = "User Registered Date must be present")
    private LocalDate registeredDate;

}
