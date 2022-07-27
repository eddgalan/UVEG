/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto5;

/**
 *
 * @author eddga
 */
public class ThreadRunner extends Thread{
    private Runner runner;
    private Messenger messenger;
    
    public ThreadRunner(Runner runner, Messenger messenger){
        super();
        this.runner = runner;
        this.messenger = messenger;
    }
    
    @Override
    public void run() {
        long speed = (long) this.runner.getSpeed() * 1000;
        try {
            Thread.sleep(speed);
        }catch (Exception e) {
            System.out.println(e);
        }
        this.messenger.getMessage(this.runner.getName() + " - Tiempo: " + this.runner.getSpeed() + "segundos\n");
    }
    
}
