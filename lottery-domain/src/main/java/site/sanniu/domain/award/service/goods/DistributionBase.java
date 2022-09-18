package site.sanniu.domain.award.service.goods;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import site.sanniu.domain.award.repository.IOrderRepository;

import javax.annotation.Resource;

/**
 * @Author sanniu
 * @Description 配送货物基础共用类
 * @Date $ $
 **/
public class DistributionBase {

    protected Logger logger = LoggerFactory.getLogger(DistributionBase.class);

    @Resource
    private IOrderRepository awardRepository;

    protected void updateUserAwardState(String uId, Long orderId, String awardId, Integer grantState) {
        awardRepository.updateUserAwardState(uId, orderId, awardId, grantState);
    }

}

