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
@Table(name = "tb_userrole")
public class UserRoles {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "userid", nullable = false)
    private String userId;

    @Column(name = "roleid", nullable = false)
    private String roleId;

    @Column(name = "createtime",nullable = false)
    private Date createTime;

    @Column(name = "del",nullable = false)
    private String del;
}
