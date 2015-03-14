package demo;

import javax.annotation.Resource;
import javax.xml.transform.Templates;

import com.codahale.metrics.ConsoleReporter;
import com.codahale.metrics.MetricRegistry;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {
    @Resource(name = "redisTemplate")
    private ListOperations<String, String> listOps;
    @Autowired
    @Resource(name = "redisTemplate")
    private RedisTemplate template;

    public void test() {
        //SpringApplication.run(Application.class, args);
    	listOps.leftPush("zsf","Fuck");
    	System.out.println(listOps.leftPop("zsf"));
    	System.out.println("ok");
    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//    	//listOps.set("zsf", 1,"fuck");
//    	listOps.leftPush("zsf","Fuck");
//    	System.out.println(listOps.leftPop("zsf"));
//    	System.out.println("ok");
//        ConsoleReporter reporter = ConsoleReporter.forRegistry(metrics)
//                .convertRatesTo(SECONDS)
//                .convertDurationsTo(MILLISECONDS)
//                .build();
//        reporter.start(1, SECONDS);
//        while (true) {
//            metrics
//                    .meter("main")
//                    .mark();
//            template
//                    .boundSetOps("main")
//                    .add(randomAlphanumeric(10));
//        }
//    }
}
