package com.sist.dao;
/*
 *  ID  
 PWD
 NAME
 SEX
 BIRTHDAY
 POST
 ADDR1
 ADDR2
 PHONE
 EMAIL
 CONTENT
 REGDATE
 ADMIN
 */
import java.util.*;

import lombok.Data;
import oracle.sql.CHAR;
@Data
public class MemberVO {
   private String id,pwd,name,sex, post,addr1,addr2,phone,email,admin, birthday;
   private int empno;
}