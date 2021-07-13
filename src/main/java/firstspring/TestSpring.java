package firstspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.MissingFormatArgumentException;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassicalMusic classicalMusic = context.getBean("someClassicalMusic", ClassicalMusic.class);
        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);
        AlternativeMusic alternativeMusic = context.getBean("alternativeMusic", AlternativeMusic.class);
        System.out.println(classicalMusic.getSong());
        System.out.println(rockMusic.getSong());
        System.out.println(alternativeMusic.getSong());
    }
}
