package filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFilter implements  Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws ServletException, IOException {
        //1 - пользователь не залогинен и он перенаправляется на /login
        //2 - пользователь не залогинен и идет по любой другой ссылке
        //!!!3 - тянутся картинки и файлы css для отображения страницы
        //4 - пользователь залогинен и он переходит по любой ссылке кроме /login
        //5 - пользователь залогинен и он переходит на /login

        HttpServletRequest req = (HttpServletRequest) servletRequest; //приведение типов
        HttpServletResponse resp = (HttpServletResponse) servletResponse; //приведение типов

        String url = req.getRequestURI();
        //если url заканчивается на:
        if (url.endsWith(".css") || url.endsWith(".js")) {
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }


        Object isLogin = req.getSession().setAttribute("isLogin");
        if (isLogin != null && url.endsWith("/login")) {
            resp.sendRedirect("/");
            return;
            ;
        }

        if (isLogin != null && !url.endsWith("/login")) {
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }

        if (url.endsWith("/login")) {//1
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        } else {//2
            resp.sendRedirect("/login");
            return;
        }

    }


    @Override
    public void destroy() {

    }
}