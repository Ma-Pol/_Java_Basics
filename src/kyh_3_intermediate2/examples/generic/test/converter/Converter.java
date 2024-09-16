package kyh_3_intermediate2.examples.generic.test.converter;

public interface Converter<I, O> {
    O convert(I input);
}