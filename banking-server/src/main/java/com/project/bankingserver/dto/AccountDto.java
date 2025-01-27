package com.project.bankingserver.dto;


import com.project.bankingserver.dto.UserDto;
import com.project.bankingserver.models.Account;
import lombok.*;
import lombok.experimental.SuperBuilder;



@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
public class AccountDto {

  private Integer id;

  private String iban;

  private UserDto user;

  public static AccountDto fromEntity(Account account) {
    return AccountDto.builder()
        .id(account.getId())
        .iban(account.getIban())
        .user(UserDto.fromEntity(account.getUser()))
        .build();
  }

  public static Account toEntity(AccountDto account) {
    return Account.builder()
       // .id(account.getId())
        .iban(account.getIban())
        .user(UserDto.toEntity(account.getUser()))
        .build();

  }
}
