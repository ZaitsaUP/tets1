package firstspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.MissingFormatArgumentException;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
          "applicationContext.xml"
        );


        Music rockMusic = context.getBean("rockMusicBean", RockMusic.class);
        System.out.println(rockMusic.getSong());
        context.close();
    }
}
