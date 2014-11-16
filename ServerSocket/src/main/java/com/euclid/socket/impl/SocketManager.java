package com.euclid.socket.impl;

import java.util.Map;

import com.euclid.socket.Client;

public class SocketManager {
	private static SocketManager m_socket_manager;
	private Map<String,Client> m_clients;
	public SocketManager(){
		
	}
	public static SocketManager getSocketManager(){
		if(m_socket_manager==null)
			m_socket_manager = new SocketManager();
		return m_socket_manager;
	}
	
	public void addClient(Client client){
		if(m_clients.get(client.getName())!=null)
			return;
		m_clients.put(client.getName(), client);
	}
	
}
