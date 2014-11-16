package com.euclid.socket;

public class Client {
	private String name;
	private int port;
	private String ipaddress;
	public Client(String name,String ipaddress,int port){
		this.name= name;
		this.port= port;
		this.ipaddress=ipaddress;
	}
	public String getName() {
		return name;
	}
	public int getPort() {
		return port;
	}
	public String getIpaddress() {
		return ipaddress;
	}
}
