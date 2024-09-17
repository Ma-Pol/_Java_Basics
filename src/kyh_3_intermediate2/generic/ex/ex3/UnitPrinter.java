package kyh_3_intermediate2.generic.ex.ex3;

import kyh_3_intermediate2.generic.ex.ex3.unit.BioUnit;

public class UnitPrinter {
    static <T extends BioUnit> void printV1(Shuttle<T> shuttle) {
        shuttle.showInfo();
    }

    static void printV2(Shuttle<? extends BioUnit> shuttle) {
        shuttle.showInfo();
    }
}
