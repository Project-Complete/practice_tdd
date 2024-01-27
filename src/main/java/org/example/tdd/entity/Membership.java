package org.example.tdd.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.tdd.repository.MembershipType;

@NoArgsConstructor
@Getter
@Entity
public class Membership {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private String userId;

    @Enumerated(EnumType.STRING)
    private MembershipType membershipType;

    @Column()
    private Integer point;

    @Builder
    public Membership(String userId, MembershipType membershipType, Integer point) {
        this.userId = userId;
        this.membershipType = membershipType;
        this.point = point;
    }
}
