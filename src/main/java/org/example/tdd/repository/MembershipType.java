package org.example.tdd.repository;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MembershipType {

    NAVER("네이버"),
    KAKAO("카카오");

    private final String companyName;
}
