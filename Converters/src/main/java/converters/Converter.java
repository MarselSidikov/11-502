package converters;

public class Converter {
    public static <Dto> Dto convert(ConvertFunction<Dto> function, Object ... models) {
        return function.convert(models);
    }
}
