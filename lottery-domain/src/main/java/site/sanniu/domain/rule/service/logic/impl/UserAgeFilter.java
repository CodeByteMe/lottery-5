package site.sanniu.domain.rule.service.logic.impl;

import org.springframework.stereotype.Component;
import site.sanniu.domain.rule.model.req.DecisionMatterReq;
import site.sanniu.domain.rule.service.logic.BaseLogic;

/**
 * @Author sanniu
 * @Description //TODO $
 * @Date $ $
 **/
@Component
public class UserAgeFilter extends BaseLogic {

    @Override
    public String matterValue(DecisionMatterReq decisionMatter) {
        return decisionMatter.getValMap().get("age").toString();
    }

}

