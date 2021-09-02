/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serverwofacade;

import myfacade.MyFacade;

public class ServerWOFacade {
    public static void main(String[] args) {
        MyFacade obj = MyFacade.getMyFacadeObj();
        obj.newScheduleServer();
        obj.start();
	System.out.println("Start working......");
	System.out.println("After work done.........");
	obj.stop();
    }
    
}
