package com.kodilla.patterns2.facade;

import com.kodilla.patterns2.facade.api.OrderDto;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FascadeAspect {
    Logger LOGGER = LoggerFactory.getLogger(FascadeAspect.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" + "&&args(orderDto , userId)&&target(object)")
    public void fascadeWatcher(OrderDto orderDto, Long userId, Object object) {
        LOGGER.info("Method processOrder in class " + object.getClass() + " with arguments " + orderDto + " " + userId + " has been run");
    }
}
