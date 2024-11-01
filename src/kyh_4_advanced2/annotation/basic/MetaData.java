package kyh_4_advanced2.annotation.basic;

@AnnoMeta // 타입에 적용 가능
public class MetaData {
    //    @AnnoMeta // 필드에 적용 불가 - 컴파일 오류
    private String id;

    @AnnoMeta // 메서드에 적용 가능
    public void call() {
    }

    public static void main(String[] args) throws NoSuchMethodException {
        AnnoMeta typeAnno = MetaData.class.getAnnotation(AnnoMeta.class);
        System.out.println("typeAnno = " + typeAnno);

        AnnoMeta methodAnno = MetaData.class.getMethod("call").getAnnotation(AnnoMeta.class);
        System.out.println("methodAnno = " + methodAnno);
    }
}
