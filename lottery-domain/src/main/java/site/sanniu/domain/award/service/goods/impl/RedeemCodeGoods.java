package site.sanniu.domain.award.service.goods.impl;

import org.springframework.stereotype.Component;
import site.sanniu.common.Constants;
import site.sanniu.domain.award.model.req.GoodsReq;
import site.sanniu.domain.award.model.res.DistributionRes;
import site.sanniu.domain.award.service.goods.DistributionBase;
import site.sanniu.domain.award.service.goods.IDistributionGoods;

/**
 * @Author sanniu
 * @Description 兑换码类商品
 * @Date $ $
 **/
@Component
public class RedeemCodeGoods extends DistributionBase implements IDistributionGoods {

    @Override
    public DistributionRes doDistribution(GoodsReq req) {

        // 模拟调用兑换码
        logger.info("模拟调用兑换码 uId：{} awardContent：{}", req.getuId(), req.getAwardContent());

        // 更新用户领奖结果
        super.updateUserAwardState(req.getuId(), req.getOrderId(), req.getAwardId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());

        return new DistributionRes(req.getuId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());
    }

    @Override
    public Integer getDistributionGoodsName() {
        return Constants.AwardType.RedeemCodeGoods.getCode();
    }

}

