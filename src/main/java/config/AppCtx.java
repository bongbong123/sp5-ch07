package config;

import aspect.ExeTimeAspect;
import controller.ImpeCalculator;
import controller.RecCalculator;
import inter.Calculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppCtx {

    @Bean
    public ExeTimeAspect exeTimeAspect(){
        return new ExeTimeAspect();
    }

    @Bean
    public Calculator calculator() {
        return new RecCalculator();
    }
}
