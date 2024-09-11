package kyh_3_intermediate1.nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter();
        NestedOuter.Nested nested = new NestedOuter.Nested();

        nested.print();

        System.out.println("nestedClass = " + nested.getClass());
        // kyh_3_intermediate1.nested.nested.NestedOuter
        System.out.println("outerClass = " + outer.getClass());
        // kyh_3_intermediate1.nested.nested.NestedOuter$Nested
    }
}
