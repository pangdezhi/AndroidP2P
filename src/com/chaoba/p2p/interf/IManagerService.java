package com.chaoba.p2p.interf;


public interface IManagerService extends Sender{
	public void startServer(String serverName,boolean openFileServer);

	public void stopServer();

	public void findServer();

	public void connectServer(String serverName,boolean connectFileServer);

	public void unConnectServer();

	public void registCallback(IManagerServiceCallback callback);

	public void unRegistCallback();

}
