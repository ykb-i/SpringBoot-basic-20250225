package com.korit.basic.entity;

import com.korit.basic.dto.PatchUserRequestDto;
import com.korit.basic.dto.PostUserRequestDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="user")
@Table(name="user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserEntity {
 
    @Id
    @Column()
    private String userId;

    private String userPassword;

    private String userName;

    private String userAddress;

    private String userTelNumber;

    public UserEntity(PostUserRequestDto dto){
        this.userId = dto.getUserId();
        this.userPassword = dto.getUserPassword();
        this.userName = dto.getUserName();
        this.userAddress = dto.getUserAddress();
        this.userTelNumber = dto.getUserTelNumber();
    }

    public void patch(PatchUserRequestDto dto){
        this.userName = dto.getUserName();
        this.userAddress = dto.getUserAddress();
    }
}
