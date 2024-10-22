package events;
public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("Z://file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("farazahsan357@gmail.com"));
        editor.events.subscribe("open", new SMSSupportListener(" 0316-0905228", "Ahsan faraz"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}