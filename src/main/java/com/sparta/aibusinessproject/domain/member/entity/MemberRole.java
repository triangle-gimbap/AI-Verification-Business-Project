package com.sparta.aibusinessproject.domain.member.entity;

import lombok.Getter;

@Getter
public enum MemberRole {
    CUSTOMER(Authority.CUSTOMER),
    OWNER(Authority.OWNER),
    MANAGER(Authority.MANAGER),
    MASTER(Authority.MASTER),
    ;

    private final String authority;

    MemberRole(String authority) {
        this.authority = authority;
    }

    public static class Authority {
        public static final String CUSTOMER = "ROLE_CUSTOMER";
        public static final String OWNER = "ROLE_OWNER";
        public static final String MANAGER = "ROLE_MANAGER";
        public static final String MASTER = "ROLE_MASTER";
    }
}