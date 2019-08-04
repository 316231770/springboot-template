package com.talkweb.tangjia.springboot_restful_singlemodule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
public class ConfigurationForTiles {
	/**
	 * apache tiles 配置类
	 * @return
	 */
	@Bean
    public TilesConfigurer tilesConfigurer() {
        final TilesConfigurer configurer = new TilesConfigurer();
        configurer.setDefinitions(new String[] { "tiles/tiles.xml" });
        configurer.setCheckRefresh(true);
        return configurer;
    }
	
	/**
	 * springweb tiles视图解析器
	 * @return
	 */
	@Bean
    public TilesViewResolver tilesViewResolver() {
        final TilesViewResolver resolver = new TilesViewResolver();
        resolver.setViewClass(TilesView.class);
        return resolver;
    }
}
