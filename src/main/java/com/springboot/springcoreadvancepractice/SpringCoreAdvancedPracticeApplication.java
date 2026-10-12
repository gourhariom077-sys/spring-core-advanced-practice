package com.springboot.springcoreadvancepractice;

import com.springboot.springcoreadvancepractice.ReaderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringCoreAdvancedPracticeApplication {

    public static void main(String[] args) {

        //ConfigurableApplicationContext context =SpringApplication.run(SpringCoreAdvancedPracticeApplication.class, args);     //for tight coupling and loose coupling

        //ReaderService service = context.getBean(ReaderService.class);

        //service.startReading();

        //context.close();



        //SpringApplication.run(SpringCoreAdvancedPracticeApplication.class, args);     //For circular dependency




//        ConfigurableApplicationContext context = SpringApplication.run(SpringCoreAdvancedPracticeApplication.class, args);    //for IOC and DI
//Writer writer =  context.getBean(Writer.class);
//writer.doWriting();
//context.close();



//       ConfigurableApplicationContext context = SpringApplication.run(SpringCoreAdvancedPracticeApplication.class, args);   //For eager lazy
//       context.getBean(EagerLazy.class);
//       context.getBean(LazyBean.class);
//       context.close();


//        ConfigurableApplicationContext context = SpringApplication.run(SpringCoreAdvancedPracticeApplication.class, args);    // for Scope
//        ScopeDemo obj1 = context.getBean(ScopeDemo.class);
//        ScopeDemo obj2 = context.getBean(ScopeDemo.class);
//        System.out.println(obj1 == obj2);


        ConfigurableApplicationContext context = SpringApplication.run(SpringCoreAdvancedPracticeApplication.class, args);  //for bean lifecycle
        context.getBean(BeanLifeCycleDemo.class);
        context.close();

    }
}