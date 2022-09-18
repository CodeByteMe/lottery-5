package site.sanniu.domain.activity.service.partake;

import site.sanniu.domain.activity.model.req.PartakeReq;
import site.sanniu.domain.activity.model.vo.ActivityBillVO;
import site.sanniu.domain.activity.repository.IActivityRepository;

import javax.annotation.Resource;

/**
 * @Author sanniu
 * @Description //TODO $
 * @Date $ $
 **/
public class ActivityPartakeSupport {

    @Resource
    protected IActivityRepository activityRepository;

    protected ActivityBillVO queryActivityBill(PartakeReq req){
        return activityRepository.queryActivityBill(req);
    }

}

