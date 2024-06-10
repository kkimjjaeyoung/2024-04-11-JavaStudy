package com.sist.dao;

import java.util.*;
import lombok.Data;

@Data
public class EmpVO {
	private int empno;
	private String ename, job;
	private Date hiredate;
	private int sal, mgr, comm, detno;
	private DeptVO dvo=new DeptVO();
}
