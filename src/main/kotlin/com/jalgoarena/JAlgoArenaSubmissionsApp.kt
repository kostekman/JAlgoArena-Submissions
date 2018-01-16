package com.jalgoarena

import com.jalgoarena.web.CacheController
import com.jalgoarena.web.RankingController
import com.jalgoarena.web.SubmissionsController
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cache.annotation.EnableCaching
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.context.annotation.Bean
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
@EnableCaching(proxyTargetClass=true)
open class JAlgoArenaSubmissionsApp{
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(JAlgoArenaSubmissionsApp::class.java, *args)
        }
    }

    @Bean
    open fun submissionsApi(): Docket? {
        return Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
    }
}




