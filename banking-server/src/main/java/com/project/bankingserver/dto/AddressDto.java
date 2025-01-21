package com.project.bankingserver.dto;

import com.project.bankingserver.models.Address;
import com.project.bankingserver.models.User;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@Data
public class AddressDto {


  private Integer id;

  private String street;

  private Integer houseNumber;

  private Integer zipCode;

  private String city;

  private String county;

  private Integer userId;

  /*public static AddressDto fromEntity(Address address) {
    return AddressDto.builder()
        .id(address.getId())
        .street(address.getStreet())
        .houseNumber(address.getHouseNumber())
        .zipCode(address.getZipCode())
        .city(address.getCity())
        //.county(address.getCounty())
        .userId(address.getUser().getId())
        .build();
  }

  public static Address toEntity(AddressDto address) {
    return Address.builder()
        //.id(address.getId())
        .street(address.getStreet())
        .houseNumber(address.getHouseNumber())
        .zipCode(address.getZipCode())
        .city(address.getCity())
        //.county(address.getCounty())
        .user(
            User.builder()
                //.id(address.getUserId())
                .build()
        )
        .build();
  }*/
}
