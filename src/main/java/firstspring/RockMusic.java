package firstspring;


import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{

    private RockMusic(){}

    public static RockMusic getNewRockMusic(){
        System.out.println("CREATE ROCK MUSICCCS");
        return new RockMusic();
    }

    @Override
    public String getSong() {
        return "Toxcity";
    }
}
