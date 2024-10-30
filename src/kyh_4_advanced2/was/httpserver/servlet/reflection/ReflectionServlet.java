package kyh_4_advanced2.was.httpserver.servlet.reflection;

import kyh_4_advanced2.was.httpserver.HttpRequest;
import kyh_4_advanced2.was.httpserver.HttpResponse;
import kyh_4_advanced2.was.httpserver.HttpServlet;
import kyh_4_advanced2.was.httpserver.PageNotFoundException;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class ReflectionServlet implements HttpServlet {
    private final List<Object> controllers;

    public ReflectionServlet(List<Object> controllers) {
        this.controllers = controllers;
    }

    @Override
    public void service(HttpRequest request, HttpResponse response) throws IOException {
        String path = request.getPath();

        for (Object controller : controllers) {
            Class<?> controllerClass = controller.getClass();
            Method[] methods = controllerClass.getDeclaredMethods();

            for (Method method : methods) {
                String methodName = method.getName();

                if (path.equals("/" + methodName)) {
                    invoke(controller, method, request, response);
                    return;
                }
            }
        }

        throw new PageNotFoundException("request = " + path);
    }

    private static void invoke(Object controller, Method method, HttpRequest request, HttpResponse response) {
        try {
            method.invoke(controller, request, response);
        } catch (InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
