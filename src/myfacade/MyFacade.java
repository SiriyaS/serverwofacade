/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfacade;

/**
 *
 * @author siriya_s
 */
public class MyFacade {
    private static MyFacade facadeObj = null;
    private ScheduleServer server = null;
    
    private MyFacade() {}
    
    public static MyFacade getMyFacadeObj() {
        if(facadeObj == null) {
            facadeObj = new MyFacade();
        }
        return facadeObj;
    }
    
    public void newScheduleServer() {
        server = new ScheduleServer();
    }
    
    public void start() {
        server.startBooting();
	server.readSystemConfigFile();
	server.init();
	server.initializeContext();
	server.initializeListeners();
	server.createSystemObjects();
    }
    
    public void stop() {
        server.releaseProcesses();
	server.destroy();
	server.destroySystemObjects();
	server.destoryListeners();
	server.destoryContext();
	server.shutdown();
    }
}
