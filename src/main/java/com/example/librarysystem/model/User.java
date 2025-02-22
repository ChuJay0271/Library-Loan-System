/* 
package com.example.librarysystem.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Data;

@Entity
@Data
@Table(name = "user")  // 
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;  //  ID
    

    @Column(nullable = false)
    private String password;  // 密碼
    
    @Column(nullable = false)
    private String userName;  // 使用者名稱
    
    @Column(nullable = false)
    private LocalDateTime registrationTime;  // 註冊日期時間
    
    private LocalDateTime lastLoginTime;  // 最後登入時間
}
    */
