package converters;

import dto.HumanDto;
import models.Human;
import models.ServerData;

public class HumanDtoConverter {
    public static HumanDto convert(Human humanModel, ServerData serverData) {
        String message = serverData.getMessage();
        String name = humanModel.getName();
        String childName = humanModel.getChild().getName();

        return new HumanDto(message, name, childName);
    }
}
