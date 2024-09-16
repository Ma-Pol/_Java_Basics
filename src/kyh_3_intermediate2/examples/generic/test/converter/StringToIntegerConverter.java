package kyh_3_intermediate2.examples.generic.test.converter;

public class StringToIntegerConverter implements Converter<String, Integer> {
    @Override
    public Integer convert(String input) {
        return Integer.valueOf(input);
    }
}