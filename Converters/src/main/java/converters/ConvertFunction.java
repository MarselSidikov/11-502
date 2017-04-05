package converters;

public interface ConvertFunction<Dto> {
    Dto convert(Object ... models);
}
