package com.casvshop.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Esta clase la usaremos en caso de agregar interceptores para mostrar el
 * recorrido de la navegación o quizás simplificar el nombre de los
 * controladores <br>
 * The web application is based on Spring MVC. As a result, you need to
 * configure Spring MVC and set up view controllers to expose these templates.
 * The following listing (from
 * src/main/java/com/example/securingweb/MvcConfig.java) shows a class that
 * configures Spring MVC in the application:
 */
@Configuration
public class MvcConfiguration implements WebMvcConfigurer {
	/**
	 * The addViewControllers() method (which overrides the method of the same name
	 * in WebMvcConfigurer) adds four view controllers
	 */
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/login");
		registry.addViewController("/registration.html");
		registry.addViewController("/home.html");
		registry.addViewController("/successRegister.html");
	}

}
