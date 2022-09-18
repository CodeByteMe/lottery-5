package site.sanniu.domain.rule.service.engine;

import site.sanniu.domain.rule.service.logic.LogicFilter;
import site.sanniu.domain.rule.service.logic.impl.UserAgeFilter;
import site.sanniu.domain.rule.service.logic.impl.UserGenderFilter;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author sanniu
 * @Description //TODO $
 * @Date $ $
 **/
public class EngineConfig {

    protected static Map<String, LogicFilter> logicFilterMap = new ConcurrentHashMap<>();

    @Resource
    private UserAgeFilter userAgeFilter;
    @Resource
    private UserGenderFilter userGenderFilter;

    @PostConstruct
    public void init() {
        logicFilterMap.put("userAge", userAgeFilter);
        logicFilterMap.put("userGender", userGenderFilter);
    }

}

