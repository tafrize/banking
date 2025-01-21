package com.project.bankingserver.dto;


import com.project.bankingserver.models.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Ali Bouali
 */
@Getter
@Setter
@AllArgsConstructor
@Builder
public class LightUserDto {

  private Integer id;

  private String firstname;

  /*@NotNull(message = "Le prenom ne doit pas etre vide")
  @NotEmpty(message = "Le prenom ne doit pas etre vide")
  @NotBlank(message = "Le prenom ne doit pas etre vide")
  private String firstname;

  @NotNull(message = "Le nom ne doit pas etre vide")
  @NotEmpty(message = "Le nom ne doit pas etre vide")
  @NotBlank(message = "Le nom ne doit pas etre vide")*/
  private String lastname;

  /*public static LightUserDto fromEntity(User user) {
    // null check
    return LightUserDto.builder()
        .id(user.getId())
        .firstname(user.getFirstname())
        .lastname(user.getLastname())
        .build();
  }

  public static User toEntity(LightUserDto user) {
    // null check
    return User.builder()
        //.id(user.getId())
        .firstname(user.getFirstname())
        .lastname(user.getLastname())
        .build();
  }*/

}
