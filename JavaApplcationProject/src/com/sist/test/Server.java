package com.sist.test;
import java.util.*;

import javax.sql.*;
import java.io.*;
import java.net.*;
import com.sist.dao.*;
import com.sist.commons.Function;

public class Server implements Runnable{
	//접속담당
	private ServerSocket ss;
	//port : 0~65535
	private final int PORT=3355;
	private MemberDAO dao;
	private ClientMain client;
	
	public Vector<Client> waitVc=new Vector<Client>();
	public Server() {
		//시작하며 서버구동
		try {
			ss=new ServerSocket(PORT);
			dao=MemberDAO.newInstance();		//데이터베이스
			System.out.println("서버 시작...");
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public void run() {			//접속시 접속자 정보를 저장(접속자마다 통신이 따로 수행)
		while(true) {
			try {
				Socket s=ss.accept();		//접속이 된 경우만 호출.	s=클라이언트 정보(ip, port)
				Client client=new Client(s);
				client.start();			//통신 시작
			}catch(Exception ex) {}
		}
	}
	
	public static void main(String[] args) {
		Server server=new Server();
		new Thread(server).start();		//run 호출
	}
	//통신
	class Client extends Thread{
		Socket s;	//클라이언트와 통신하는 기기
		OutputStream out;		//클라이언트에게 전송
		BufferedReader in;
		//개인정보 
		String id, name, sex, pos, admin;
		public Client(Socket s) {
			//변수초기화
			try {
				this.s=s;
				out=s.getOutputStream();
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				//네트워크전송은 1byte단위 전송. 값으 받는 경우는 2byte로 받는다.
				//1byte->2byte로 변경해서 받는 클래스 : 필터스트림(InputStreamReader)
			}catch(Exception ex) {}
		}
		//통신 시작
		public void run() {		//클라이언트마다 따로 동작
			while(true) {
				try {
					//클라이언트의 요청값 수령
					String msg=in.readLine();
					StringTokenizer st=new StringTokenizer(msg, "|");
					//100|id
					int protocol=Integer.parseInt(st.nextToken());
					switch(protocol) {
					case Function.LOGIN:{
						//ID받기
						id=st.nextToken();
						//정보
						MemberVO vo=dao.memberInfo(id);
						name=vo.getName();
						sex=vo.getSex();
						pos="대기실";
						admin=vo.getAdmin();
						
						//이미 접속된 회원에게 지금 접속한 회원의 정보 전송
						messageAll(Function.LOGIN+"|"+id+"|"+name+"|"+sex+"|"+pos+"|"+admin);
						messageAll(Function.CHAT+"|[-->>알림]"+name+"님이 입장하셨습니다");
						waitVc.add(this);
						
						//1.창 갱신
						messageTo(Function.MYLOG+"|"+id+"|"+name);	//Login창->waitroom창 
						
						//2.이미 접속된 회원의 모든 정보를 받는다
						for(Client client:waitVc) {
							messageTo(Function.LOGIN+"|"+client.id+"|"+client.name+"|"+client.sex+"|"+client.pos+"|"+client.admin);
						}
						
						//3. 개설된 방 정보
						
					}
					break;
					//나가기 요청
					case Function.EXIT: {
						
					}
					break;
					//채팅 요청
					case Function.CHAT: {
						String message=st.nextToken();
						messageTo(Function.CHAT+"|["+name+"]|"+message);
					}
					break;
					}
				}catch(Exception ex) {}
			}
		}
		//접속자 전체로 전송
		public synchronized void messageAll(String msg) {	//synchronized : 동기화
			while(true) {
				try {
					for(Client client:waitVc) {
						client.messageTo(msg);
					}
				}catch(Exception ex) {}
			}
		}
		public synchronized void messageTo(String msg) {
			try {
				out.write((msg+"\n").getBytes());
			}catch(Exception ex) {}
		}
	}
}
