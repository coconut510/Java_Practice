package kh.java.server.model.vo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientInfo {
	private int portNum;
	private String id;
	private int index;
	private DataInputStream dis = null;
	private DataOutputStream dos = null;
	private ServerSocket  serverSocket;
	private Socket clientSocket;	
	
	public ClientInfo() {}
	public ClientInfo(String id, int portNum)
	{
		this.id = id;
		this.portNum = portNum;
	}
	public int getIndex() {return index;}
	public void setIndex(int index) {this.index = index;}
	public int getPortNum() {
		return portNum;
	}
	public void setPortNum(int portNum) {
		this.portNum = portNum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public DataInputStream getDis() {
		return dis;
	}
	public void setDis(DataInputStream dis) {
		this.dis = dis;
	}
	public DataOutputStream getDos() {
		return dos;
	}
	public void setDos(DataOutputStream dos) {
		this.dos = dos;
	}
	public ServerSocket getServerSocket() {
		return serverSocket;
	}
	public void setServerSocket(ServerSocket serverSocket) {
		this.serverSocket = serverSocket;
	}
	public Socket getClientSocket() {
		return clientSocket;
	}
	public void setClientSocket(Socket clientSocket) {
		this.clientSocket = clientSocket;
	}
	
}
