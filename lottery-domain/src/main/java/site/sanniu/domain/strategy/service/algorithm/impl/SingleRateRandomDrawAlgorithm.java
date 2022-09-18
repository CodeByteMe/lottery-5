package site.sanniu.domain.strategy.service.algorithm.impl;

import org.springframework.stereotype.Service;
import site.sanniu.domain.strategy.service.algorithm.BaseAlgorithm;

import java.util.List;

/**
 * @Author sanniu
 * @Description 单项随机概率抽奖，抽到一个已经排掉的奖品则未中奖
 * @Date $ $
 **/
@Service
public class SingleRateRandomDrawAlgorithm extends BaseAlgorithm {

    @Override
    public String randomDraw(Long strategyId, List<String> excludeAwardIds) {

        // 获取策略对应的元祖
        String[] rateTuple = super.rateTupleMap.get(strategyId);
        assert rateTuple != null;

        // 随机索引
        int randomVal = this.generateSecureRandomIntCode(100);
        int idx = super.hashIdx(randomVal);

        // 返回结果
        String awardId = rateTuple[idx];

        // 如果中奖ID命中排除奖品列表，则返回NULL
        if (excludeAwardIds.contains(awardId)) {
            return null;
        }

        return awardId;
    }

}

