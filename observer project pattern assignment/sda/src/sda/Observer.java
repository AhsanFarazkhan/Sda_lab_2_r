package sda;
public abstract class Observer {
   protected Subject subject;
   protected boolean active = true;
   public abstract void update();
   
   public void unActive() {
       this.active = false;
   }
   
   public void active() {
       this.active = true;
   }
}