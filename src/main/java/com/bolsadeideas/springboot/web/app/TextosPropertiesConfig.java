package com.bolsadeideas.springboot.web.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration //Con esta anotación marcamos una clase de configuracion de Spring
@PropertySources({
	@PropertySource("classpath:textos.properties")
})
public class TextosPropertiesConfig {

}
