package sda;

public class ObserverPatternDemo {
   public static void main(String[] args) {
      Subject subject = new Subject();

      Observer ob1 = new HexaObserver(subject);
      Observer ob2 = new OctalObserver(subject);
      Observer ob3 =new BinaryObserver(subject);

      System.out.println("First state change: 15");	
      subject.setState(15);
      System.out.println("Second state change: 10");	
      subject.setState(10);
      System.out.println("Third state change: 10");	
      subject.setState(10);
       System.out.println("");
      ob3.unActive();
      subject.setState(10);
   }
}