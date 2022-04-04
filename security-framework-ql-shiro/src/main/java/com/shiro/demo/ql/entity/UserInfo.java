package com.shiro.demo.ql.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@EntityListeners(AuditingEntityListener.class)
@Table(name = "tb_userinfo")
public class UserInfo {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "user_name",nullable = false)
    private String userName;

    @Column(name = "user_tel",nullable = false)
    private String userTel;

    @Column(name = "user_pwd",nullable = false)
    private String userPwd;

    @Column(name = "user_createtime",nullable = false)
    private Date createdTime;

    @Column(name = "user_del",nullable = false)
    private String userDel;

    @Column(name = "user_locked",nullable = false)
    private String userLocked;

}
