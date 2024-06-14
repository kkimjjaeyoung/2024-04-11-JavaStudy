/*
 * 서버 만들기
 * 	1. 접속을 받는 클래스 생성(클라이언트 정보 저장 : ip, port 등)
 * 	2. 접속된 클라이언트마다 통신 담당 클래스 생성(한번에 제작 여러개가 동시에 수행 : 쓰레드)
 * 		자바 : 쓰레드 2개(main/gc)
 */

package com.sist.server;
import java.util.*;
import java.io.*;
import java.net.*;

public class Server implements Runnable{
	//접속 담당(교환소켓)
	/*
	 * 1. ServerSokcet 생성
	 * 		bind : 연결	->	ip와 port 매칭
	 * 		listen : 대기상태
	 * 2. 대기중 클라이언트 접속
	 * 		accept() : 사용자 정보 수집 후 메모리에 저장	->	사용자 정보와 쓰레드 매칭후 통신
	 * 3. 종료 요청 
	 * 		Thread 종료
	 */
	/*
	 * 결정 : 서버컴퓨터, 연결선(숫자) : 0~65535	0~1023, 8080, 1521, 1433, 4000 사용중
	 * 		3조 : 4852
	 */
	private ServerSocket ss;
	private final int PORT=4582;
	//클라이언트 정보 저장(ip, port, id, name, sex) -> Oracle에서 정보 가져온다
	private Vector<client> waitVc=new Vector<client>();
	public Server() {
		try {
			ss=new ServerSocket(PORT, 50);			//default값 50명
			System.out.println("Server Start");
			//클라이언트 접속대기
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	//접속시 클라이언트 정보 확인 후 저장. Thread가 동작하는 메소드
	public void run() {
		try {
			while(true) {
				//접속이 된 경우
				Socket s=ss.accept();	//접속자의 ip 받아와 저장.	
				//->Socket : 클라이언트 정보 저장 영역(ip, port)
				/*
				 * 서버 : ServerSocket -> Port : 고정
				 * 클라이언트 : Socket -> Port 자동 설정
				 */
				System.out.println("접속 IP"+ s.getInetAddress().getHostAddress()); 	//
				System.out.println("포트번호"+ s.getPort());
				OutputStream out=s.getOutputStream();		//s=클라이언트
				out.write("서버 접속 성공\n.".getBytes()); 		//getBytes로 전송
				client client=new client(s);
				waitVc.add(client);
				
			}
		}catch(Exception ex) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server=new Server();
		new Thread(server).start();
	}
//프로그램 안에서 여러개의 프로그램을 동시에 수행 -> 프로세스 -> 여러개 쓰레드가 동시에 수행
	//통신 담당.
	//server가 가지는 모든 변수/메소드를 사용 가능
	class client extends Thread{
		String id;
		Socket s;
		OutputStream out;		//클라이언트 전송
		BufferedReader in;		//클라이언트 전송요청 받기
		public client(Socket s) {
			try {
				this.s=s;		//클라이언트의 메모리 공간
				out=s.getOutputStream();	
				in=new BufferedReader(new InputStreamReader( s. getInputStream()));
			}catch(Exception ex) {}
		}
		//통신 역할
		public void run() {
			try {
				//1. 클라이언트 요청을 받는다
				String msg=in.readLine();
				//2.서버에 응답
				for(client client:waitVc) {		//접속한 모든이에게 문자 출력
					client.out.write((msg+"\n").getBytes());
				}
			}catch(Exception ex) {}
		}
	}
	
}
