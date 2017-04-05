import converters.ConvertFunction;
import converters.Converter;
import dto.HumanDto;
import models.Human;
import models.ServerData;
import static converters.Converter.*;
public class Main {
    public static void main(String[] args) {
        Human child = new Human("marsel", "qwerty007", "Marsel", 1, null);
        Human father = new Human("rafael", "qwerty008", "Rafael", 2, child);
        ServerData serverData = new ServerData("02.02.1994", "Hello");

        HumanDto humanDto = convert((models) -> {
            String message = ((ServerData)models[1]).getMessage();
            String name = ((Human)models[0]).getName();
            String childName = ((Human)models[0]).getChild().getName();
            return new HumanDto(message, name, childName);
        }, father, serverData);


        int i = 0;
    }
}
