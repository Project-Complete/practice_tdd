package org.example.tdd.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Membership {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private String userId;

    @Column()
    private String membershipName;

    @Column()
    private Integer point;

    @Builder
    public Membership(String userId, String membershipName, Integer point) {
        this.userId = userId;
        this.membershipName = membershipName;
        this.point = point;
    }
}
