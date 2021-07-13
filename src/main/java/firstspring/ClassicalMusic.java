package firstspring;


import org.springframework.stereotype.Component;

@Component("someClassicalMusic")
public class ClassicalMusic implements Music{

    public void doInit(){
        System.out.println("ja init meth from classical music class");
    }

    public void doDestroy(){
        System.out.println("ja destroy meth from classical music class");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }


}
