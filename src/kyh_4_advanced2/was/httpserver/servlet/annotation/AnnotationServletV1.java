package kyh_4_advanced2.was.httpserver.servlet.annotation;

import kyh_4_advanced2.was.httpserver.HttpRequest;
import kyh_4_advanced2.was.httpserver.HttpResponse;
import kyh_4_advanced2.was.httpserver.HttpServlet;
import kyh_4_advanced2.was.httpserver.PageNotFoundException;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class AnnotationServletV1 implements HttpServlet {
    private final List<Object> controllers;

    public AnnotationServletV1(List<Object> controllers) {
        this.controllers = controllers;
    }


    @Override
    public void service(HttpRequest request, HttpResponse response) throws IOException {
        String path = request.getPath();

        // 전체 컨트롤러를 순회
        for (Object controller : controllers) {
            // 전체 컨트롤러의 모든 메서드를 조회
            Method[] methods = controller.getClass().getDeclaredMethods();

            // 전체 메서드를 순회
            for (Method method : methods) {
                // 메서드에 @Mapping 애노테이션이 붙어있는지 확인
                if (method.isAnnotationPresent(Mapping.class)) {
                    // 메서드의 @Mapping 애노테이션 정보를 조회
                    Mapping mapping = method.getAnnotation(Mapping.class);
                    // @Mapping 애노테이션의 value 값을 조회
                    String value = mapping.value();

                    // value 값이 요청된 path와 동일한지 확인
                    if (value.equals(path)) {
                        // path와 동일한 value 값을 가진 메서드를 실행
                        invoke(controller, method, request, response);
                        return;
                    }
                }
            }
        }

        // 모든 컨트롤러를 조회했음에도 일치하는 path가 존재하지 않음
        throw new PageNotFoundException("request=" + path);
    }

    private void invoke(Object controller, Method method, HttpRequest request, HttpResponse response) {
        try {
            method.invoke(controller, request, response);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
