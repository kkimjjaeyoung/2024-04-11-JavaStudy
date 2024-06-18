package com.sist.dao;
//ID : PWD, NAME, SEX, BIRTHDAY, POST ,ADDR1, ADDR2, PHONE, EMAIL, CONTENT, REGDATE, ADMIN
import java.util.*;
import lombok.Data;

@Data
public class MemberVO {
	private String id, pwd, name, sex, phone, post, addr1, addr2, email, birthday, empno, admin;
}
