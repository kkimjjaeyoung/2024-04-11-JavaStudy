package com.sist.dao;
import java.util.*;
import lombok.Data;
//오라클 데이터를 받아 윈도우/브라우저에 전송할 목적
/*
 * 데이터베이스 데이터형과 매칭
 */

@Data
public class BoardVO {
	private int no, hit;
	private String name, subject, content, pwd;
	private Date regdate;
}
