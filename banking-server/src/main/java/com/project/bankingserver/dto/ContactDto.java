package com.project.bankingserver.dto;


import com.project.bankingserver.models.Contact;
import com.project.bankingserver.models.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class ContactDto {

  private Integer id;

  private String firstname;

  private String lastname;

  private String email;

  private String iban;

  private Integer userId;

  public static ContactDto fromEntity(Contact contact) {
    return ContactDto.builder()
        .id(contact.getId())
        .firstname(contact.getFirstname())
        .lastname(contact.getLastname())
        .email(contact.getEmail())
        .iban(contact.getIban())
        .userId(contact.getUser().getId())
        .build();

  }

  public static Contact toEntity(ContactDto contact) {
    return Contact.builder()
        .id(contact.getId())
        .firstname(contact.getFirstname())
        .lastname(contact.getLastname())
        .email(contact.getEmail())
        .iban(contact.getIban())
        .user(
            User.builder()
               // .id(contact.getUserId())
                .build()
        )
        .build();
  }

}
