package com.sist.dao;
import java.util.*;
import lombok.Data;

@Data
public class CartVO {
	private int cno,gno,price, account;
	private String id;
	private Date regdate;
	private GoodsVO gvo=new GoodsVO();
}
